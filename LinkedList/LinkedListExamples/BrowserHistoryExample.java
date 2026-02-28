import java.util.LinkedList;
import java.util.Scanner;

class BrowserHistory
{
	private LinkedList<String> backStack=new LinkedList<>();
	private LinkedList<String> forwardStack=new LinkedList<>();
	private String currentPage = "Home";
	
	public void visit(String url)
	{
		backStack.push(currentPage);
		currentPage=url;
		forwardStack.clear();
		System.out.println("Visited : "+currentPage);
	}
	
	public void back()
	{
		if(!backStack.isEmpty())
		{
			forwardStack.push(currentPage);
			currentPage=backStack.pop();
			System.out.println("Back to : "+currentPage);
		}else{
			System.out.println("No pages in history.");
		}
	}
	
	public void forward()
	{
		if(!forwardStack.isEmpty())
		{
			backStack.push(currentPage);
			currentPage=forwardStack.pop();
			System.out.println("Forward to : "+currentPage);
		}else{
			System.out.println("No forward pages.");
		}
	}
	
	public void currentPage()
	{
		System.out.println("Current Page : "+currentPage);
	}
}

class  BrowserHistoryExample
{
	public static void main(String[] args) 
	{
		BrowserHistory bs=new BrowserHistory();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do{
			System.out.println("\n -->Browser History<-- \n\n 1. Visit Page \n\n 2. Back \n\n 3. Forward \n\n 4. Current Page \n\n 5. Exit \n\n");
			
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			System.out.println("\n");
			
			switch(choice)
			{
				case 1:
					System.out.print("Enter Url to Visit : ");
					String visitUrl = sc.nextLine();
					visitUrl = sc.nextLine();
					bs.visit(visitUrl);
					break;
				
				case 2:
					bs.back();
					break;
					
				case 3:
					bs.forward();
					break;
					
				case 4:
					bs.currentPage();
					break;
					
				case 5:
					System.out.println("Exit.");
					break;
				
				default :
					System.out.println("Invalid Choice. Try Again");
					break;
					
			}
		}
		while(choice!=5);
			
		sc.close();
				
	}
}

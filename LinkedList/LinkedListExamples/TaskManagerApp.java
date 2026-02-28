import java.util.LinkedList;
import java.util.Scanner;

class TaskManager
{
	private LinkedList<String> tasks;
	
	public TaskManager()
	{
		tasks = new LinkedList<>();
	}
	
	public void addTask(String task)
	{
		tasks.add(task);
		System.out.println("Added : " + task);
	}
	
	public void completeTask()
	{
		if(!tasks.isEmpty())
		{
			String task=tasks.removeFirst();
			System.out.println("Completed Task : "+ task);
		}
		else{
			System.out.println("No Tasks to complete");
		}
			
	}
	
	public void showTasks()
	{
		if(tasks.isEmpty())
		{
			System.out.println("Your task list is Empty");
		}
		else{
			System.out.println("Your Tasks : ");
			for (int i=0;i<tasks.size();i++)
			{
				System.out.println((i+1)+". "+tasks.get(i));
			}
		}
	}	
}



class TaskManagerApp 
{
	
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		
		TaskManager manager=new TaskManager();
		int choice;
		
		do
		{
			System.out.println("\n\n------->Task Manager<-------\n\n 1. Add Task \n 2. Complete Task \n 3. Show Tasks \n 4. Exit\n");
			System.out.print("Choose a option : ");
			
			choice = scanner.nextInt();
			scanner.nextLine(); //Consume newLine
			
			switch(choice)
			{
				case 1:
					System.out.print("Enter a Task : ");
					String task = scanner.nextLine();
					
					manager.addTask(task);
					break;
					
				case 2:
					manager.completeTask();
					break;
					
				case 3:
					manager.showTasks();
					break;
					
				case 4:
					System.out.println("GoodBye!");
					break;
					
				default:
					System.out.println("Invalid Choice.");
			}
		}
		while (choice != 4);
		
		scanner.close();
	}
}

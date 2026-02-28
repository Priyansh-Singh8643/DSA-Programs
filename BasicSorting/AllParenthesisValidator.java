// Check for all the brackets.

import java.util.Stack;
import java.util.Scanner;

class AllParenthesisValidator 
{
	public static boolean isValid(String s)
	{
		Stack<Character> stack=new Stack<>();
		
		for(char ch:s.toCharArray())
		{
			if (ch=='(' || ch=='{' || ch=='[')
			{
				stack.push(ch);
			}else if(ch==')' || ch=='}' || ch==']')
			{
				if (stack.isEmpty()) return false;
				
				char top=stack.pop();
				
				if(!isMatchingPair(top,ch))
				{
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static boolean isMatchingPair(char open, char close)
	{
		return (open=='(' && close==')') || (open=='{' && close=='}') || (open=='[' && close==']');
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Equation :- ");
		String input=sc.nextLine();
		
		boolean value=isValid(input);
		
		if(value==true)
		{
			System.out.println("Equation is Valid");
		}else{
			System.out.println("Equation is Invalid");
		}
	}
}

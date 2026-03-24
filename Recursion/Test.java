/*Exception in thread "main" java.lang.ArithmeticException: / by zero
        at A.m(Test.java:5)
        at B.n(Test.java:13)
        at Test.main(Test.java:22)*/
		
// This is for the stack for function call. 
// The about error shows that the stack is created on the function call.

class A
{
	static void m()
	{
		System.out.println(5/0);
	}
}

class B
{
	static void n()
	{
		A.m();
		System.out.println("Bye");
	}
}

class Test 
{
	public static void main(String[] args) 
	{
		B.n();
	}
}

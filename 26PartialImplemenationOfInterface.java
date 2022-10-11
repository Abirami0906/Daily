

interface AInterface
{
	void showA();
	void showB();
}

abstract  class  B  implements  AInterface 
{
	public void showA()
	{
		System.out.println("showA() of A interface.");
	}
}

class Test extends B
{
	public void showB()
	{
		System.out.println("showB() of A interface.");
	}
}

class InterfaceTest3
{
	public static void main( String args[ ] )
	{
		AInterface  a1 = new Test();
		a1.showA();
		a1.showB();
	}
}



interface AInterface
{
	int  SIZE = 100;
	void  showA();
}

class Test  implements  AInterface
{
	public void showA()
	{
		System.out.println("showA() of A interface.");
		System.out.println("SIZE = " + SIZE);
	}
}

class  InterfaceTest2
{
	public static void main( String args[ ] )
	{
		AInterface  a1 = new Test();
		a1.showA();
	}
}




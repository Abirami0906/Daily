

enum Colour 
{
	Red(200), Green(150), Blue(100), Black(250), White(175), Orange(225), Yellow(125);
	
	private int price; 		// price of each colour
	
	Colour(int p) 
	{ 
		price = p; 
	}
	
	int getPrice() 
	{ 
		return price; 
	}
}

class EnumDemo3
{
	public static void main(String args[ ])
	{
		Colour c1;
		System.out.println("Green costs " + Colour.Green.getPrice() + " Rs.");
		System.out.println("All Colour's prices: ");
		for(Colour c : Colour.values())
			System.out.println(c + " costs " + c.getPrice() + " Rs.");
	}
}

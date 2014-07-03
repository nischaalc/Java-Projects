class Dog
{
	String name;
	String says;
}

class stringRes
{
	Boolean first;
	Boolean second;
	Boolean third;
}

public class exercises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		int myInt = 12;
		char myChar = 'a';
		
		String stringOne = "test";
		String stringTwo = " another";
		
		Random myRand = new Random(50);
				
		System.out.println(myInt);
		System.out.println(myChar);
		
		System.out.println(stringOne + stringTwo);
		
		System.out.println(myRand.nextInt(1000));
		
		Dog spot = new Dog();
		spot.says = "Woof";
		spot.name = "Spot";
		
		Dog scruff = new Dog();
		scruff.says = "Bark";
		scruff.says = "Scruffy";
		
		Dog test = new Dog();
		
		test = spot;
		
		System.out.println(spot.says);
		System.out.println(spot.name);
		
		System.out.println(spot.equals(test));
		*/
		
	}
	
	static stringRes stringComp(String one, String two)
	{
		Boolean first, second, third;
		
		if (one == two)
			first = true;
		else
			first = false;
		
		if (one != two)
			second = true;
		else 
			second = false;
		
		if (one.equals(two))
			third = true;
		else
			third = false;
		
		
		stringRes Res = new stringRes();
		
		Res.first = first;
		Res.second = second;
		Res.third = third;
		
		return Res;
	}

}

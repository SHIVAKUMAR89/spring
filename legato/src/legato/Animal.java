package legato;

public class Animal {
	private String name;
	private String breed;
	private int age;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getBreed()
	{
		return breed;
	}
	public void setBreed(String breed)
	{
		this.breed=breed;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	Animal()
	{
	
	}

	void getAnimalLifeStyle()
	{
		
		System.out.println("name=" + this.name +"\n"+ "age=" + this.age +"\n"+ "breed=" + this.breed);
	
	}
	public void Reverse() {

		String reverse = "";
		
		
		for(int i = name.length() - 1; i >= 0; i--)
		{
			reverse = reverse + name.charAt(i);
		}
		
		System.out.println("Reversed string is:");
		System.out.println(reverse);
		
}
	
}


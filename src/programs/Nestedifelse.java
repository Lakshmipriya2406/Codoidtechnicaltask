package programs;

public class Nestedifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 50;
		if(age>=10)
		{
			if(age>=40)
			{
				System.out.println("if condition is true print elder");
			}
			else 
			{
				
				System.out.println("if condition fails print younger");
			}
		}
		
			else 
			{
				
				System.out.println("age below 10 is child");
			}
		
		System.out.println("print age is :" +age);
	}

}

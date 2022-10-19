



import java.util.Scanner;

class NestedIfDemo
{
	
	
	
	public static void main(String args[])
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		int age;
		float weight;
		
		
		
		
		System.out.println("Enter your age:");
		age= sc.nextInt();
		
		
	


	if(age>=18)
		{
			
			
			
			System.out.println("Enter your weight:");
		    weight= sc.nextFloat();
			
			
			
			if(weight>=50)
				System.out.println("You can donate the blood....");
		   
		   else
				System.out.println("You are underweight... Please start healthy eating habits");
			
			
		
		}
		
	
	else
			System.out.println("You are too young to donate blood... Please wait!" );
			
		
		 

		 
	}
		
	
}


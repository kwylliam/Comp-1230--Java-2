//***********************
//William Mwangi
//T00622533
//Assignment 4 (HappyPig)
//***************************

public class HappyPig extends Animal{

	//Constructor
	protected HappyPig(String name, String color){
		super(name, color);
	}

	//special methods
	//***************

	protected void sleep(){
		if(health>0){
			System.out.println( name + "Is now sleeping");
		}
		else
		{
			System.out.println(name +" is dead");
		}

		
	} 

	protected void roll(){
		if(health>0){
			System.out.println( name + "Is now rolling");
		}
		else
		{
			System.out.println(name +" is dead");
		}
	}


}

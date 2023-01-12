//***********************
//William Mwangi
//T00622533
//Assignment 4 (WaterFowl)
//***************************

public abstract class WaterFowl extends Animal{

	//Instance Variables
	//******************

	boolean state;

	//Constructor
	//**********

	protected WaterFowl(String name, String color){
		super(name, color);
		state=false;
	}
	
	//getState()
	protected String getState(){
		if (health>0){
			if (state==true){
				return ("flying");
				}
			else{
				return ("not flying");
				}
			}
		else{
			return (name + " is dead");
			}			
		}

	//Special methods
	//***************

	protected void swim(){
		if(health>0){
			System.out.println( name + " is now swimming");
		}
		else
		{
			System.out.println(name +" is dead");
		}
	}

	protected void fly(){
		if(health>0){
			state=true;
			System.out.println( name + " is now flying");
		}
		else
		{
			System.out.println(name +" is dead");
		}
	}

	protected void land(){
		if(health>0){
			state=false;
			System.out.println( name + " has stopped fying");
		}
		else
		{
			System.out.println(name +" is dead");
		}

	}
	
	public String toString(){
		String result = super.toString();
		return (result + "\n State: " +((state==true)? "In flight" : " Not in flight"));
		}

}

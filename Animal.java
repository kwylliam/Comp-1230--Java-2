//***********************
//William Mwangi
//T00622533
//Assignment 4 (Animal)
//***************************

public abstract class Animal{

	//Instance variables
	//******************

	int health;
	public static int count;

	protected String color, name;


	// Constructor
	//************

	protected Animal(String name, String color){
		health=3;
		count++;
		this.color=color;
		this.name=name;
	}

	//Accessors
	//*********

	protected int getHealth(){
		return health;
	}


	protected String getName(){
		return name;
	}

	protected int getCount(){
		return count;
	}

	protected String getColor(){
		return color; 
	}

	//Mutators
	//********

	//Did not includ a setHealth() method because I figured that 
	//the user shouldn't be able to arbitrarily set the health of thier character
	// I also did not include a setcount for the same reason.
	//I alos figured that changeName and changeColor were more intuitive names to the user

	protected void changeName(String name){
		this.name=name;
		System.out.println("Name has been set to "+ "name");
	}

	protected void changeColor(String color){
		color=color; 
		System.out.println("Color has been set to "+ color);
	}

	//Custom methods
	//***************

	protected void hit(){
		if (health>0)
		{
			health--;
			System.out.println("Take cover! you have been hit. Health is now :"+health);
		}

		else{
			System.out.println(name+ " is dead!");
			count--;

		}



	}

	public String toString(){
		return("Character Info: " + "\n"+"***********************\n"+ this.getClass().getSimpleName()+"\n Name: "+name
			+"\nHealth: "+ health + "\nColor: "+ color);
	}





}

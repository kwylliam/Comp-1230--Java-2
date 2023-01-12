//----------------//
// William Mawngi//
//....T00622533..//
//---------------//

//------------------------------------------//
// Custom feature that allows the bakery to //
//recieve birthday cake orders from clients//
// 
//In the interest of not making the code to bulky//
//I did not include exception, price calculation//
// function, and a create your own cake feature
// which would have come in handy.  //
//-----------------------------------------//

import java.util.Scanner;

public class BirthdayCake extends Cake{

	//Instance Variables//
	//------------------//

	String name, message, type, toppings;

	boolean giftWrapped, delivery;

	String size;

	String [] cakes={"Fruit Cake", "Black Forest", "Marble", "Chocolate Fudge", "Red Velvet", "Lemon Cake"};

	String [] top={"plain", "whipped cream", " dark chocolate", "white chocolate", "icing sugar"};

	String [] sz={"large", "medium", "small"};


	//Constructor

	public BirthdayCake(String dateOfBake, int sugarContent, boolean glutenFree){
		super(dateOfBake, sugarContent, glutenFree);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name please");
		name=sc.nextLine();
		System.out.println("What Message would you like on the cake");
		message=sc.nextLine();
		type=chooseCake();
		toppings=chooseTopping();

		delivery=deliver();

		giftWrapped=wrap();

		size= chooseSize();
	}

		


	public String chooseCake(){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number of your desired cake");

		for(int i=0; i<cakes.length; i++){
			System.out.println();
			System.out.println((i+1) + ": " + cakes[i]);
		}

		int num= scan.nextInt();

		String cake=cakes[num-1];

		return cake;

	}

	private String chooseTopping(){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number of your desired topping");

		for(int i=0; i<top.length; i++){
			System.out.println();
			System.out.println((i+1) + ": " + top[i]);
		}

		int num= scan.nextInt();

		String topping=top[num-1];

		return topping;

	}

	private boolean deliver(){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 0 for delivery and 1 for pickup");
		int num= scan.nextInt();
		boolean deliver;

		if (num==0){
			deliver=true;
		}
		else{
			deliver=false;
		}

		return deliver;

	}

	private boolean wrap(){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 0 for gift wrap and 1 for no giftwrap");
		int num= scan.nextInt();
		boolean wrap;

		if (num==0){
			wrap=true;
		}
		else{
			wrap=false;
		}

		return wrap;

	}

	public String chooseSize(){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number of your desired size");

		for(int i=0; i<sz.length; i++){
			System.out.println();
			System.out.println((i+1) + ": " + sz[i]);
		}

		int num= scan.nextInt();

		String size=cakes[num];

		return size;

	}


	//Print an order summary
	public String toString(){

		String summary= ("\t\t"+name+"'s Birthday Cake\n\n"
			+ "Type: "+ type + "\n Message: " + message + "\n Topping: " + toppings+ 
			(giftWrapped==true ? "\nWrapped":"\nNo wrapping")+ (delivery==true ? "\nWill be delivered" : "\nStore Pickup")
			);

			return summary; 

	}


}

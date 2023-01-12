//----------------//
// William Mawngi//
//....T00622533..//
//---------------//
import java.util.*;
public class Bakery{
	public static void main(String[] args) {

		//Create an instance of Shelf class to store any of the bakery products
		
		Shelf shelf1= new Shelf("bread");
		Product item;


		//Create an input loop that asks the user what type of bread they want to add to the shelf

		Scanner sc= new Scanner(System.in);
		String ans;

		do{
			System.out.println("What type of bread would you like to add?");
			String type=sc.nextLine();

			item=(new Bread("08-03", "Super Loaf", type) );
			shelf1.add(item);

			System.out.println("Do you have more input to enter? y or n.");
			ans=sc.nextLine();

		}

		while (ans.equals("y"));

		System.out.println("You have " + item.getProductCount() + "items on the shlef");
		
		//manually create a new glutenFree cake and add it to the shelf
		Cake gFree=new Cake("08-03", 5, true);
		shelf1.add(gFree);
		
		//manually create a new flatBread and set its diameter to 50 and add it to the shelf
		FlatBread flat=new FlatBread("08-03", "Baker's Flats", "Nan", 50);
		
		shelf1.add(flat);
		
		
		
		//Remove the top 3 products on the shelf (latest products) and mark them as sold
		shelf1.remove();
		
		shelf1.remove();
		
		shelf1.remove();
		
		//print total number of products again and check to see if it matches the number of products on shelf
		
		System.out.println ("You have " + item.getProductCount() + " items on the shelf after selling 3");
		
		//Test Birthday Cake custom Feature that lets clients order a birthday cake//
		
		BirthdayCake bday=new BirthdayCake("08-03", 6, false);
		
		System.out.println(bday);
	}




}

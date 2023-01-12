import java.util.Scanner;

public class Exeptions{

	public static void main(String[] args) {

		boolean valid=false;

		while(!valid){
			try{
				getInput();
				valid=true;
			}

			catch(MissingColonExeption ex){
				System.out.println("Your input is missing at least one colon");
				valid=false;
			}

			catch(MissingPartExeption ex){
				System.out.println("Your input is missing at least one section");
				valid=false;
			}
		}

		


	}

	//----------------//
	//getInput method
	//----------------//
	public static void getInput()throws MissingColonExeption, MissingPartExeption{
		Scanner sc=new Scanner(System.in);	
		System.out.println(" Enter the time in 24hr system (hh:mm:ss)");
		String time = sc.nextLine();
		String [] parts = time.split(":", 3);

		if(parts.length < 3){
			throw new MissingColonExeption("This input is missing at least one colon");
		}

		if (parts.length==3){
			for(String i:parts){
				if (i.equals(""))
					throw new MissingPartExeption("Your input is missing a section");
			}
			}

		

		try {
			checkHour(parts);
		}

		catch(HourExeption ex){
			System.out.println("Your hour is either less than 0 or greater than 23");
		}

		catch(NumberFormatException ex){
			System.out.println("Your hour is not a number");
		}

		try{
			checkMinutes(parts);
		}
		catch(MinuteExeption ex){
			System.out.println("Your minutes is either less than 0 or greater than 59");
		}

		catch (NumberFormatException ex){
			System.out.print("your minutes is not a number");
		}

		try{
			checkSeconds(parts);
		}

		catch(SecondExeption ex){
			System.out.println("Your seconds is either less than 0 or greater than 59");
		}

		catch(NumberFormatException ex){
			System.out.print("your seconds is not a number");
		}

		System.out.print("the time is " + 
			((Integer.parseInt(parts[0])>12)? Integer.parseInt(parts[0])-12: parts[0] ) + parts[1] + parts[2]);

	}
	//---------------------//
	//checkHour() method//
	//--------------------//

	public static void checkHour(String [] arr) throws HourExeption{

		int hour=Integer.parseInt(arr[0]);

		if (hour > 23 || hour<0 ){
				throw new HourExeption("Your hour is either less than 0 or greater than 23");
			}

		}


	//----------------------//
	//checkMinutes method//
	//---------------------//

	public static void checkMinutes(String [] arr) throws MinuteExeption{

		int min=Integer.parseInt(arr[1]);

		if (min > 59 || min < 0 ){
				throw new MinuteExeption("Your minutes is either less than 0 or greater than 59");
			}

		}

	//----------------------//
	//checkSeconds method//
	//---------------------//

	public static void checkSeconds(String [] arr) throws SecondExeption{
		int sec=Integer.parseInt(arr[2]);
		if (sec > 59 || sec < 0 ){
			throw new SecondExeption("Your hour is either less than 0 or greater than 59");
			}

		}









}
	



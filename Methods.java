import java.util.Scanner;
public class Methods{

	public static void getInput()throws MissingColonExeption{
		Scanner sc=new Scanner(System.in);	
		System.out.println(" Enter the time in 24hr system (hh:mm:ss)");
		String time = sc.nextLine();
		String [] parts = time.split(":", 3);

		if(parts.length < 3){
			throw new MissingColonExeption("This input is missing at least one colon");
		}

		for(String i: parts){
			System.out.print(i + " ");
		}


		}

	
	}
		
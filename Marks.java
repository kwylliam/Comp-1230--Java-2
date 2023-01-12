//------------------------
//William Mwangi
//T00622533
//Assignment 2
//------------------------
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Marks{

	public static void main(String[] args) throws IOException {
		
		//create a scanner object for the input file
		File file=new File ("students.txt");
		Scanner sc = new Scanner(file);
		
		int rows=sc.nextInt();
		int col=sc.nextInt();
		
		
		//declare the necessary arrays
		int [][] marks=new int [rows][col];

		String [] students= new String [rows];

		double [] studentAvg = new double [rows];

		double [] assAvg = new double[col];
		
		//populate the arrays with data
		
		sc.nextLine(); // switch to the second line
		
		//Populate the student Array		
		for (int i=0; i<rows; i++){
			students[i]=sc.nextLine();
			}
		// Populate the marks array
		for(int i=0; i<marks.length; i++){
			for (int ind=0; ind<marks[i].length; ind++){
				marks[i][ind]=sc.nextInt();
				}
			}
		
		//poulate the student average Array
		
		for(int i=0; i<marks.length; i++){
			double sum=0;
			for (int ind: marks[i]){
				sum+=ind;
				studentAvg[i]=(sum/col);
				}
		}
		
		//populate the assignment avg array with data
		for(int i=0; i<col; i++){
			double sum=0;
			for(int ind=0;ind<rows;ind++){
				sum+=marks[ind][i];
				assAvg[i]=(sum/rows);
				}
		}
		
		//Output
		System.out.println("Student Name\t\t\t"+"Marks out of 10\t\t\t"+"Avg/10");
		System.out.println("             \t\tA1\tA2\tA3\tA4\t");
		
	    for(int i=0;i<rows; i++){
			System.out.print(students[i]+ "\t\t");
			for (int j:marks[i]){
				System.out.print(j+"\t");
				}
			System.out.print("\t"+studentAvg[i]+"\n\n");
		}
		
		System.out.print("AVERAGE\t\t\t");
		for (int i=0; i<assAvg.length; i++){
			System.out.print(assAvg[i]+"\t");
		}


}
}

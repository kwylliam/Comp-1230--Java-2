
//William Mwangi
//T00622533
//Farmer Driver app
//*****************************
import java.util.Scanner;
public class Farmer {
  
  
  public static void main(String[] args) { 
    
    //Create apple and potato feeds
   Feed feedA=new Feed("apple", 20 );
   Feed feedP=new Feed("potato", 15);
   
   //Display the two feeds
   System.out.println(feedA);
   System.out.println(feedP);
   
   
   //Create 3 pigs
   Pig p1=new Pig("m", "black");
   Pig p2=new Pig("f", "pink");
   Pig p3=new Pig("f", "mixed"); 
   
   System.out.print(p1+"\n\n"+p2+"\n\n"+p3+"\n\n");
   
   Scanner sc=new Scanner(System.in);
   boolean ans=true;
   do{
       System.out.println("How many new bins of potato do you have?");
       int numP=sc.nextInt();
       System.out.println("How many new bins of apple do you have?");
       int numA= sc.nextInt();
       System.out.println( "Would you like to feed the pigs? Y/N");
       String input=sc.next();
       if (input=="Y"){
         p1.feed(feedA);
         p2.feed(feedP);
         p3.feed(feedA);
       }
         else
           ans=false;
   } 
   while (ans=true);
     }
 //*************************** 
//Comments
//*****************************
//I can't seem to get my do-while loop to function properly. It did work when I put in the Y or N with quotation marks. 
  //Not sure how to fix that
}
  


  


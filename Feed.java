//***************************** 
//William Mwangi
//T00622533
//Feed Class
//*****************************

public class Feed{

 //Instance Variables
 //******************

 //total number of bins left
 private static int bins=0;
 
 public String name;

 //Constructor
 //*************

 public Feed(String name, int num){
  this.bins= bins+num;
  this.name=name;
 }

 //Accessors
 //*********

 //how many bins left?
 public static int getAmount(){
  return bins;
 }
 
 //What is the name of the feed
 public String getName(){
  return name;
 }

 //Consume method
 //**************

 public static void consume(){
   if (bins>=1) {
     bins=bins-1;
   }
   else{
     System.out.print ("WARNING: No more bins of this feed left to be consumed!");
     System.out .print ("There are " + Integer.toString(bins)+" of other types of feed remaining");
   }

 }

 //Tostring method
 public String toString(){
  String result = "Feed Type:" +name + "\n Total Number of bins for all types of feed left: "+ Integer.toString(bins) + "\n";
  return result;
 }
//***********************
 //Comments
 //************************
 //I introduced the nonstatic num variable to track the number of bins for each feed left
 //I also tweaked the consume method to account for both num and bins

}

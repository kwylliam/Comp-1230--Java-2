//***************************** 
//William Mwangi
//T00622533
//Pig Class
//*****************************

public class Pig{

 //Instance Variables//
 //******************//

 // total number of pigs

 private static int num = 0;

 //color of pig//
 public String color;

 //sex of pig
 private boolean isFemale;

 //number id for each pig
 public String id;


 //Constructor//
 //***********//

 public Pig(String sex, String color){

  if(sex=="f") //takes gender as m or f
   isFemale=true;
  else
   isFemale=false;

  num = num+1;

  id = "000"+Integer.toString(num);
  
  this.color=color;

 }

 //Accessors
 //**********

 //How may pigs so far?
 public static int getCount(){
  return num;
 }

 //What color is the pig?
 public String getColor(){
  return color;
 }

 //Is the pig female

 public String getSex() {
  if (isFemale=true)
   return "female";
  else
   return "male";
 }

 //What is the pig's id?

 public String getId(){
  return id;
 }

 //Mutators
 //*********

 //Set color 

 public void setColor(String color){
  color=color;
 }

 //Set sex
 public void setSex(String sex){
  if(sex=="f") //takes gender as m or f
   isFemale=true;
  else
   isFemale=false;
 }

 //Feed the pig
 //*************
 public static void feed(Feed type){
 type.consume();
 }

//Tostring method
 public String toString(){
  String result = "Pig"+id + "\nSex:"+((isFemale==true) ? "female":"male") +"\nColor:"+color;
  return result;
 }


//******************** 
//Comments
//********************
//Changed name to id. Thought it was easier than coming up with names.

//Did not find id and num mutators necessary because those values are 
//assigned by the program. Errors in entering the color or sex are possible
//so I put setter methods for those

}


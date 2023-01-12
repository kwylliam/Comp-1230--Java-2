public class AngryDuck extends WaterFowl implements Teleporter implements Attacker{
protected String position;
 
 //constructor
protected AngryDuck(String name, String color){

  super(name, color);
  position="(0,0)";
 }


 //peck method

 protected void peck(){
  if (health>0){
   System.out.println(name+" is pecking");
  }

  else
   {System.out.println(name + " is dead");
 }

 }

public void teleport(){
 	
 	String x=String.valueOf((int)Math.random()*500);
 	String y=String.valueOf((int)Math.random()*1000);

 	System.out.print("You have teleported to, (" +x+", "+y+")" );

 	position="("+x+","+y+")";

 }

 public String getPosition(){

 	return position;
 }


 }

  

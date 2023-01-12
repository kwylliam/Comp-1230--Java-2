public class CuriousBunny extends Animal implements Teleporter{

	String position;

	//Constructor
	protected CuriousBunny(String name, String color){

		super(name, color);
		position="(0,501)";

	}

	//hop method

	protected void hop(){

		if (health>0) {
			System.out.println(name + " is hopping");
		}

		else
		{
			System.out.println(name +" is dead");
		}

	}
	public void teleport(){
		String x=String.valueOf((int)(500+Math.random()*1000));
		String y=String.valueOf((int)Math.random()*1000);
		System.out.print("You have teleported to, (" +x+", "+y+")" );
		position="("+x+","+y+")";

 }

 public String getPosition(){

 	return position;
 }

}



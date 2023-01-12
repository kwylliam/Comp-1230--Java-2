public class LoudGoose extends WaterFowl{

	//constructor
	protected LoudGoose(String name, String color){

		super(name, color);
	}


	//honk method

	protected void honk(){
		if (health > 0){
			System.out.println(name + " is honking");
		}
		else
		{
			System.out.println(name + " is dead");
		}

	}
}

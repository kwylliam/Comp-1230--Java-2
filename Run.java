

public class Driver {
	
	public static void main (String[] args) {
		
		//test teleportation for CuriousBunny
		
		CuriousBunny bun= new CuriousBunny(bun, blue);
		
		bun.teleport();
		
		Syestem.out.println(bun.getPosition());
		
		
		
		//Test teleportation for AngryDuck
		AngryDuck duk= new CuriousBunny(duk, black);
		
		duk.teleport();
		
		Syestem.out.println(duk.getPosition());
		
		
		//Test Attacker for AngryDuck
		
		Animal target = new AngryDuck(tag, red);
		
		duk.attack(tag); //shouldn't be able to attack because they are the same type
		
		Animal target2=new CuriousBunny(tag2, black);
		duk.attack(tag2); //should attack
		duk.attack(tag2);
		duk.attack(tag2);
		duk.attack(tag2); // Should show is already dead message
		
		System.out.print(duk.getKillCount())// should have one kill
		//Test Attacker for Loudgoose
		
		LoudGoose gos=new LoudGoose(gos, white);
		LoudGoose gost=new LoudGoose(gost, white);
		
		gos.attack(gost);	//shouldn't attack same type
		
		gos.attack(tag); //should attack
		gos.attack(tag);
		gos.attack(tag);	 
		gos.attack(tag);// Should show "is dead" message
		
		System.out.print(gos.getKillCount());//should have one kill
	}
}


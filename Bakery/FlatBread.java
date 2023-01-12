//----------------//
// William Mawngi//
//....T00622533..//
//---------------//
public class FlatBread extends Bread{

	int diameter;

	//Constructor//

	public FlatBread(String dateOfBake, String breadName, String breadType,  int diameter){

		super(dateOfBake, breadName, breadType);

		this.diameter=diameter;

	}

	//Accessors//
	//---------//

	protected int getDiameter(){
		return diameter;
	}

	//Mutators//
	protected void setDiameter(int diameter){
		this.diameter=diameter;
	}




}
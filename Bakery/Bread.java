//----------------//
// William Mawngi//
//....T00622533..//
//---------------//

public class Bread extends Product{

	//Instance variables//
	//------------------//

	protected String breadType, breadName; //breadName == brand name on the package

	//Constructor//
	//-----------//

	protected Bread(String dateOfBake, String breadName, String breadType){

		super (dateOfBake);

		this.breadType=breadType;
		this.breadName=breadName;
	}

	//Accessors//
	//---------//
	protected String getType(){
		return breadType;
	}

	protected String getName(){
		return breadName;
	}

	//Mutators//
	//--------//

	protected void setType(String type){
		breadType=type;
	}

	protected void setName(String name){
		breadName=name;
	}







}
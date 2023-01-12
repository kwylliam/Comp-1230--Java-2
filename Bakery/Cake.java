//----------------//
// William Mawngi//
//....T00622533..//
//---------------//

public class Cake extends Product{

	//Instance Variables

	int sugarContent;

	final boolean glutenFree;

	//Constructor//
	//-----------//

	protected Cake(String dateOfBake, int sugarContent, boolean glutenFree){

		super(dateOfBake);
		this.sugarContent= sugarContent;
		this.glutenFree=glutenFree;

	}

	//Accessors

	public int getSugarContent(){

		return sugarContent;

	}

	public boolean isGlutenFree(){

		return glutenFree;
	}

	//Mutators

	public void setSugarContent(int content){

		sugarContent=content;
	}



}
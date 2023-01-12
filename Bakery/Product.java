//----------------//
// William Mawngi//
//....T00622533..//
//---------------//

public abstract class Product{

	//Instance vatiables//
	//------------------//

	protected String dateOfBake, dateOfExpiry; //mm-dd

	public static int totalProductCount;

	protected boolean soldStatus;

	//Constructor//
	//-----------//

	protected Product(String dateOfBake){

		this.dateOfBake=dateOfBake;
		dateOfExpiry=setExpiry(dateOfBake);
		totalProductCount++;
		soldStatus=false;

	}

	//Sold Method//
	//-----------//

	public void sold(){
		if (soldStatus=false){

			totalProductCount--;
			soldStatus=true;
		}
		else{System.out.println("Already sold");
			}
	}

	//Set Expiry Method//
	//Sets the Expiry 2 weeks after the Bake date//

	private String setExpiry(String date){
		String [] parts=date.split("-", 2);
		int day=Integer.parseInt(parts[1]);

		if(day<(30-14)){
			int exp = day+14; //sets the expiry 2 weeks later
			String expDate= parts[0]+ "-" + String.valueOf(exp);
			return expDate;
		}
		else{
			int exp=(30-day); //Sets date 2 weeks later on the next month
			int month=(Integer.parseInt(parts[0]+1)) + 1; 
			String expDate= String.valueOf(month)+ "-" + String.valueOf(exp);
			return expDate;
		}
	}


	// Accessors//
	//----------//

	protected String getDateOfBake(){
		return dateOfBake;
	}

	protected String getExpiry(){
		return dateOfExpiry;
	}

	public static int getProductCount(){
		return totalProductCount;
	}

	protected boolean getStatus(){
		return soldStatus;
	}

	//Mutators//
	//--------//

	protected void setDateOfBake(String dateOfBake){
		this.dateOfBake=dateOfBake;
	}

	protected void setSoldStatus(boolean value){
		soldStatus=value;
	}
}





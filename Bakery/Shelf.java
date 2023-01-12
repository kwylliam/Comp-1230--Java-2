//----------------//
// William Mawngi//
//....T00622533..//
//---------------//

import java.util.Stack;

public class Shelf{

	//Instance variables

	String contents;

	private Stack <Product> stack;

	//Constructor

	public Shelf(String contents){

		this.contents=contents;

		stack=new Stack <Product>();

	}

	//Accessors//
	//---------//

	public String getContents(){
		return contents;
	}

	public String viewStack(){
		return stack.toString();
	}

	//add and remove methods//
	//----------------------//

	public void add(Product name){
		stack.push(name);
	}

	public void remove(){
		Product item= (stack.pop());
		item.sold();

	}

	//see last item//

	public Product checkTop(){

		Product item=stack.peek();

		return item;
	}

	//









}
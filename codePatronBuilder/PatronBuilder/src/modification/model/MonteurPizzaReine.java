package modification.model;

public class MonteurPizzaReine extends MonteurPizza {
	
	public void monterPate()
	{ pizza.setPate("croisée"); }
	public void monterSauce()
	{ pizza.setSauce("douce"); }
	public void monterGarniture() {
	pizza.setGarniture("jambon+champignon"); }
	public Pizza getPizza() {
		// TODO Auto-generated method stub
		//appel des methodes pour construire respectivement la pate; sauce et garniture
		monterPate();
	    monterSauce();
		monterGarniture();
		return pizza;
	}


	
	
	
	}
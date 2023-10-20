package modification.model;

public class MonteurPizzaEscargot extends MonteurPizza {
	
	public void monterPate(){ 
		pizza.setPate("feuille macabo"); 
		}
	
	public void monterSauce(){
		pizza.setSauce("jaune");
		}
	
	public void monterGarniture() { 
		pizza.setGarniture("escargot");
		
	}
	public Pizza getPizza() {
		// TODO Auto-generated method stub
		//appel des methodes pour construire respectivement la pate; sauce et garniture
				monterPate();
			    monterSauce();
				monterGarniture();
		return pizza;
	}
	
	
	}

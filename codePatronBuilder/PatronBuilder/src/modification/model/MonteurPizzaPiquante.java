package modification.model;

public class MonteurPizzaPiquante extends MonteurPizza {
	
	public void monterPate(){ 
		pizza.setPate("feuilletée"); 
		}
	
	public void monterSauce(){
		pizza.setSauce("piquante");
		}
	
	public void monterGarniture() { 
		pizza.setGarniture("pepperoni+salami");
		
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

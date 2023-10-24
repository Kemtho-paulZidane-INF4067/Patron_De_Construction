package exemple.model;

public abstract class MonteurPizza {
	protected Pizza pizza;
	
	public void creerPizza(){
		pizza=new Pizza() ;
	}
	
	
	public Pizza getPizza() {
		// initialisation d'une pizza
		   creerPizza();
		//appel des methodes pour construire respectivement la pate; sauce et garniture
		
				monterPate();
			    monterSauce();
				monterGarniture();
		return pizza;
	}
	public abstract void monterPate();
	public abstract void monterSauce();
	public abstract void monterGarniture();

}

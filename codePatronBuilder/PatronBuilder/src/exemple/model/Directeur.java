package exemple.model;

public class Directeur {
	
	//contruire pizza piquante
	public Pizza construirePizzaPiquante() {
		MonteurPizza pizzap=new MonteurPizzaPiquante();
	
		return pizzap.getPizza();
	}
	//contruire pizza reine
		public Pizza construirePizzaReine() {
			MonteurPizza pizzaReine=new MonteurPizzaReine();
		
			return pizzaReine.getPizza();
		}


}

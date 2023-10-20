package modification.model;

public class Directeur {
	
	//contruire pizza reine
	public Pizza construirePizzaPiquante() {
		MonteurPizza pizzap=new MonteurPizzaPiquante();
		return pizzap.getPizza();
	}
	//contruire pizza Piquante
		public Pizza construirePizzaReine() {
			MonteurPizza pizzaReine=new MonteurPizzaReine();
			return pizzaReine.getPizza();
		}
		
		//contruire pizza Escargot
				public Pizza construirePizzaEscargot() {
					MonteurPizza pizzaesca=new MonteurPizzaEscargot();
					
					return pizzaesca.getPizza();
				}


}

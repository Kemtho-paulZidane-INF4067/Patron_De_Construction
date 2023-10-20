package exemple.model;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Directeur directeur=new Directeur();
		
		//construire pizza reine
		System.out.println(".......................Pizza Reine Fabriquée..................");
	directeur.construirePizzaReine().print();
	
	//construire pizza piquante
	System.out.println(".......................Pizza Piquante Fabriquée..................");
	directeur.construirePizzaPiquante().print();
	
	


	}

}

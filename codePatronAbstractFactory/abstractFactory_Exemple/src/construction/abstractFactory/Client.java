package construction.abstractFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("............Patron: Abstract Factory..........");
		  
		AbstractFactory factory1=new Factory1();
		
		AbstractFactory factory2=new Factory2();
		ProduitA produitA=null;
		ProduitB produitB=null;
		
		
		System.out.println("                   Utilisation de la première fabrique         ");
		//utilisation de la fabrique1 pour un produit A1
		
		produitA=factory1.createProduitA();
		produitA.methodeproduitA();
		//utilisation de la fabrique1 pour un produit B1
				produitB=factory1.createProduitB();
				produitB.methodeproduitB();
			
		
				System.out.println("                   Utilisation de la seconde fabrique         ");
				//utilisation de la fabrique2 pour un produit A2
				produitA=factory2.createProduitA();
				produitA.methodeproduitA();
				//utilisation de la fabrique2 pour un produit B2
						produitB=factory2.createProduitB();
						produitB.methodeproduitB();
						
	
		
	}

}

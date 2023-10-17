package model;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("............Patron: Abstract Factory..Avec Une ouvelle cathégorie de produit........");
		  
		AbstractFactory factory1=new Factory1();
		
		AbstractFactory factory2=new Factory2();
		ProduitA produitA=null;
		ProduitB produitB=null;
		ProduitC produitC=null;
		
		System.out.println("                   Utilisation de la première fabrique         ");
		//utilisation de la fabrique1 pour un produit A1
		
		produitA=factory1.createProduitA();
		produitA.methodeproduitA();
		//utilisation de la fabrique1 pour un produit B1
				produitB=factory1.createProduitB();
				produitB.methodeproduitB();
				//utilisation de la fabrique1 pour un produit C1
				produitC=factory1.createProduitC();
				produitC.methodeproduitC();
		
				System.out.println("                   Utilisation de la seconde fabrique         ");
				//utilisation de la fabrique2 pour un produit A2
				produitA=factory2.createProduitA();
				produitA.methodeproduitA();
				//utilisation de la fabrique2 pour un produit B2
						produitB=factory2.createProduitB();
						produitB.methodeproduitB();
						//utilisation de la fabrique1 pour un produit C2
						produitC=factory2.createProduitC();
						produitC.methodeproduitC();
				
	
		
	}

}

package model;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("........... Factory methode exemple............");
		  
		ProduitFactory produitfactoryA=new ProduitFactoryA();
		
		ProduitFactory produitfactoryB=new ProduitFactoryB();
		
		
		
		Produit produit=null;
		//affiche un produit de type A
		produit=produitfactoryA.getProduit();
		produit.methodeproduit();
		//affiche un produit de type B
		produit=produitfactoryB.getProduit();
		produit.methodeproduit();
		
	
		
	}

}

package model;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FabriqueProduit fabriqueproduit=new FabriqueProduit();
		
		Produit produit=null;
		//affiche un produit de type A
		produit=fabriqueproduit.createProduit(fabriqueproduit.typeA);
		produit.methodeproduit();
		//affiche un produit de type B
		produit=fabriqueproduit.createProduit(fabriqueproduit.typeB);
		produit.methodeproduit();
		
	
		 
		//produit inexistant
		String d="D";
		produit=fabriqueproduit.createProduit(d);
		produit.methodeproduit();
		
	}

}

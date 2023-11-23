package model;

public class FabriqueProduit {
	public static final String typeA="A";
	public static final String typeB="B";
	
	
	public  Produit createProduit(String type) {
		Produit produit=null;
		
		switch(type){
		case typeA:
			produit=new ProduitA();
			break;
		case typeB:
			produit=new ProduitB();
			break;
		default:
			throw new IllegalArgumentException("Type de produit inconnu");
		
			
		}
		return produit;
		
	}


}

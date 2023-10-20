package model;

public class Factory1 implements AbstractFactory {
	
	
	public  ProduitA createProduitA() {
	
	    return new ProduitA1();	
	}
	//fabrique un produit de type B1
	public  ProduitB createProduitB() {
		
	    return new ProduitB1();	
	}
	//fabrique un produit de type C1
		public  ProduitC createProduitC() {
			
		    return new ProduitC1();	
		}

	

}

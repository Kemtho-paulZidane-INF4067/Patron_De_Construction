package model;

public class Factory2 implements AbstractFactory {
	
	
	public  ProduitA createProduitA() {
	
	    return new ProduitA2();	
	}
	//fabrique un produit de type B1
	public  ProduitB createProduitB() {
		
	    return new ProduitB2();	
	}
	//fabrique un produit de type C1
		public  ProduitC createProduitC() {
			
		    return new ProduitC2();	
		}

	

}

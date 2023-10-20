package construction.abstractFactory;

public class Factory1 implements AbstractFactory {
	
	
	public  ProduitA createProduitA() {
	
	    return new ProduitA1();	
	}
	//fabrique un produit de type B1
	public  ProduitB createProduitB() {
		
	    return new ProduitB1();	
	}
	

	

}

package modification.model;

public abstract class MonteurPizza {
	protected Pizza pizza ;
	
	public void creerPizza(){
		pizza=new Pizza() ;
	}
	
	
	public abstract Pizza getPizza() ;
	public abstract void monterPate();
	public abstract void monterSauce();
	public abstract void monterGarniture();

}

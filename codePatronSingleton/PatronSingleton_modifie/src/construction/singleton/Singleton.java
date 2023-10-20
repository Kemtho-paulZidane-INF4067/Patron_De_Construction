package construction.singleton;

public final class Singleton {
	private static Singleton instance=null;
	public int x;
	public int y;
	public String nom;
	//premier constructeur
	private Singleton() {
		super();
	};
	
	//deuxieme constructeur
	private Singleton(int x2, int y2) {
		// TODO Auto-generated constructor stub
		this.x=x2;
	    this.y=y2;
	}
	
	//troixieme constructeur
	private Singleton(int x,int y, String nom) {
		this.x=x;this.y=y;this.nom=nom;
		
	}
//methode permetant de vérifier l'instance avant de creer
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
	
	//vérification avec le second constructeur
	public static Singleton getInstance(int x, int y) {
		if(instance==null) {
			instance=new Singleton(x,y);
		}
		return instance;
	}
	//vérification avec le troisieme constructeur
	public static Singleton getInstance(int x, int y,String nom) {
		if(instance==null) {
			instance=new Singleton(x,y,nom);
		}
		return instance;
	}
	
	
	//methode somme
	public int Somme(int x,int y) {
		return x+y;
	}
	//produit
	public int Produit(int x,int y) {
		return x*y;
	}
	
	public float moyenne(int x,int y) {
		return (float) Somme(x,y)/2;
		//le float avant Somme(x,y)/2 permet d'avoir la partie entière et la partie décimale de l'opération
		
	}
	
	
	public void affiche() {
		System.out.println("\n je suis une instance "+this.nom+" et mes valeurs sont: x= "+this.x+" et y= "+this.y);
		
	}
	//redéfinir la méthode clone pour empêcher son utilisation
	@Override
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}


	
}

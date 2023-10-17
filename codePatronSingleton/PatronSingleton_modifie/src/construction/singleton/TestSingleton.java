package construction.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		//premiere instance
		Singleton s1=Singleton.getInstance(8,3,"toto");
		s1.affiche();  //je suis une instance toto et mes valeurs sont: x= 8 et y= 3
		
		//deuxieme instance: puisqu'une instance existe déjà, alors s2=1
		Singleton s2=Singleton.getInstance(16,19);
		s2.affiche(); //je suis une instance toto et mes valeurs sont: x= 8 et y= 3
		
		
		/*on tente de créer une instance afin de retouner Somme, mais puisque l'istance s2 existe alors
		    Singleton.getInstance=s1*/
		int som=Singleton.getInstance().Somme(2, 5);
		System.out.println("la somme est: "+som);
		
		int produit=s1.Produit(2, 5);
		System.out.println("le produit est: "+produit);
		
		float Moy=s1.moyenne(2, 5);
		System.out.println("la moyenne est: "+Moy);
	
	}
}

package fr.algorithmie;

public class AffichageIdentite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moi(10,"Angie","ANDURAND");
	}
	
	public static void moi(int n, String prenom, String nom) {
		for(int i=0;i<n;i++) {
			System.out.println(prenom+" "+nom);
		}
	}
}

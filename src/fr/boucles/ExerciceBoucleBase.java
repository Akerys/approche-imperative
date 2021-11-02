package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compteur(10);
		moi(20,"Angie","ANDURAND");
		pair(100);
		impair(100);
	}
	
	public static void compteur(int n) {
		for(int i=0;i<n;i++) {
			System.out.println(i+1);
		}
	}
	
	public static void moi(int n, String prenom, String nom) {
		for(int i=0;i<n;i++) {
			System.out.println(prenom+" "+nom);
		}
	}
	
	public static void pair(int n) {
		for(int i=0;i<=n;i++) {
			if(i%2==0 && i!=0) {
				System.out.println(i);
			}
		}
	}
	
	public static void impair(int n) {
		for(int i=0;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
}

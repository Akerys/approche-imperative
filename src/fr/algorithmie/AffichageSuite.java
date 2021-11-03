package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fcompteur(10);
		fpair(10);
		fimpair(10);
		wcompteur(10);
		wpair(10);
		wimpair(10);
	}
	
	public static void fcompteur(int n) {
		for(int i=0;i<n;i++) {
			System.out.println(i+1);
		}
	}
	
	public static void fpair(int n) {
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	public static void fimpair(int n) {
		for(int i=0;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
	
	public static void wcompteur(int n) {
		int i = 0;
		while(i<n) {
			System.out.println(i+1);
			i++;
		}
	}
	
	public static void wpair(int n) {
		int i = 0;
		while(i<=n) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	public static void wimpair(int n) {
		int i = 0;
		while(i<=n) {
			if(i%2!=0) {
				System.out.println(i);
			}
			i++;
		}
	}
}

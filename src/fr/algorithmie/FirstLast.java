package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab1 = {6,2,3,4,6};
		int[] tab2 = new int[0];
		int[] tab3 = {2,3,4};
		System.out.println(firstlastsame(tab1));
		System.out.println(firstlastsame(tab2));
		System.out.println(firstlastsame(tab3));
	}
	
	public static boolean firstlastsame(int[] tab) {
		if((tab.length>=1) && (tab[0]==tab[tab.length-1])) {
			return true;
		}
		else {
			return false;
		}
	}
}

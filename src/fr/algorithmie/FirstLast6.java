package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab1 = {6,2,3,4,6};
		int[] tab2 = new int[0];
		int[] tab3 = {2,3,6};
		System.out.println(first6last6(tab1));
		System.out.println(first6last6(tab2));
		System.out.println(first6last6(tab3));
	}
	
	public static boolean first6last6(int[] tab) {
		if((tab.length>0) && ((tab[0]==6) || (tab[tab.length-1]==6))) {
			return true;
		}
		else {
			return false;
		}
	}
}

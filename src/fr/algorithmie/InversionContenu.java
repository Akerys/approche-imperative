package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		reversecopy(tab);
	}
	
	public static void reversecopy(int[] tab) {
		int[] tabcopie = new int[tab.length];
		int i,j;
		for(i=tab.length-1,j = 0 ;i>=0 && j<tab.length;i--,j++) {
			tabcopie[j] = tab[i];
		}
		for(i=0;i<tab.length;i++) {
			System.out.print("["+tab[i]+"]");
		}
		System.out.print("\n");
		for(i=0;i<tabcopie.length;i++) {
			System.out.print("["+tabcopie[i]+"]");
		}
		System.out.print("\n");
	}

}

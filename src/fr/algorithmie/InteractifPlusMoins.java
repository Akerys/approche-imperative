package fr.algorithmie;
import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		plusmoins(random.nextInt(100),scanner);
		scanner.close();
	}

	public static void plusmoins(int solution, Scanner scanner) {
		int saisie = scanner.nextInt();
		int essais = 1;
		while(saisie!=solution) {
			if(saisie<solution) {
				System.out.println("plus");
			}
			else {
				System.out.println("moins");
			}
			saisie = scanner.nextInt();
			essais++;
		}
		System.out.println("Bravo, vous avez trouvé en "+essais+" coups");
	}
}

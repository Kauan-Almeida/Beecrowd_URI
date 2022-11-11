import java.util.Locale;
import java.util.Scanner;

//Note: if you are going to put the code in "Beecrowd", rewrite "Main_1021" to "Main"
//OBS: not completed

public class Main_1021 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double value = sc.nextDouble();

		int ballot100 = 0;
		int ballot50 = 0;
		int ballot20 = 0;
		int ballot10 = 0;
		int ballot5 = 0;
		int ballot2 = 0;
		int ballot1 = 0;
		int ballot050 = 0;
		int ballot025 = 0;
		int ballot010 = 0;
		int ballot005 = 0;
		int ballot001 = 0;

		for (int i = 1; i <= 9; i++) {

			if (value >= 100) {
				ballot100 = (int) (value / 100);
				value = value - ballot100 * 100;
			} else if (value >= 50) {
				ballot50 = (int) (value / 50);
				value = value - 50;
			} else if (value >= 40) {
				ballot20 = (int) (value / 20);
				value -= 40;
			} else if (value >= 20) {
				ballot20 = (int) (value / 20);
				value = value - 20;
			} else if (value >= 10) {
				ballot10 = (int) (value / 10);
				value = value - 10;
			} else if (value >= 5) {
				ballot5 = (int) (value / 5);
				value = value - 5;
			} else if (value >= 4) {
				ballot2 = (int) (value / 2);
				value = value - 4;
			} else if (value >= 2) {
				ballot2 = (int) (value / 2);
				value = value - 2;
			} else if (value >= 1) {
				value = value * 100;
				ballot1 = (int) (value / 100);
				value = value / 100 - 1;
			} else if (value >= 0.50) {
				value = value * 100;
				ballot050 = (int) (value / 50);
				value = value / 100 - 0.50;
			} else if (value >= 0.25) {
				value = value * 100;
				ballot025 = (int) (value / 25);
				value = value / 100 - 0.25;
			} else if (value >= 0.20) {
				value = value * 100;
				ballot010 = (int) (value / 10);
				value = value / 100 - 0.20;
			} else if (value >= 0.10) {
				value = value * 100;
				ballot010 = (int) (value / 10);
				value = value / 100 - 0.10;
			} else if (value >= 0.05) {
				value = value * 100;
				ballot005 = (int) (value / 5);
				value = value / 100 - 0.05;
			} else if (value >= 0.01) {
				value = value * 100;
				ballot001 = (int) (value / 1);
				value = value / 100;
				
			}
		}
		
		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00%n" ,ballot100);
		System.out.printf("%d nota(s) de R$ 50.00%n" ,ballot50);
		System.out.printf("%d nota(s) de R$ 20.00%n" ,ballot20);
		System.out.printf("%d nota(s) de R$ 10.00%n" ,ballot10);
		System.out.printf("%d nota(s) de R$ 5.00%n" ,ballot5);
		System.out.printf("%d nota(s) de R$ 2.00%n" ,ballot2);
		
		System.out.println("MOEDAS:");
		System.out.printf("%d nota(s) de R$ 1.00%n" ,ballot1);
		System.out.printf("%d nota(s) de R$ 0.50%n" ,ballot050);
		System.out.printf("%d nota(s) de R$ 0.25%n" ,ballot025);
		System.out.printf("%d nota(s) de R$ 0.10%n" ,ballot010);
		System.out.printf("%d nota(s) de R$ 0.05%n" ,ballot005);
		System.out.printf("%d nota(s) de R$ 0.01%n" ,ballot001);
		sc.close();

	}
}

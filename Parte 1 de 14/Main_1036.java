import java.util.Locale;
import java.util.Scanner;

//Note: if you are going to put the code in "Beecrowd", rewrite "Main_1036" to "Main"
public class Main_1036 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = (b * b) - (4 * (a * c));
		double cal = (-b + Math.sqrt(delta)) / (2 * a);
		double cal1 = (-b - Math.sqrt(delta)) / (2 * a);
		
		if(a == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
		}
		else {
			System.out.printf("R1 = %.5f\n", cal);
			System.out.printf("R2 = %.5f\n", cal1);
		}
		
		sc.close();
	}
}

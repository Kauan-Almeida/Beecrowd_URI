import java.util.Locale;
import java.util.Scanner;

//Note: if you are going to put the code in "Beecrowd", rewrite "Main_1002" to "Main"
public class Main_1002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		double pi = 3.14159;
	    double A = pi * r * r;
		
		System.out.printf("A=%.4f%n", A);		
		
		sc.close();
	}
}
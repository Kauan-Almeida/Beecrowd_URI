import java.util.Locale;
import java.util.Scanner;

//Note: if you are going to put the code in "Beecrowd", rewrite "Main_1011" to "Main"
public class Main_1011 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int raio = sc.nextInt();
		double volume = (4/3.0) * 3.14159 * raio * raio * raio;
		
		System.out.printf("VOLUME = %.3f", volume);
		
		sc.close();
	}
}

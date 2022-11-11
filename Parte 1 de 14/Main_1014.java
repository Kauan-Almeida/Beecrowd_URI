import java.util.Locale;
import java.util.Scanner;

//Note: if you are going to put the code in "Beecrowd", rewrite "Main_1014" to "Main"
public class Main_1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int km = sc.nextInt();
		double way =sc.nextDouble();
		
		double media = km / way;
		
		System.out.printf("%.3f km/l", media);
		
		sc.close();
	}
}

import java.util.Locale;
import java.util.Scanner;

//Note: if you are going to put the code in "Beecrowd", rewrite "Main_1017" to "Main"
public class Main_1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int travelTime = sc.nextInt();
		double averageSpeed = sc.nextDouble();
		
		double way = travelTime * (averageSpeed / 12);
		
		System.out.printf("%.3f", way);
		
		sc.close();	
	}
}

import java.util.Locale;
import java.util.Scanner;

//Note: if you are going to put the code in "Beecrowd", rewrite "Main_1005" to "Main"
public class Main_1005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        
        double media = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5) ;
        
        System.out.printf("MEDIA = %.5f", media);
		
		sc.close();
	}
}
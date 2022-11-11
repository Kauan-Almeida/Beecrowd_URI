import java.util.Locale;
import java.util.Scanner;

//Note: if you are going to put the code in "Beecrowd", rewrite "Main_1010" to "Main" 
public class Main_1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int partCode1 = sc.nextInt();
		int numPieces1 = sc.nextInt();
		double unitaryValuePiece1 = sc.nextDouble();
		
		int partCode2 = sc.nextInt();
		int numPieces2 = sc.nextInt();
		double unitaryValuePiece2 = sc.nextDouble();
		
		double amountPaid = unitaryValuePiece1 * numPieces1 + unitaryValuePiece2 * numPieces2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", amountPaid);
		
		sc.close();
	}
}

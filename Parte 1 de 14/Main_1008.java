import java.util.Locale;
import java.util.Scanner;

//Note: if you are going to put the code in "Beecrowd", rewrite "Main_1008" to "Main"
public class Main_1008 {

	public static void main(String[] arg) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int employeeNum = sc.nextInt();
		int workedHours = sc.nextInt();
		double pricePerHour = sc.nextDouble();
		
		double soma = workedHours * pricePerHour;
		
		System.out.println("NUMBER = "+ employeeNum);
		System.out.printf("SALARY = U$ %.2f", soma);
		
		sc.close();
	}
}

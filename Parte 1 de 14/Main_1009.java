import java.util.Locale;
import java.util.Scanner;

//Note: if you are going to put the code in "Beecrowd", rewrite "Main_1009" to "Main"
public class Main_1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String sellerName = sc.nextLine();
		double fixedSalary = sc.nextDouble();
		double sales = sc.nextDouble();
		
		double commission = sales * 15 /100 + fixedSalary;
		
		System.out.printf("TOTAL = R$ %.2f", commission);
		
		sc.close();
	}
}

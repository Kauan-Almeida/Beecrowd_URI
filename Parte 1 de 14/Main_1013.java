import java.util.Scanner;

//Note: if you are going to put the code in "Beecrowd", rewrite "Main_1013" to "Main"
public class Main_1013 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maiorAB = (a + b + Math.abs(a - b)) / 2;
		int maiorC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

		System.out.println(maiorC + " eh o maior");
		
		sc.close();
	}
}

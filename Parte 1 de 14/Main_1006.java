import java.util.Scanner;

//Note: if you are going to put the code in "Beecrowd", rewrite "Main_1006" to "Main"
public class Main_1006 {
	
	public static void main(String [] args ) {
		
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int dif = (A * B) - C * D; 
		
		System.out.print("DIFERENCA = "+ dif);
		
		sc.close();
	}
}

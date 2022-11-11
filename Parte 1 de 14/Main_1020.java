import java.util.Scanner;

//Note: if you are going to put the code in "Beecrowd", rewrite "Main_1020" to "Main"
public class Main_1020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		
		int ano = day / 365;
		int mes = day % 365 / 30;
		int dia = day % 365 % 30;
		
		System.out.println(ano +" ano(s)");
		System.out.println(mes +" mes(es)");
		System.out.println(dia +" dia(s)");
		
		sc.close();
	}
}

import java.util.Scanner;

//Note: if you are going to put the code in "Beecrowd", rewrite "Main_1019" to "Main"
public class Main_1019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int horas = N / 3600;
		int minutos = (N % 3600) / 60;
		int segundos = (N % 3600) % 60;

		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

		sc.close();
	}
}

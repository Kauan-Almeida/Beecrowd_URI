import java.util.Locale;
import java.util.Scanner;

//Note: if you are going to put the code in "Beecrowd", rewrite "Main_1012" to "Main"
public class Main_1012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double areaTriangulo = A * C / 2;
		double areaCirculo = 3.14159 * C * C;
		double areaTrapézio = (A + B) * C / 2;
		double areaQuatrado = B * B;
		double areaRetangulo = A * B;
		
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapézio);
		System.out.printf("QUADRADO: %.3f%n", areaQuatrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		sc.close();
	}
}

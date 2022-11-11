import java.util.Scanner;

//Note: if you are going to put the code in "Beecrowd", rewrite "Main_1018" to "Main"
public class Main_1018 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int value = sc.nextInt();
		
		int ballot100 = 0;
		int ballot50 = 0;
		int ballot20 = 0;
		int ballot10 = 0;
		int ballot5 = 0;
		int ballot2 = 0;
		int ballot1 = 0;
		
		System.out.println(value);
		for(int i = 1; i >= 1; i++) {	
			
			if(value >= 100) {
				ballot100 = value / 100; 
				value = value - ballot100 * 100;
			}
			else if(value >= 50) {
				ballot50 = value / 50;
				value = value - 50;
			}
			else if(value >= 20) {
				ballot20 = value / 20;
				value = value - 20;
			}
			else if(value >= 10) {
				ballot10 = value / 10;
				value = value - 10;
			}
			else if(value >= 5) {
				ballot5 = value / 5;
				value = value - 5;
			}
			else if(value >= 2) {
				ballot2 = value / 2;
				value = value - 2;
			}
			else if(value >= 1) {
				ballot1 = value / 1;
				value -= 1;
			}
		}
		
		System.out.println(ballot100 + " nota(s) de R$ 100,00");
		System.out.println(ballot50 + " nota(s) de R$ 50,00");
		System.out.println(ballot20 + " nota(s) de R$ 20,00");
		System.out.println(ballot10 + " nota(s) de R$ 10,00");
		System.out.println(ballot5 + " nota(s) de R$ 5,00");
		System.out.println(ballot2 + " nota(s) de R$ 2,00");
		System.out.println(ballot1 + " nota(s) de R$ 1,00");
		
		sc.close();
	}
}

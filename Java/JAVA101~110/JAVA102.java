//102 單位換算
import java.util.Scanner;
public class JAVA102 {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input: ");
		double kilo,pound;
		kilo = scanner.nextDouble();
		pound = kilo*2.20462;
		System.out.printf("%f kg = %f ponds\n",kilo,pound);
	}

}

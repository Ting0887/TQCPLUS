//406 遞迴字串計算 
import java.util.Scanner;
public class JAVA406 {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		String s;
		System.out.print("Input a string: ");
		s = sc.nextLine();
		System.out.printf("%s has %d As",s,countA(s));

		System.out.print("\nInput a string: ");
		s = sc.nextLine();
		System.out.printf("%s has %d As",s,countA(s));

	}
	static int countA(String s) {
		if(s.isEmpty()) {
			return 0;
		}
		else if(s.substring(0,1).equals("A")) {
			return 1 + countA(s.substring(1));
		}
		else {
			return countA(s.substring(1));
		}
	}
}

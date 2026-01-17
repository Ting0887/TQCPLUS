//410 遞迴字串替換 
import java.util.Scanner;
public class JAVA410 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s,c1,c2;
		System.out.print("Input a string: ");
		s = sc.nextLine();
		System.out.print("Input a character: ");
		c1 = sc.nextLine();
		System.out.print("Input another character: ");
		c2 = sc.nextLine();
		System.out.printf("%s\n",replace(s,c1,c2));
	}
	static String replace(String s, String c1, String c2 ) {
		if(s.isEmpty()) {
			return s;
		}
		else if(s.substring(0,1).equals(c1)){
			return c2 + replace(s.substring(1),c1,c2);
		}
		else {
			return s.substring(0,1) + replace(s.substring(1),c1,c2);
		}
	}
}

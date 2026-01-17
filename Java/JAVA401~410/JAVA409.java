//409 遞迴字串移除
import java.util.Scanner;
public class JAVA409 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s,c;
		System.out.print("Input a string: ");
		s = sc.nextLine();
		System.out.print("Input a character: ");
		c = sc.nextLine();
		
		System.out.printf("%s\n",removeChar(s,c));
		
		System.out.print("Input a string: ");
		s = sc.nextLine();
		System.out.print("Input a character: ");
		c = sc.nextLine();
		
		System.out.printf("%s\n",removeChar(s,c));
	}
	static String removeChar(String s,String c) {
		if(s.isEmpty()) {
			return s;
		}
		else if(s.substring(0,1).equals(c)) {
			return removeChar(s.substring(1),c);
		}
		else {
			return s.substring(0,1) + removeChar(s.substring(1),c);
		}
	}
}

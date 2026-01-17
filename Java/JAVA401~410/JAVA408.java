//408 遞迴字串反向 
import java.util.*;
public class JAVA408 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s;
		System.out.print("Input a string: ");
		s = sc.nextLine();
		System.out.printf("%s\n",reverse(s));
		
		System.out.print("Input a string: ");
		s = sc.nextLine();
		System.out.printf("%s\n",reverse(s));
	}
	static String reverse(String s) {
		if(s.isEmpty()) {
			return s;
		}
		else {
			return reverse(s.substring(1))+s.substring(0,1) ;
		}
	}
}

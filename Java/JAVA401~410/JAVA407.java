//407 ß¿∫›ªº∞j≠p∫‚¡`©M
import java.util.*;
public class JAVA407 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s;
		System.out.print("Input a string of numbers: ");
		s = sc.nextLine();
		
		System.out.printf("ß¿∫›ªº∞j°G%s\n",sumTail(s,0));
		System.out.printf("∞j∞È°G%s\n",sumLoop(s,0));
		
		System.out.print("Input a string of numbers: ");
		s = sc.nextLine();
		
		System.out.printf("ß¿∫›ªº∞j°G%s\n",sumTail(s,0));
		System.out.printf("∞j∞È°G%s\n",sumLoop(s,0));
	}
	static int sumTail(String s,int r) {
		if(s.isEmpty()) {
			return r;
		}
		else {
			return sumTail(s.substring(1),r + Integer.parseInt(s.substring(0,1)));
		}
	}
	static int sumLoop(String s,int r) {
		while(!s.isEmpty()) {
			r = r + Integer.parseInt(s.substring(0,1));
			s = s.substring(1);
		}
		return r;
	}
}

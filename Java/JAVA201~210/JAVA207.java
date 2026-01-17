//207 三角形邊長判斷 
import java.util.*;
public class JAVA207 {
	
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		test();
		test();

	}
	static void test() {
		int a,b,c;
		System.out.print("請輸入三個整數:");
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		c = keyboard.nextInt();
		if(a+b<c || a+c<b || b+c<a) {
			System.out.printf("不可以構成三角形");
		}
		else {
			if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
				System.out.printf("直角三角形\n");
			}
			else if (a*a + b*b < c*c || a*a + c*c < b*b || b*b + c*c < a*a) {
				System.out.printf("鈍角三角形\n");
			}
		    else{
				System.out.printf("銳角三角形\n");
			}
	
		}
	}
}

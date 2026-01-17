//202 比較大小
import java.util.*;
public class JAVA202 {
	
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();

	}
	static void test(){
		int a,b;
		System.out.println("Input:");
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		if (a>b){
			//System.out.printf("%d is larger than %d\n",a,b);
			System.out.println(a + " is larger than " + b);
		}
		else {
			//System.out.printf("%d is larger than %d\n",b,a);
			System.out.println(b + " is larger than " + a);
		}
	}

}

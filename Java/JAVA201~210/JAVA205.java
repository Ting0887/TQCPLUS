//205 计耞 
import java.util.*;
public class JAVA205 {
	
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		test();
		test();
	}
	static void test() {
		int num;
		System.out.println("Enter an integer:");
		num = keyboard.nextInt();
		
		if (num%2 == 0 & num%3 == 0 & num%6 == 0) {
			System.out.println(num + "琌236计");
		}
		else if (num%2 == 0) {
			System.out.println(num + "琌2计");
		}
		else if (num%3 == 0) {
			System.out.println(num + "琌3计");
		}
		else if (num%6 == 0) {
			System.out.println(num + "琌2计");
		}
		else {
			System.out.println(num + "ぃ琌236计");
		}
	}

}

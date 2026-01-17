//203 判斷奇偶數 
import java.util.*;
public class JAVA203 {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();

	}
	static void test() {
		int num;
		System.out.println("Input an integer:");
		num = keyboard.nextInt();
		if (num%2==0) {
			System.out.println("The number is even.");
		}
		else {
			System.out.println("The number is odd.");
		}
	}

}

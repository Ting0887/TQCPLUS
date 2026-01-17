//210 鍵盤字元判斷
import java.util.*;
public class JAVA210 {
	
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		test();
		test();
		test();
	}
	static void test() {
		String st;
		char c;
		
		System.out.println("Input a character:");
		st = keyboard.nextLine();
		c = st.charAt(0);
		
		switch(c) {
			case 'a':
			case 'b':
				System.out.println("You entered a or b");
				break;
			case 'x':
				System.out.println("You entered x");
				break;
			case'y':
				System.out.println("You entered y");
				break;
			default:
				System.out.println("You entered something else.");
		}
	}

}

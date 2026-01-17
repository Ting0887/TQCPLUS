//206 及格分數 
import java.util.*;
public class JAVA206 {
	static Scanner keyboard= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		test();
		test();

	}
	static void test() {
		int chi, eng, math;
		
		System.out.print("Input Chinese score:");
		chi = keyboard.nextInt();
		
		System.out.print("Input English score:");
		eng = keyboard.nextInt();
		
		System.out.print("Input Math score:");
		math = keyboard.nextInt();
		
		if (chi>=60 & eng>=60 & math>=60) {
			System.out.println("All pass.");
		}
		else {
			if (chi<60) {
	
			System.out.println("Chinese failed.");
		}
		   if (eng<60) {
			System.out.println("English failed.");
		}
		   if (math<60) {
			System.out.println("math failed.");
		}
		
		}
	}

}

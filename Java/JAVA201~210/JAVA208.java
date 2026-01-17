//208分級制度 
import java.util.*;
public class JAVA208 {
	
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
		int score;
		System.out.println("Input:");
		score = keyboard.nextInt();
		if (score >= 90){
			System.out.println("Your grade is A");
		}
		else if (score < 90 && score >= 80){
			System.out.println("Your grade is B");
		}
		else if (score < 80 && score >= 70){
			System.out.println("Your grade is C");
		}
		else if (score < 70 && score >= 60){
			System.out.println("Your grade is D");
		}
		else {
			System.out.println("Your grade is F");
		}
		
		
		
		
	}

}

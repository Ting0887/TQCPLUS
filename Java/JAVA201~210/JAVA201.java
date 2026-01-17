//201 分數篩選 
import java.util.*;
public class JAVA201 {
	
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		}
	static void test(){
		double scores;
		System.out.println("Please enter scores:");
		scores = keyboard.nextDouble();
		if (scores>=60) {
			System.out.println("You pass");
			
		}
		
		System.out.println("End");
		}
		
	

}

//305 迴圈階乘計算
import java.util.*;
public class JAVA305 {
	
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		test();

	}
	public static void test(){
		int n;
		int total = 1;
		int i = 1;
		System.out.print("Please enter one value: ");
		n = keyboard.nextInt();
		if(n>=1 && n<=10) {
			
			while(i<=n) {
				total *= i;
				i = i + 1;
			}
			System.out.println(n + "!: " + total);
			
		}else {
			System.out.println("Error, the value is out of range.");
		}
		
		
	}
	

}

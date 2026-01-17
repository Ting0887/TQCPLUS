//306 迴圈次方計算
import java.util.*;
public class JAVA306 {
	
	static Scanner keyboard = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int m,n;
		System.out.println("Input:");
		m = keyboard.nextInt();
		while(m!=999) {
			n = keyboard.nextInt();
			
			System.out.println(powerOf(m,n));
			
			System.out.println("Input:");
			m = keyboard.nextInt();
			
		}

	}
	static long powerOf(int m,int n) {
		return (long)(Math.pow(m, n));
		
	}
}

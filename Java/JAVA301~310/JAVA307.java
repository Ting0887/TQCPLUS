//307 迴圈最大公因數
import java.util.*;
public class JAVA307 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1=0,num2;
		// //先讓使用者在迴圈外面輸入兩個數字 
		System.out.println("Input:");
		
		num1 = input.nextInt();
		
		///若條件不符合便不會進入迴圈 
		
		while(num1!=999) {
                        num2 = input.nextInt();
			//一進會迴圈後，會先執行一次gcd方法 
			System.out.println(gcd(num1,num2));
			//使用者再次輸入兩個數字，供下次迴圈判斷 
			System.out.println("Input:");
			num1 = input.nextInt();
			
		}
		
	}
	private static int gcd(int m,int n) {
		int tmp;
		while (m%n!=0) {
			tmp = n;
			n = m%n;
			m = tmp;
			
		}
		return n;
	}
		
}

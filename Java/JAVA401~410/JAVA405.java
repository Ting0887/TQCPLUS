//405 遞迴函數 
import java.util.Scanner;
public class JAVA405 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		System.out.print("Input the number n: ");
		n = sc.nextInt();
		System.out.println("Ans: " + sum2(n));
	}
	static int sum2(int n) {
		if(n==1) {
			return 2;
		}
		else {
			return n*2+sum2(n-1);
		}
	}
}

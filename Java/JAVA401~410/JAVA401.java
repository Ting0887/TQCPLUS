//401 遞迴階乘計算 
import java.util.*;
public class JAVA401 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n=0;
		while(n!=999) {
			System.out.print("Input n (0 <= n <= 16):");
			n = sc.nextInt();
			if(n!=999) {
				System.out.println(n + "的階乘 = " + fac(n));
				}
			}
		}
	static int fac(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*fac(n-1);
		}
	}

}

//404 患癹程そ计
import java.util.*;
public class JAVA404 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int m=0,n;
		while(m!=999) {
			System.out.print("Input m: ");
			m = sc.nextInt();
			if(m!=999) {
				System.out.print("Input n: ");
				n = sc.nextInt();
				System.out.println("程そ计: " + gcd(m,n));
			}
		}
	}
	static int gcd(int m,int n) {
		if(n==0) {
			return m;
		}
		else {
			return gcd(n,m%n);
		}
	}

}

//402 §ÀºÝ»¼°j¶¥­¼­pºâ 
import java.util.*;
public class JAVA402 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n=0;
		while(n!=999) {
			System.out.print("Input n (0 <= n <= 16):");
			n = sc.nextInt();
			if(n!=999) {
				System.out.println(n + " ªº¶¥­¼(§ÀºÝ»¼°j) = " + facTail(n,1));
				System.out.println(n + " ªº¶¥­¼(°j°é) = " + facLoop(n,1));
			}
		}
	
	}
	static int facTail(int n,int r) {
		if(n==1) {
			return r;
		}
		else {
			return facTail(n-1,n*r);
		}
	}
	static int facLoop(int n,int r) {
		while(n!=0) {
			r = r*n;
			n--;
		}
		return r;
	}
}

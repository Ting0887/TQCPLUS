//309 迴圈倍數判斷
import java.util.*;
public class JAVA309 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// continue
		int n;
		int total = 0;
		
		n = input.nextInt();
		
		for (int i=1;i<=n;i++) {
			if (i%7==0) {
				continue;
			}
			else if (i%3==0 || i%5==0) {
				total += i;
			}
		}
		System.out.println("Answer:" + total);
		
		
		

	}
}



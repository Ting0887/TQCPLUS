//304 餐點費用
import java.util.*;
public class JAVA304 {
	
	static Scanner keyboard = new Scanner(System.in);
	
	//設定終止的條件
	static int stop = -1;

	public static void main(String[] args) {
		//宣告變數
		int total = 0;
		int dollar = 0;
		int count = 0;
		//使用While迴圈
		while(dollar!=stop) {
			System.out.print("Please enter meal dollars or enter -1 to stop: ");
			dollar = keyboard.nextInt();
			
			if (dollar!=stop) {
				total += dollar;
				count ++;
			}
			
		}
		  System.out.println("餐點總費用: " + total);
	      System.out.printf("%d 道餐點平均費用為: %.2f\n", count, (double)total/count);

	}

}

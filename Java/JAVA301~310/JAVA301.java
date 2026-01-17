//301 整數連加
import java.util.*;
public class JAVA301 {
	static Scanner keyboard = new Scanner(System.in);//也可以用第7行寫法
	
	public static void main(String[] args) {
		//Scanner keyboard = new Scanner(System.in);
		// 宣告變數
		int num;
		int sum=0;
		
		//取得鍵盤輸入資料
		System.out.println("Input:");
		num = keyboard.nextInt();
		
		//迴圈內容
		for(int i=1;i<=num;i++) {
			sum += i;
		}
		System.out.println("1 + ... + " + num + " = " + sum );

	}

}

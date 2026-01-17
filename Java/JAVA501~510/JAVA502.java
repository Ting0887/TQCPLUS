//502 浮點數計算 
import java.util.Scanner;

public class JAVA502 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		float sum=0;
		System.out.print("請輸入學生人數：");
		n = sc.nextInt();
		float[] data = new float[n];
		
		for(int i=0;i<data.length;i++) {
			System.out.printf("第%d個學生的成績：", i+1);
			data[i] = sc.nextFloat();
			sum += data[i];
		}
		System.out.println("人數: " + n);
		System.out.println("總分: " + sum);
		System.out.println("平均: " + sum/n);
	}

}

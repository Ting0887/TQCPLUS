//501 陣列計算 
import java.util.Scanner;

public class JAVA501 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num,sum=0,count=0;
		int[] data = new int[10];
		System.out.println("請輸入10個整數：");
		for(int i=0;i<data.length;i++) {
			System.out.printf("第%d個整數: ",i+1);
			data[i] = sc.nextInt();
			if(data[i] > 60) {
				sum += data[i];
				count++;
			}
		}
		System.out.printf("陣列中大於60的有%d個\n", count);
		System.out.printf("總合為:%d\n", sum);
		System.out.println("平均值為:" + sum/(double)count);
	}

}

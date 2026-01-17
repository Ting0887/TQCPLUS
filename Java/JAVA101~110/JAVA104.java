//104距離計算 
import java.util.Scanner;

public class JAVA104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1,y1,x2,y2,distance;
		Scanner scanner = new Scanner(System.in);
		System.out.print("輸入第1組的x和y座標：");
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		
		System.out.print("輸入第2組的x和y座標：");
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		
		distance = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f。 \n",x1,y1,x2,y2,distance);

	}

}

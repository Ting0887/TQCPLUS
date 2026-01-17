//209 象限座標
import java.util.*;
public class JAVA209 {
	
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();
		test();
		test();
		test();
		
		
	}
	public static void test() {
		double x,y;
		System.out.print("請輸入x座標:");
		x = keyboard.nextDouble();
		System.out.print("請輸入y座標:");
		y = keyboard.nextDouble();
		
		if (y==0.0) {
			System.out.printf("(%.2f,%.2f)在x軸上\n",x,y);
		}
		else if (x==0.0) {
			System.out.printf("(%.2f,%.2f)在y軸上\n",x,y);
		}
		else if(x>0.0 && y>0.0) {
			System.out.printf("(%.2f,%.2f)在第一象限\n",x,y);
		}
		else if(x<0.0 && y>0.0) {
			System.out.printf("(%.2f,%.2f)在第二象限\n",x,y);
		}
		else if(x<0.0 && y<0.0) {
			System.out.printf("(%.2f,%.2f)在第三象限\n",x,y);
		}
		else {
			System.out.printf("(%.2f,%.2f)在第四象限\n",x,y);
		}

	}

}

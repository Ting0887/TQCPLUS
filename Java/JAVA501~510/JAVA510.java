//510 二分搜尋法 
import java.util.*;
public class JAVA510 {
	private static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		search();
		search();

	}
	public static void search() {
		int[] data = {5, 9, 13, 15, 17, 19, 25, 30, 45};
		
		System.out.print("請輸入要尋找的資料: ");
		int target = keyboard.nextInt();
		
		int left=0;
		int right=data.length-1;
		int middle=0;
		
		int times=0;
		
		while(left<=right) {
			middle = (right+left)/2;
			
			System.out.printf("尋找區間: %d(%d)..%d(%d),中間: %d(%d)\n",left,data[left],right,data[right],middle,data[middle]);
			
			times++;

			if(target==data[middle]){
				break;
			}
			if(target<data[middle]){
				right = middle - 1;
			}
			else{
				left = middle + 1;
			}
		}
		System.out.printf("經過 %d 次的尋找\n",times);
		
		if(target==data[middle]) {
			System.out.printf("您要找的資料在陣列中的第%d個位置\n", middle);
		}
		else {
			 System.out.printf("%d不在陣列中\n", target);
		}
	}

}

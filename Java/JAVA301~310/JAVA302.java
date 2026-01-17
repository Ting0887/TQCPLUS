//302 巢狀迴圈
public class JAVA302 {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=9;j++) {
				// 當i等於1時，j會從1跑到9，
                // 當i等於2時，j也會從1跑到9。
				count++;
				//count+=1;
			}
			
		}
		System.out.printf("count = %d\n",count);

	}
	

}

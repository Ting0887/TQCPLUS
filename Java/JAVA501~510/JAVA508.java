//508 泡泡排序法 
public class JAVA508 {

	public static void main(String[] args) {
		int[] data = {2,4,3,5,7,6,9,1};
		
		int LN = data.length-1;
		for(int i=0;i<LN;i++) {
			for(int j=0;j<LN;j++) {
				if(data[j]>data[j+1]) {
					int temp = data[j+1];
					data[j+1] = data[j];
					data[j] = temp;
				}
			}
			for(int A=0;A<=LN;A++) {
				System.out.printf(" %d",data[A]);
			}
			System.out.println();
		}
	}
}

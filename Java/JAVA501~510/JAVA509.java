//509 選擇排序法 
public class JAVA509 {

	public static void main(String[] args) {
		int[] data = {1,3,2,5,4,6};
		int LN = data.length-1;
		for(int j=0;j<LN;j++) {
			if(data[j]>data[j+1]) {
				int temp = data[j+1];
				data[j+1] = data[j];
				data[j] = temp;
			}
			for(int A=0;A<=LN;A++) {
				System.out.printf(" %d",data[A]);
			}
			System.out.println();
		}
	}

}

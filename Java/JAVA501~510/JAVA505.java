//505 反轉陣列 
public class JAVA505 {

	public static void main(String[] args) {
		String[] data = {"A","B","C","D","E","F","G","H","I","J"};
		System.out.print("反轉陣列資料之前： ");
		for(int i=0;i<data.length;i++) {
			System.out.print(" " + data[i]);
		}
		
		reverse(data);
		System.out.print("\n反轉陣列資料之後： ");
		for(int i=0;i<data.length;i++) {
			System.out.print(" " + data[i]);
		}
	}
	public static void reverse(String[] data) {
		String tmp;
		for(int i=0,j=9 ;i<j ;i++,j--) {
			tmp = data[i];
			data[i] = data[j];
			data[j] = tmp;
		}
	}

}

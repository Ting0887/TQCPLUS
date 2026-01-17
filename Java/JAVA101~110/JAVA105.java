//105存錢筒 
import java.util.Scanner;
public class JAVA105 {

	public static void main(String[] args) {
		String name;
        int oned, fived, tend, fifd;          
      int totalm;
      int totalhun;
      int totalten;
      int totalunit;
      int totalt;
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("請輸入您的姓名:");
      name = keyboard.next();
      System.out.printf("Hi, %s,請輸入你的銅板的個數：\n",name);
      System.out.print("請輸入1元的數量：");
      oned = keyboard.nextInt();
      System.out.print("請輸入5元的數量：");
      fived = keyboard.nextInt();
      System.out.print("請輸入10元的數量：");
      tend = keyboard.nextInt();
      System.out.print("請輸入50元的數量：");
      fifd = keyboard.nextInt();
      totalm = oned + 5 * fived + 10 * tend + 50 * fifd;
      totalt = totalm / 1000;
      totalm = totalm % 1000;
      totalhun = totalm / 100;
      totalm = totalm % 100;
      totalten =  totalm / 10; 
      totalunit = totalm % 10;
      System.out.printf("您的錢總共有：%d 千  %d 百  %d 十  %d 元\n", totalt, totalhun, totalten, totalunit);

	}

}

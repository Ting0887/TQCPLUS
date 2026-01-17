//110 圖形面積 
public class JAVA110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalarea;
        System.out.printf("圓形面積為：%f\n", calCircle(5));
        System.out.printf("三角形面積為：%f\n", calTriangle(10,5));
        System.out.printf("長方形面積為：%f\n", calRectangle(5,10));
        totalarea = calCircle(5) + calTriangle(10,5) + calRectangle(5,10);
        System.out.printf("此圖形面積為：%f\n", totalarea);

	}
	static double calCircle(double r) {
		return r*r*3.1415926;

    }

    static double calTriangle(double i,double j) {
    	return i*j/2.0;

    }

    static double calRectangle(double w,double h) {
    	return w*h;
    }

}

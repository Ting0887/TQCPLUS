//107 運動成績  
public class JAVA107 {

	public static void main(String argv[]) {
		// TODO Auto-generated method stub
		int action = 1,skill = 2, excitement = 3;
		 System.out.println("The basketball grade is " + Basketball.calGrade(action,skill,excitement));
	     System.out.println("The baseball grade is " + Baseball.calGrade(action,skill,excitement));

	}
}
	class Basketball {
	    public static int calGrade(int a,int s, int e){
	        return a + s + e;
	    }
	}

	class Baseball {
	    public static int calGrade(int a, int s, int e) {
	        return 10 + s + e;
	    

	}
}

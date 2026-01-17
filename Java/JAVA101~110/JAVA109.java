//109 變數範圍 
public class JAVA109 {

	
		  static int adder (int s, int a, int e) {
		        return s + a + e;
		    }

		 static int gameRating(int s, int a, int e) {
		        return adder(s, a, e);
		    } 

    public static void main(String argv[]){
		    int skill = 6, action = 9, excitment =8;
		    int result;

		    result = gameRating(skill, action, excitment);

		    System.out.print("The rating of the game is ");
		    System.out.println(result);
		  }

	}



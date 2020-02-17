import java.util.*;

/**
 * @author Usuario Dell
 *
 */
public class RandomGenerator {
	
	public String[] list() {
		String[] anArray = new String[3000];
			for(int i=0;i<anArray.length;i++){
				anArray[i] = randomFill();
		    }
			return anArray;
		}
	
	public static String randomFill(){
		Random rand = new Random();
	    int randomNum = rand.nextInt(100);
	    return String.valueOf(randomNum);
	}
}

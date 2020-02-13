import java.util.*;

/**
 * @author Usuario Dell
 *
 */
public class RandomGenerator {
	
	public int[] list() {
		int[] anArray = new int[3000];
			for(int i=0;i<anArray.length;i++){
				anArray[i] = randomFill();
		    }
			return anArray;
		}
	
	public static int randomFill(){
		Random rand = new Random();
	    int randomNum = rand.nextInt(100);
	    return randomNum;
	}
}

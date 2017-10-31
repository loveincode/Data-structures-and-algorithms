import java.math.BigInteger;

import javax.management.relation.InvalidRelationTypeException;

/**
*
* @author loveincode
* @data Oct 31, 2017 3:04:53 PM
*/
public class Bigc {
	public static void main(String[] args) {
		
	}
	
	static int[] demo(int[] ints, int num) {
		for(int i = 0;i<ints.length;i++) {
			ints[i] = ints[i]*num;
		}
		//进和留
		for(int i = ints.length-1;i>=1;i--) {
			ints[i-1] += ints[i]/10;
			ints[i] = ints[i]%10;
		}
		return ints;
	}
}

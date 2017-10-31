import java.math.BigInteger;

import javax.management.relation.InvalidRelationTypeException;

/**
*
* @author loveincode
* @data Oct 31, 2017 3:04:53 PM
*/
public class SS5 {
	public static void main(String[] args) {
		
		
		/*
		 * int n=50;
		int num = 1;
		for(int i=1;i<=n;i++) {
			num*=i;
		}
		System.out.println(num);
		*/
		
		//732*16
		/*
		System.out.println(732*16);
		int[] ints = new int[6];
		ints[ints.length-1] = 2;
		ints[ints.length-2] = 3;
		ints[ints.length-3] = 7;
		int num =16;
		//计算每一位
		for(int i = 0;i<ints.length;i++) {
			ints[i] = ints[i]*num;
		}
		//进和留
		for(int i = ints.length-1;i>=1;i--) {
			ints[i-1] += ints[i]/10;
			ints[i] = ints[i]%10;
		}
		for(int i = 0;i<ints.length;i++) {
			System.out.print(ints[i]);
		}
		*/
		
		System.out.println();
		int[] ints2 = new int[20];
		ints2[ints2.length-1]=1;
		int n=20;
		for(int i=1;i<=n;i++) {
			ints2 = demo(ints2, i);
		}
		for(int i = 0;i<ints2.length;i++) {
			System.out.print(ints2[i]);
		}
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

import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class IncreasingSequencesEasy {
	
	public int count(int[] L, int[] R) {
		long MOD = 998244353;
		long x[][] = new long[L.length][10003];
		long sum[][] = new long[L.length][10003];
		int len = L.length;
		for(int  i = 0; i < len; i++) {

			for(int j = Math.min(L[i], R[i]); j <= Math.max(L[i],R[i]) ;j++){
				if(i == 0) {
					x[i][j] = 1;
				} else {
					x[i][j] = (int)(sum[i-1][j-1])%MOD;
				}
				sum[i][j] = (sum[i][j-1]+x[i][j])%MOD;
			}
			for(int j = Math.max(L[i],R[i]) + 1; j <= 10000; j++) {
				sum[i][j] = (sum[i][j-1]+x[i][j])%MOD;
			}
		}
 		return (int)sum[len-1][Math.max(L[len-1],R[len-1])];
	}
}

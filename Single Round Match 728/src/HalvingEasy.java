import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class HalvingEasy {
	
	public int count(int[] S, int T) {
		int ans = 0;
		for(int i = 0; i < S.length; i++) {
			long j = S[i];
			// it can eb reduced to T if
			while(j > 0) {
				if(j == T) {
					ans++;
					break;
				}
				j = j/2;
			}
		}
		return ans;
	}
}

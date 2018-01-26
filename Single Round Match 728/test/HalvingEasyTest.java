import org.junit.Test;
import static org.junit.Assert.*;

public class HalvingEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] S = new int[] {6, 14, 11, 3, 1};
		int T = 3;
		assertEquals(3, new HalvingEasy().count(S, T));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] S = new int[] {42, 10, 10, 10, 11, 11, 20, 21, 39, 40, 42, 43, 44};
		int T = 10;
		assertEquals(9, new HalvingEasy().count(S, T));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] S = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int T = 1;
		assertEquals(20, new HalvingEasy().count(S, T));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] S = new int[] {987654321, 1000000000, 998244353, 123456789, 999999999};
		int T = 476;
		assertEquals(3, new HalvingEasy().count(S, T));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] S = new int[] {987654321, 1000000000, 998244353, 123456789, 999999999};
		int T = 1000000000;
		assertEquals(1, new HalvingEasy().count(S, T));
	}

	@Test(timeout=2000)
	public void test5() {
		int[] S = new int[] {1, 5, 4, 10, 15};
		int T = 2;
		assertEquals(3, new HalvingEasy().count(S, T));
	}
}

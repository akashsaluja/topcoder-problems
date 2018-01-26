import org.junit.Test;
import static org.junit.Assert.*;

public class IncreasingSequencesEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] L = new int[] {1, 3, 1, 4};
		int[] R = new int[] {6, 5, 4, 6};
		assertEquals(4, new IncreasingSequencesEasy().count(L, R));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] L = new int[] {10, 20};
		int[] R = new int[] {20, 30};
		assertEquals(120, new IncreasingSequencesEasy().count(L, R));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] L = new int[] {20, 10};
		int[] R = new int[] {30, 20};
		assertEquals(0, new IncreasingSequencesEasy().count(L, R));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] L = new int[] {4, 46, 46, 35, 20, 77, 20};
		int[] R = new int[] {41, 65, 84, 90, 49, 86, 88};
		assertEquals(2470, new IncreasingSequencesEasy().count(L, R));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] L = new int[] {1, 1, 1};
		int[] R = new int[] {10000, 10000, 10000};
		assertEquals(908107402, new IncreasingSequencesEasy().count(L, R));
	}
}

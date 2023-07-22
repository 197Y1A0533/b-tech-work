// Java program to get maximum xor value
// of two numbers in a range

package Geeks;

class Xor
{
	// method to get maximum xor value in range [L, R]
	static int maxXORInRange(int L, int R)
	{
		// get xor of limits
		int LXR = L ^ R;
        System.out.println("LXR "+LXR);
	
		// loop to get msb position of L^R
		int msbPos = 0;
		while (LXR > 0)
		{
			msbPos++;
			LXR >>= 1;
            System.out.println(LXR);
		}
        System.out.println("msbPos  "+msbPos);
	
		// construct result by adding 1,
		// msbPos times
		int maxXOR = 0;
		int two = 1;
		while (msbPos-- >0)
		{
			maxXOR += two;
			two <<= 1;
            System.out.println("maxXor  "+maxXOR);
            System.out.println("two "+two);
		}
        System.out.println("maxXor  "+maxXOR);
        System.out.println(15^16);
		return maxXOR;
	}
	
	// main function
	public static void main (String[] args)
	{
		int L = 8;
		int R = 20;
		System.out.println(maxXORInRange(L, R));
	}
}

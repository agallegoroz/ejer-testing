/**
* Count odd or positive elements in an array
*
* @param x array to search
* @return count of odd or positive elements in x
* @throws NullPointerException if x is null
*/
public class oddOrPos{


	public static int oddOrPos (int[] x)
	{
		int count = 0;

		if(x == null)
		{
			throw new NullPointerException ("lastzero");
		}
		

		for (int i = 0; i < x.length; i++)
		{
			if (x[i]%2 == 1 || x[i] > 0 || x[i]%2 == -1)
			{
				count++;
			}
		}
		return count;
	}
}

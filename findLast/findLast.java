/**
 * Find last index of element
 *
 * @param x array to search
 * @param y value to look for
 * @return last index of y in x; -1 if absent
 * @throws NullPointerException if x is null
 */
 
public class findLast{
 
	public static int findLast (int[] x, int y)
	{
		int last = -1;
		int found = 0;
		
		if(x == null)
		{
          throw new NullPointerException ("findlast");
		}
		
		for (int i=0; i<= x.length - 1; i++)
		{
			if (x[i] == y)
			{
				last = i;
				found =1;
			}
		}
		if (found == 0 )
		{
			return -1;
		} else {
			return last;
		}
		
	}
}

		

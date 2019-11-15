public class countPositive
{

	public static int countPositive (int[] x)
	{

		int count = 0;
		
		if(x == null)
		{
          throw new NullPointerException ("countPositive");
		}

		for (int i=0; i < x.length; i++)
		{
			if (x[i] > 0)
			{
				count++;
			}
		}
		
		return count;
	}

}

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class oddOrPosTest
{
   
   @Test public void negativeOdd() 
   {
      int arr[] = {8, 7, 6, -9, -6};
      assertEquals("NegativeOdd", 4, oddOrPos.oddOrPos(arr));
   }

	
   @Test public void oddAndPostive() 
   {
      int arr[] = {1, 8};
      assertEquals("PositiveOdd and positive", 2, oddOrPos.oddOrPos(arr));
   }
   
   
	 @Test public void exception() 
   {
      int arr[] = {};
      assertEquals("Null pointer exception", 0, oddOrPos.oddOrPos(arr));
   }
}

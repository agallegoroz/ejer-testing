import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class lastZeroTest
{
   
   @Test public void arrayFirstZero() 
   {
      int arr[] = {0, 7, 0};
      assertEquals("Lastzero is in last element", 2, lastZero.lastZero(arr));
   }

	
   @Test public void arrayLastZero() 
   {
      int arr[] = {8, 0, 8};
      assertEquals("Lastzero is in the second element", 1, lastZero.lastZero(arr));
   }
   

   @Test public void arrayWithoutZero() 
   {
      int arr[] = {8, 8, 8};
      assertEquals("No zeros", -1, lastZero.lastZero(arr));
   }
   
    @Test public void exception() 
   {
      int arr[] = {};
      assertEquals("Null Pointer exception", -1, lastZero.lastZero(arr));
   }
}

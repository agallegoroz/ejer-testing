import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class findLastTest
{
   
   @Test public void arrayWithTwoElementsEqual() 
   {
      int arr[] = {0, 1,2,3, 0};
      int y = 0;
      assertEquals("Found last element with two equal", 4, findLast.findLast(arr, y));
   }

	
   @Test public void arrayWithoutElementFound() 
   {
      int arr[] = {0, 1, 2,3};
      int y = 5;
      assertEquals("element not found", -1, findLast.findLast(arr,y));
   }
   

    @Test public void exception() 
   {
      int arr[] = {};
      int y = 0;
      assertEquals("Null pointer exception", -1, findLast.findLast(arr,y));
   }
}

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class tester{
  public static void main(String[] args){
    Result result = JUnitCore.runClasses(tester.class);

    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }

    System.out.println(result.wasSuccessful());
  }
  
  /* Example from the README: 
   * for the given array, only 9 appears twice, 
   * so the locations where 9 is the value should have corresponding true values. 
   */
  @Test
  public void gridOfMultiplesExample() {
    int[][] in = {{ 4, 7, 9}, { 8, 9, 3}};
    boolean[][] out = {{ false, false, true}, {false, true, false}}; 
    assertArrayEquals(out,searchAndPrint.gridOfMultiples(in));
  }
  
  /* Example from the README: 
   * In the example 17 is only the value for one index, 
   * so searchForMultiple should return false.
   */
  @Test
  public void searchForMultipleExample1() { 
    int[][] test2 = {{ 12, 17, 90,  1},
                     { 12, 12, 15, 90},
                     { 16, 13, 15, 22}};
    assertFalse(searchAndPrint.searchForMultiple(test2, 17));
  }
  
  /* Example from the README: 
   * In the example 19 is the value for more than one index, 
   * so searchForMultiple should return true.
   */
  @Test
  public void searchForMultipleExample2() { 
    int[][] test2 = {{ 12, 17, 90,  1},
                     { 12, 12, 15, 90},
                     { 16, 13, 15, 22}};
    assertTrue(searchAndPrint.searchForMultiple(test2, 12));
  }
}

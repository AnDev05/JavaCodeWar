package NumberProblem;

import java.util.Arrays;


/**
 *
 * @author Admin
 */
public class NumberProblem {
    // Make sure your class is public
    public static double findUniq(double arr[]) {
         // Do the magic
        Arrays.sort(arr);
        if (arr[0] == arr[1]) {//Max value
          return arr[arr.length-1];
        }
        return arr[0];//Min value
    }
}

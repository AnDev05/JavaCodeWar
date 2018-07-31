/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberProblem;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class LengthOfMissingArray {
    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        if(arrayOfArrays==null||arrayOfArrays.length==0)
            return 0;
        int []lengthArray=new int[arrayOfArrays.length];
        
        for (int i = 0; i < arrayOfArrays.length; i++) {
            Object[] array=arrayOfArrays[i];
             if(array==null||array.length==0){
                return 0;
            }
            lengthArray[i]=array.length;
        }
        Arrays.sort(lengthArray);
        for (int i = 0; i < lengthArray.length-1; i++) {
            if(lengthArray[i+1]-lengthArray[i]>1){
                return lengthArray[i+1]-lengthArray[i];
            }
        }
        
        return -1;
  }
}

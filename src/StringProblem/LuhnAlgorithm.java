/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringProblem;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class LuhnAlgorithm {
    public static boolean validate(String str){
        int[] digits = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
        int sum=0;
        for (int i = 0; i <digits.length; i++) {
            int digit=digits[digits.length-i-1];
            if(i%2==1)
                digit*=2;
            sum+=digit>9?digit-9:digit;
        }
        return sum%10==0;
  }
    
}

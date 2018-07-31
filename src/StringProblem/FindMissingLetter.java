/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringProblem;

/**
 *
 * @author Admin
 */
public class FindMissingLetter {
    public static char findMissingLetter(char[] arr) {
       int sum1=0;
        int sum2=0;
        for (int i = arr[0]; i <= arr[arr.length-1]; i++) {
            sum1+=i;
            System.out.print((char)i+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            sum2+=arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println((sum1-sum2));

       return (char)(sum1-sum2);
    }
    public static void main(String[] args) {
        char []a={'a','b','c','d','f'};
        System.out.println(findMissingLetter(a));
    }
}

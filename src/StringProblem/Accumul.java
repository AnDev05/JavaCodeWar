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
public class Accumul {
     public static String accum(String s) {
       StringBuilder sb=new StringBuilder();
       int i=0;
       for(char c:s.toCharArray()){
           if(i>0)
             sb.append("-");
           sb.append(Character.toUpperCase(c));
           for(int j=0;j<i;j++){
               sb.append(Character.toLowerCase(c));
           }
           i++;
       }
       return sb.toString();
    }
}

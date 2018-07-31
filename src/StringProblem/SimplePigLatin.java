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
public class SimplePigLatin {
    public static String pigIt(String str) {
       if(str.isEmpty())
            return null;
        String[] spl = str.split("\\s+");
        String newStr="";
        int i=0;
        for (String s : spl) {
            if(s.length()==1){
                newStr+=s;
                if(Character.isLetter(s.charAt(0))){
                    newStr+="ay";
                }
            }else{
                newStr+=s.substring(1,s.length());
                newStr+=s.substring(0,1);
                newStr+="ay";
            }
            
            i++;
            if(i<spl.length)
                newStr+=" ";
        }
        if(str.endsWith(" "))
            newStr+=" ";
        System.out.println(newStr);
        return newStr;
    }
    
     public static String pigIt2(String str) {
       if(str.isEmpty())
            return null;
        String[] spl = str.split("\\s+");
        String newStr="";
        int i=0;
        for (String s : spl) {
            if(s.length()==1){
                newStr+=s;
                if(Character.isLetter(s.charAt(0))){
                    newStr+="ay";
                }
            }else{
                newStr+=s.substring(1,s.length());
                newStr+=s.substring(0,1);
                newStr+="ay";
            }
            
            i++;
            if(i<spl.length)
                newStr+=" ";
        }
        if(str.endsWith(" "))
            newStr+=" ";
        System.out.println(newStr);
        return newStr;
    }
    
    public static void main(String[] args) {
        
    }
}

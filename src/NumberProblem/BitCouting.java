/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberProblem;

/**
 *
 * @author Admin
 */
public class BitCouting {
    
    public static int countBits(int n) {
        return Integer.bitCount(n);
    }
    
    public static int countBits2(int n) {
        int num = n % 2;
        while ((n /= 2) > 0) {
            num += n % 2;
        }
        return num;
    }
    
    
    public static int countBits3(int n) {
        int count = (int) Integer.toBinaryString(n).chars().filter(c-> c=='1').count();
        return count;
    }
    
    
    
    public static void main(String[] args) {
        System.out.println(countBits(121231234));
    }
}

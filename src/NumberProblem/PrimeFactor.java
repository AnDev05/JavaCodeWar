package NumberProblem;

/**
 *
 * @author Admin
 */
public class PrimeFactor {
    
    //Stupid
    private static boolean checkPrime(int n){
        for (int j = 2; j < Math.sqrt(n); j++) {
            if(n%j==0){
               return false;
            }
        }
        return true;
    }
    private static String factors(int n) {
        String result="";
        
        int prime=1;
        int count;
        while(!checkPrime(n)){
            prime=generatePrime(prime);
            count=0;
            while(n%prime==0){
                count++;
                n/=prime;
            }
            if (count > 0) {
                result += "(" + prime + (count > 1 ? "**" + count : "") + ")";
            }
        }
        result+="("+n+")";
                
        return result;
    }
    
    private static int generatePrime(int old){
        for (int number = old+1;; number++) {
            if(checkPrime(number))
                return number;
        }
    }
    
    
    public static void main(String[] args) {
        System.out.println(factors(7775460));
    }
    
    
    /*Clever*/
    
//    public static String factors(int lst) {
//        String result = "";
//        for (int fac = 2; fac <= lst; ++fac) {
//            int count;
//            for (count = 0; lst % fac == 0; ++count) {
//                lst /= fac;
//            }
//            if (count > 0) {
//                result += "(" + fac + (count > 1 ? "**" + count : "") + ")";
//            }
//        }
//        return result;
//    }
}

package StringProblem;

/**
 *
 * @author Admin
 */
public class XO {
    
    
    static boolean getXO(String str){
        return str.toLowerCase().replace("x", "").length()==str.toLowerCase().replace("o", "").length();
    }
    
    public static void main(String[] args) {
        
    }
}

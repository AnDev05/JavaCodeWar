package StringProblem;

public class CountVowel {

    public static int getCount2(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (char c : str.toCharArray()) {
            if (c == 'u' || c == 'e' || c == 'o' || c == 'a' || c == 'i') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
    
     public static int century(int number) {
      return number%100==0?number/100:number/100+1;
  }
}

package StringProblem;

public class BraceChecker {

    public boolean isValid(String braces) {
        while (braces.contains("{}") || braces.contains("()") || braces.contains("[]")) {
            braces = braces.replace("{}", "").replace("()", "").replace("[]", "");
        }
        return braces.length() == 0;
    }

    public boolean isValid2(String braces) {
        String b = braces;
        System.out.println(braces);
        for (int i = 0; i < braces.length() / 2; i++) {
            b = b.replaceAll("\\(\\)", "");
            b = b.replaceAll("\\[\\]", "");
            b = b.replaceAll("\\{\\}", "");
            if (b.length() == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean valid = new BraceChecker().isValid("[(])");
        System.out.println(valid);
    }
}

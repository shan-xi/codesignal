public class CheckPalindrome {
    boolean solution(String inputString) {
        if (inputString.length() == 1) {
            return true;
        }
        int total = 0;
        if (inputString.length() % 2 == 0) {
            total = inputString.length() / 2;
        } else {
            total = inputString.length() / 2 - 1;
        }
        for (int i = 0; i < total; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPalindrome a = new CheckPalindrome();
        System.out.println(a.solution("aabaa"));
        System.out.println(a.solution("abac"));
        System.out.println(a.solution("a"));
    }
}

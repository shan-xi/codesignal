public class CenturyFromYear {
    int solution(int year) {
        String y = String.valueOf(year);
        if (y.length() <= 2) {
            return 1;
        }
        if (y.length() == 3) {
            if (y.charAt(2) != '0') {
                return Integer.parseInt(y.substring(0, 1)) + 1;
            } else {
                return Integer.parseInt(y.substring(0, 1));
            }
        }
        if (y.length() == 4) {
            if (y.charAt(3) != '0') {
                return Integer.parseInt(y.substring(0, 2)) + 1;
            } else {
                return Integer.parseInt(y.substring(0, 2));
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        CenturyFromYear a = new CenturyFromYear();
        System.out.println(a.solution(2022));
        System.out.println(a.solution(1700));
        System.out.println(a.solution(100));
        System.out.println(a.solution(101));
        System.out.println(a.solution(1));
    }
}

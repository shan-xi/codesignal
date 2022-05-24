import java.util.Arrays;

public class MakeArrayConsecutive2 {
    int solution(int[] statues) {
        Arrays.sort(statues);
        int c = 0;
        for (int i = 1; i < statues.length; i++) {
            if (statues[i] - statues[i - 1] > 1) {
                c += statues[i] - statues[i - 1] - 1;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        MakeArrayConsecutive2 a = new MakeArrayConsecutive2();
        int[] status = {6, 2, 3, 8};
        System.out.println(a.solution(status));
        int[] status1 = {6, 2, 3, 10};
        System.out.println(a.solution(status1));
    }
}

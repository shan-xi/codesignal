public class ShapeArea {
    int solution(int n) {
        int i = 1;
        int lastIndex = 0;
        int lastSum = 0;
        while (i <= n) {
            if (i == 1) {
                lastIndex = 1;
                lastSum = 1;
            } else {
                lastSum = lastSum + 4 * lastIndex;
                lastIndex = i;
            }
            i++;
        }
        return lastSum;
    }

    public static void main(String[] args) {
        ShapeArea a = new ShapeArea();
        System.out.println(a.solution(1));
        System.out.println(a.solution(2));
        System.out.println(a.solution(3));
        System.out.println(a.solution(4));
        System.out.println(a.solution(5));
        System.out.println(a.solution(100));
        System.out.println(a.solution(1000));
    }
}

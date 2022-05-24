public class AdjacentElementsProduct {
    int solution(int[] inputArray) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] * inputArray[i + 1] > max) {
                max = inputArray[i] * inputArray[i + 1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        AdjacentElementsProduct a = new AdjacentElementsProduct();
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        System.out.println(a.solution(inputArray));
        int[] inputArray1 = {3, 6};
        System.out.println(a.solution(inputArray1));
    }
}

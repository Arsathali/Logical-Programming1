package logic.array;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1};
        int min = arr[0];

        for (int n : arr) {
            if (n < min) min = n;
        }
        System.out.println(min);
    }
}

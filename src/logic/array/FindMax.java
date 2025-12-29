package logic.array;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1};
        int max = arr[0];

        for (int n : arr) {
            if (n > max) max = n;
        }
        System.out.println(max);
    }
}

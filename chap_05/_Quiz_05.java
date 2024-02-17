package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int size = 250 + i*5;
            arr[i] = size;
        }

        for (int size : arr) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}

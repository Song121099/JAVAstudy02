package chap_06;

public class _06_WhenToUse {

    public static int getPower(int n) {
        return getPower(n,2);
    }
    public static int getPower(int n, int ep) {
        int result = 1;
        for (int i = 0; i < ep; i++) {
            result *= n;
        }
        return result;
    }


    public static void main(String[] args) {

        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result);

        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result);

        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result);

        System.out.println(getPower(2,2));
        System.out.println(getPower(3,3));
        System.out.println(getPower(4,2));

    }
}

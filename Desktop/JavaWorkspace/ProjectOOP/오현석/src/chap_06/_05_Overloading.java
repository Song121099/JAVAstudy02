package chap_06;

public class _05_Overloading {
    public static int getPower(int n) {
        return n * n;
    }

    public static int getPower(String strNumber){
        int n=Integer.parseInt(strNumber);
        return n*n;
    }

    public static int getPower(int n, int ep) {
        int result = 1;
        for (int i = 0; i < ep; i++) {
            result *= n;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower("4"));//전달되는 자료형에 따라/개수에 따라 다른 함수가 호출됨.(함수 중복 가능)
        System.out.println(getPower(3,3));
    }
}

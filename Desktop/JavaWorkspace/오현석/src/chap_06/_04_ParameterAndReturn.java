package chap_06;

public class _04_ParameterAndReturn {
    /*public static void power(int n){
        int result=n*n;
        System.out.println(n+"의 2승은 "+result);
    }

    public static void powep(int n,int ep){
        int result=1;
        for(int i=0;i<ep;i++){
            result*=n;
        }
        System.out.println(n+" 의 "+ep+" 승은 "+result);
    }*/
    public static int getPower(int n) {
        return n * n;
    }

    public static int getPowep(int n, int ep) {
        int result = 1;
        for (int i = 0; i < ep; i++) {
            result *= n;
        }
        return result;
    }

    public static void main(String[] args) {
        int g = getPower(2);
        System.out.println(g);

        int h=getPowep(3,3);
        System.out.println(h);

        System.out.println(getPowep(4,3));
    }
}

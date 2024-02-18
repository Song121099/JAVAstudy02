package chap_06;

public class _02_Parameter {
    public static void power(int n){
        int result=n*n;
        System.out.println(n+"의 2승은 "+result);
    }

    public static void powep(int n,int ep){
        int result=1;
        for(int i=0;i<ep;i++){
            result*=n;
        }
        System.out.println(n+" 의 "+ep+" 승은 "+result);
    }

    public static void main(String[] args) {
        power(3);
        power(4);

        powep(2,3);
        powep(3,3);
        powep(10,0);
    }
}

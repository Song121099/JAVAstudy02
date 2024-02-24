package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        //삼항 연산자
        //결관 = 조건 ? ( 참의 경우 결과값):거짓의 경우 결과값)
        int x=5;
        int y=3;
        int max = (x>y)? x:y;
        System.out.println(max);//5

        int a=3;
        int b=5;
        int min = (a<b)? a:b;
        System.out.println(min);//3

        boolean c =(x==y) ? true:false;
        System.out.println(c);//f

        String s =(x!=y)? "diff":"same";
        System.out.println(s);
    }
}

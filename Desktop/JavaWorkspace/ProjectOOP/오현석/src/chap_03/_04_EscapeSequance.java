package chap_03;

public class _04_EscapeSequance {
    public static void main(String[] args) {
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        System.out.println("자바가\n너무\n재밌어요");

        System.out.println("해물파전\t\t9000원");
        System.out.println("김치전\t\t8000원");
        System.out.println("부추전\t\t8000원");

        System.out.println("C:\\Program Files\\Java");// "\"문자열로 사용할 때 두 번 타입

        System.out.println("단비가 \"냐용\"이라고 했어요"); // \":큰따옴표 \':작은따옴표
        System.out.println("단비가 \'냐용\'이라고 했어요"); // \":큰따옴표 \':작은따옴표
        System.out.println("단비가 '냐용'이라고 했어요"); // \":큰따옴표 \':작은따옴표
        char c='A';
        c='\'';//이런 경우에 \활용
        System.out.println(c);
    }
}

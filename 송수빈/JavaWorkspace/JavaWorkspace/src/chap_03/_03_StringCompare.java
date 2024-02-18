package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); //문자열내용같 t / f

        //대소문자 구분없이 비교
        System.out.println(s2.equalsIgnoreCase("python")); //대소문자구분없이비교

        // 문자열 비교 심화
        s1 = "1234"; //벽에 붙은 메모지의 비번 정보 (참조하는 곳이 같음)
        s2 = "1234";
        System.out.println(s1.equals(s2)); //t (내용)
        System.out.println(s1 == s2); //t (참조)

        s1 = new String("1234") ;
        s2 = new String("1234") ;
        // s1과 s2가 내용은 같지만 참조하는(메모리) 것이 다름
        System.out.println(s1.equals(s2)); //true (내용)
        System.out.println(s1 == s2); //false (참조)
        // 참조하는 곳 말고 내용 비교하고 싶으면 equals 써야함


    }
}

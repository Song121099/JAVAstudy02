package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 ="Java";
        String s2 ="Python";

        System.out.println(s1.equals(s2));//f
        System.out.println(s1.equals("Java"));//t

        System.out.println(s2.equals("python"));//f 대소문자 구분
        System.out.println(s2.equalsIgnoreCase("python"));//대소문자 구분 안해도 됨

        //simhwa
        s1="1234"; //(참조)
        s2="1234";
        System.out.println(s1.equals(s2));//t
        System.out.println(s1 == s2);//t

        s1=new String("1234");//다른 공간의 메모리 oak
        s2=new String("1234");
        System.out.println(s1.equals(s2));//t
        System.out.println(s1 == s2);//같은 메모리를 할당 받아만 true
        //문자열 비교 equals 사용
    }
}

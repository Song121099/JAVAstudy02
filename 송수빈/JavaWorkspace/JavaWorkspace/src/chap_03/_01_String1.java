package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열길이
        System.out.println(s.length()); //29

        //대소문자변환
        System.out.println(s.toUpperCase()); //대문자로

        //소문자변환
        System.out.println(s.toLowerCase()); //소문자로

        //포함 관계
        System.out.println(s.contains("Java")); // 포함 t 비포함 f
        System.out.println(s.contains("C#")); //f
        System.out.println(s.indexOf("Java")); //위치정보 0부터 시작임
        System.out.println(s.indexOf("C#")); //없으면 -1
        System.out.println(s.indexOf("and")); //처음일치하는위치
        System.out.println(s.lastIndexOf("and")); //마지막일치위치
        System.out.println(s.startsWith("I like")); //이 문자열로 시작하는지 t / f
        System.out.println(s.endsWith(".")); //이 문자열로 끝나면 t / f



    }
}

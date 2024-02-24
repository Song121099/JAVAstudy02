package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        System.out.println(s.length()); //29s

        //대소문자변환
        System.out.println(s.toUpperCase()); //대문자로
        System.out.println(s.toLowerCase()); //소문자로

        //include relation
        System.out.println(s.contains("Java"));//t
        System.out.println(s.contains("C#"));//f
        System.out.println(s.indexOf("Java"));//위치정보7
        System.out.println(s.indexOf("C#")); //포함 x -1

        System.out.println(s.indexOf("and"));
        System.out.println(s.lastIndexOf("and"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.endsWith("."));
    }
}

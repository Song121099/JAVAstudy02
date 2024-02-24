package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String ssn ="000830-4020758";
        System.out.println(ssn.substring(0,8));
        System.out.println(ssn.substring(0,ssn.indexOf("-")+2));
    }
}

package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height1 =115;
        int height2 =121;
        String p1 = (height1>=120)?"가능":"불가능";
        String p2 = (height2>=120)?"가능":"불가능";

        System.out.println("키가 "+height1+"cm 이므로 탑승 "+p1+"합니다");
        System.out.println("키가 "+height2+"cm 이므로 탑승 "+p2+"합니다");

    }
}

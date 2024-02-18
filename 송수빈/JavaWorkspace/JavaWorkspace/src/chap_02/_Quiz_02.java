package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 125;

        String m = (height >= 120) ? ("키가" + height +"cm이므로 탑승 가능합니다") : ("키가" + height + "cm이므로 탑승 불가능합니다");

        System.out.println(m);

    }
}

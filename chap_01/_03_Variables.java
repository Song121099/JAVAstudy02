package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "톰 요크";
        int hour = 14;

        System.out.println(name + "님, creep을 " + hour + "시에 들었는데 좋습니다.");
        System.out.println(name + "님, No Surprises도 좋네요.");

        double score = 100.1;
        char grade = 'A';
        name = "Radio head";
        System.out.println(name + "님의 크립은 " + score + "점 입니다.");
        System.out.println("등급은 " + grade + "입니다");

        boolean pass = true;
        System.out.println("크립은 지리는 곡인가요? " + pass);

        double d = 3.14142452;
        float f = 3.14124531F; // double보다 정확성이 떨어지는 실수 자료형
        System.out.println(d);
        System.out.println(f);

        long l = 10000000000000L; //int형 -21~21억
        l = 10_000_000_000_000L;
        System.out.println(l);

        /*int, long, float, double, char, String, boolean*/
    }
}

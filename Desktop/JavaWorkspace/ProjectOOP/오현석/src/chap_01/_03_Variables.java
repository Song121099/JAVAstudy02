package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "오현석";
        //String name="오현석";
        int hour=15;

        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "송수빈";
        System.out.println(name + "님의 평균 점수는 "   + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true; //false도 가능
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;//정밀
        float f = 3.14123456789f;//깊은 소수점 필요 없는 실수
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l;
        l = 1_000_000_000_000l;
        //int i = 1000000000000; 범위 초과
        System.out.println(l);

        //int, long, float, double, char, String, boolean
    }
}


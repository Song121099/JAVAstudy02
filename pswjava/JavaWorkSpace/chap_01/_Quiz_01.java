package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 도착 정보를 출력하는 프로그램을 작성하시오.
        // 각 정보는 적절한 자료형의 변수에 정의합니다.
        // 정보) 버스 번호는 "1234", "상암08" 과 같은 형태
        //      남은 시간은 분 단위 (예: 3분, 5분)
        //      남은 거리는 km 단위 (예: 1.5km, 0.8km)

//        String busnum1 = "1234";
        String busnum2 = "상암08";

//        int leftime1 = 5;
        int leftime2 = 3;

//        double lefkm1 = 1.5;
        double lefkm2 = 1.2;

        System.out.println("\n");
//        System.out.println(busnum1 + "번 버스가 도착까지 " + leftime1 + "분 남았으며 남은 거리는 " + lefkm1 + "km 입니다.");
        System.out.println(busnum2 + "번 버스");
        System.out.println("약 " + leftime2 + "분 후 도착");
        System.out.println("남은 거리 " + lefkm2);

    }
}

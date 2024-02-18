package chap_04;

public class _06_While {
    public static void main(String[] args) {
        //반복문 while
        // 수영장에서 수영하는 모습
        int distance = 25; // 전체 거리 25
        int move = 0;// 현재 이동 거리 0
        while (move < distance){ // 현재이동거리가 전체거리보다 작을동안 반복
            System.out.println("발차기 계속");
            System.out.println("현재 이동 거리 :" + move);
            move += 3; // 3미터 이동
        }
        System.out.println("도착");

        // 무한 루프(탈출조건 만들어줘야함)
        move = 0;
        while (move < distance) {
            System.out.println("발차기 계속");
            System.out.println("현재 이동 거리 :" + move);
        }
        System.out.println("도착");

    }
}

package chap_04;

public class _10_break {
    public static void main(String[] args) {
        // Break
        // 치킨 집에서 매일 20마리만 판매 (1인1판매)

        int max = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 치킨 나왔음");
            if (i == max) {
                System.out.println("금일 재료 소진");
                break; //반복문 종료
            }
        }
        System.out.println();

        System.out.println("-------");

        //while 문
        int index = 1; // 손님 대기 번호
        while (index <= 50){
            System.out.println(index + "번 손님 치킨 나왔");
            if (index == max) {
                System.out.println("금일 재료 소진");
                break;
            }
            index++;
        }
        System.out.println("금일 영업 종료");


    }
}

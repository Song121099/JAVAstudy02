package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //Continue

        // 치킨 주문 손님 중 노쇼 손님 있다
        // For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noshow = 17; //대기번호 17번 손님 노쇼
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔");

            // 노쇼
            if (i == noshow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회 넘어갑니다");
                continue; // continue 가 되면
            }
            sold++;
            if (sold == max){
                System.out.println("");
                break;
            }
        }
        System.out.println("영업종료");

        System.out.println("--------------");

        //While 문
        int index = 0; // 손님 번호
        max = 20;
        sold = 0;
        noshow = 17;
       // while (index <= 50) {
        while(true){
            index++;
            System.out.println(index + "손님 치킨나옴");

            //손님이 없다면 noshow
            if (index == noshow) {
                System.out.println(index + "번 손님, 노쇼");
                continue;
            }

            sold++; //판매 처리
            if (sold == max) {
                System.out.println("금일재료소진");
                break;
            }
        }
        System.out.println("영업종료");


    }
}

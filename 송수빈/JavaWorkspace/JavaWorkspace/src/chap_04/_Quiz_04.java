package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 8;
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabled = false; //장애인차량 여부

        int fee = hour * 4000;

        if (fee > 30000) {
            fee = 30000;
        }
        if (isSmallCar || withDisabled) {
            fee /= 2;
        }

        System.out.println("주차 요금은" + fee + "원");

    }
}

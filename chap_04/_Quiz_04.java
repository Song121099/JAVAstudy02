package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        boolean issmall = false;
        boolean isdisabled = true;
        int hour = 10;
        int pay= hour * 4000;

        if (pay >30000)
            pay = 30000;

        if (issmall || isdisabled)
            System.out.println("주차 요금은 " + pay/2 + " 원입니다.");
        else
            System.out.println("주차 요금은 "+ pay + " 원입니다.");

    }
}

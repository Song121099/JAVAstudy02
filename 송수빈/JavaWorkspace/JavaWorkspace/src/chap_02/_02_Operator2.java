package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 대입 연산자
        int num = 10;
        num = num + 2;
        System.out.println(num); //12

        num = num -2;
        System.out.println(num); //10

        num = num * 2;
        System.out.println(num); //10

        num = num /2 ;
        System.out.println(num); //5

        num = num % 2;
        System.out.println(num); //0

        // 복합대입 연산자
        num = 10;
        // num = num + 2;
        num +=2;
        System.out.println(num); //12

        //num = num -2;
        num -= 2; //10
        System.out.println(num);

        //num = num * 2;
        num *=2; //20
        System.out.println(num);

        //num = num /2 ;
        num /= 2;
        System.out.println(num);

        //num = num % 2;
        num %=2; //0
        System.out.println(num);





    }
}

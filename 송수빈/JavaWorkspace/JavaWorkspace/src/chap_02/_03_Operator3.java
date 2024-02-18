package chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        //비교 연산자
        System.out.println(5 > 3); // 5는 3보다 크다 (참이면 true)
        System.out.println(5 >= 3); // 5는 3보다 크같 (t)
        System.out.println(5 >= 3); // 5는 5보다 크거나 같다 (t)
        System.out.println(5 >= 7); //5는 7보다 크같(f)

        System.out.println(5 < 3); //5는 3보다 작다(f)
        System.out.println(5 <= 3); //5는 3보다 작같 (f)

        System.out.println(5 == 5); //5=5 (t)
        System.out.println(5 == 3); //5=3 (f)
        System.out.println(5 != 5); //5는 5와같지않다(f)
        System.out.println(5 != 3); //5는 3과 같지않다(t)


    }
}

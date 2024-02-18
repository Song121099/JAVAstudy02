package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // For 반복문
        // 나코 매장
        System.out.println("어서오세요, 나코입니다.");
        // 또다른 손님이 온다면?
        System.out.println("어서오세요, 나코입니다.");
        System.out.println("어서오세요, 나코입니다.");
        System.out.println("어서오세요, 나코입니다.");
        System.out.println("어서오세요, 나코입니다.");
        //만약 인사 법이 바뀌면?
        System.out.println("환영합니다., 나코입니다.");
        System.out.println("환영합니다., 나코입니다.");
        System.out.println("환영합니다., 나코입니다.");
        System.out.println("환영합니다., 나코입니다.");

        System.out.println("---반복문 사용---");

        // 반복문 사용 for
        //for (선언 ; 조건; 증감)
        for (int i = 0; i < 10 ; i++){
            //System.out.println("어서오세요. 나코입니다." +i);
            //System.out.println("환영합니다. 나코입니다." +i);
            System.out.println("환영합니다. 코나입니다." +i);
        }

        // 짝수만 출력 (fori 만 적고 엔터)
        // 0, 2, 4 , 6, 8
        for (int i = 0; i < 10 ; i += 2) {
            System.out.println(i);
        }

        //홀수만 출력
        for (int i = 1; i < 10; i +=2) {
            System.out.println(i);
        }

        //거꾸로 숫자
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        //1부터 10까지 수의 합
        // 1+2+---+10 = 55
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum +=i;
            System.out.println("현재총합"+sum);
        }
        System.out.println("1부터 10까지 총합"+sum );

    }
}

package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        // 한라봉 에에드가 있으면 +1
        // 또는망고 주스가 있으면 +1
        // 또는 아아메 +1

        boolean hallabong = false; // 한라봉에이드
        boolean mangoJuice = true; // 망고주스

        if (hallabong) {
            System.out.println("한라에이드 +1");
        } else if (mangoJuice){
            System.out.println("망고주스 +1");
        } else {
            System.out.println("아아메 +1");
        }
        System.out.println("커피 주문 완료 #1");

        // else if는 여러번 사용 가능
        hallabong = false;
        mangoJuice = false;
        boolean orangejuice = true;

        if (hallabong) {
            System.out.println("한라에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고주스 +1");
        }else if (orangejuice){
                System.out.println("오렌지주스 +1");
        } else {
            System.out.println("아아메 +1");
        }
        System.out.println("커피 주문 완료 #2");

        // else는 없어도됨
        hallabong = false;
        mangoJuice = false;
        orangejuice = false;

        if (hallabong) {
            System.out.println("한라에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고주스 +1");
        }else if (orangejuice){
            System.out.println("오렌지주스 +1");
        }

        System.out.println("커피 주문 완료 #2");


    }
}

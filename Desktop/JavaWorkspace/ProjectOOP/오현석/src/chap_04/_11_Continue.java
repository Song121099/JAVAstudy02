package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        int max=20;
        int sold=0;
        int noShow=17;
        for(int i=1;i<=50;i++){
            System.out.println(i+"번 손님 주문하신 치킨 나욌습니다.");

            if(i==noShow){
                System.out.println(i+" fuck off");
                continue;
            }
            sold++;
            if(sold==max){
                System.out.println("Sorry sold out");
                break;
            }
        }
        System.out.println("We're closed");

        System.out.println("-----------------");
        sold=0;
        int index=1;
        while(index<=50){
            System.out.println(index+"번 손님 주문하신 치킨 나왔습니다");
            if(index==noShow){
                System.out.println(index+" fuck off");
                index++;
                continue;
            }
            sold++;
            if(sold==max){
                System.out.println("Sorry sold out");
                break;
            }
            index++;
        }
        System.out.println("We're closed");
    }
}

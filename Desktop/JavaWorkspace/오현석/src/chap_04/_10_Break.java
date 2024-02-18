package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        //break;
        int max=20;
        for(int i=1;i<=50;i++){
            System.out.println(i+"번 손님, 주문하신 치킨 나왔습니다.");
            if(i==max){
                System.out.println("Sorry sold out");
                break;
            }
        }
        System.out.println("We're closed");
        System.out.println("-------------------------");
        int index=1;
        while(index<=50){
            System.out.println(index+"번 손님, 주문하신 치킨 나왔습니다.");
            if(index==max){
                System.out.println("Sorry sold out");
                break;
            }
            index++;
        }
        System.out.println("We're closed");
    }
}

package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffeeOrder=new String[]{"americano","cafe_mocha","latte","cappuccino"};
        for(int i=0;i<coffeeOrder.length;i++){//개수 조절 가능
            System.out.println(coffeeOrder[i]+" one");
        }
        System.out.println("to go please");

        System.out.println("-----------");
        for(String coffee:coffeeOrder){//처음부터 끝까지 순회
            System.out.println(coffee+" one");
        }
        System.out.println("to go please");
    }
}

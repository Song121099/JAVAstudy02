package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        String coffeedad="americano";
        String coffeemom="cafe_mocha";
        String coffeeme="latte";
        String coffeesister="cappuccino";

        System.out.println(coffeedad+" one");
        System.out.println(coffeemom+" one");
        System.out.println(coffeeme+" one");
        System.out.println(coffeesister+" one");
        System.out.println("to go please");

        System.out.println("-----------");

        String[] cafeOrder=new String[4];

        //String cafeOrder[] =new String[4];

        cafeOrder[0]="americano";
        cafeOrder[1]="cafe_mocha";
        cafeOrder[2]="latte";
        cafeOrder[3]="cappuccino";

        for(int i=0;i<4;i++){
            System.out.println(cafeOrder[i]+" one");
        }
        System.out.println("to go please");

        System.out.println("-----------");

        String[] coffeeOrder=new String[]{"americano","cafe_mocha","latte","cappuccino"};
        for(int i=0;i<4;i++){
            System.out.println(coffeeOrder[i]+" one");
        }
        System.out.println("to go please");

        System.out.println("-----------");

        String[] coffees={"americano","cafe_mocha","latte","cappuccino"};

        coffees[2]="espresso";

        for(int i=0;i<4;i++){
            System.out.println(coffees[i]+" one");
        }
        System.out.println("to go please");
    }
}

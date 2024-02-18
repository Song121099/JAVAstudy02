package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        //if else
        int hour=15;
        if(hour<14){
            System.out.println("c +1");
        }
        else {
            System.out.println("de c +!");
        }
        System.out.println("order complete #1");

        hour = 10;
        boolean mc=false;
        if(hour>=14 || mc){
            System.out.println("de c +1");
        }
        else{
            System.out.println("c +1");
        }
        System.out.println("order complete #2");
    }
}

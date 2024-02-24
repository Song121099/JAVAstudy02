package chap_04;

public class _01_if {
    public static void main(String[] args) {
        int hour = 15;
        if (hour < 14) {
            System.out.println("coffee +1");
            System.out.println(("add shot"));
        }

        System.out.println("coffee order complete #1\n");

        hour=10;
        boolean morningCoffee=false;
        //if(hour<14&&morningCoffee==false)
        if(hour<14&&!morningCoffee)
        {
            System.out.println("coffee +1");
        }
        System.out.println("coffee order complete #2\n");

        hour=15;
        morningCoffee = false;
        if(hour >=14 || morningCoffee){
            System.out.println("coffee decaffein +1");
        }
        System.out.println("coffee order complete #3\n");
    }
}

package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        //choco +1
        //mango +1
        //c +!

        boolean choco = false;
        boolean mango = false;
        boolean orange =true;

        if(choco) {
            System.out.println("choco +1");
        }
        else if(mango){
            System.out.println("mango +1");
        }
        else {
            System.out.println("c +1");
        }
        System.out.println("order complete #1");



        if(choco) {
            System.out.println("choco +1");
        }
        else if(mango){
            System.out.println("mango +1");
        }
        else if(orange){
            System.out.println("orange +1");
        }
        else {
            System.out.println("c +1");
        }
        System.out.println("order complete #2");
    }
}

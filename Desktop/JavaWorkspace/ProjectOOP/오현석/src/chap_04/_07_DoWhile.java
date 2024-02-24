package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        int distance=25;
        int move=0;
        int height =2;
        while(move+height<distance){
            System.out.println("keep pedaling");
            System.out.println("current location : "+move);
            move+=3;
        }
        System.out.println("Arrived");

        System.out.println("--");

        move=0;
        height=25;
        while(move+height<distance){
            System.out.println("keep pedaling");
            System.out.println("current location : "+move);
            move+=3;
        }
        System.out.println("Arrived");

        System.out.println("--");
        do{
            System.out.println("keep pedaling");
            System.out.println("current location : "+move);
            move+=3;
        }while(move+height<distance);
        System.out.println("Arrived");
    }
}

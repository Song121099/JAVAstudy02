package chap_04;

public class _06_While {
    public static void main(String[] args) {
        int distance =25;
        int move =0;
        while(move<distance){
            System.out.println("keep pedaling");
            System.out.println("current location : " +move);
            move +=3;//탈출 조건
        }
        System.out.println("Ariived");
    }
}

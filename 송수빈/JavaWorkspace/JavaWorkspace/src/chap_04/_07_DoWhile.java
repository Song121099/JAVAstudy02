package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25;
        int move = 0;
        int height = 2; // 키 2m
        while (move + height < distance) {
            System.out.println("발차기");
            System.out.println("현재 이동 거리" + move);
            move +=3 ;
        }
        System.out.println("도착");

        System.out.println("---반복문#1");

        move = 0;
        height = 25; // 키 2m
        while (move + height < distance) {
            System.out.println("발차기");
            System.out.println("현재 이동 거리" + move);
            move +=3 ;
        }
        System.out.println("도착");

        System.out.println("---반복문#2");

        //Do While 반복문 (한번은무조건수행)
        do {
            System.out.println("발차기");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }while (move + height < distance);
        System.out.println("도착");
    }
}

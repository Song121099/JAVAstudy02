package chap_06;

public class _01_Method {
    public static void sayHello(){
        System.out.println("Hello World!");//define
    }

    public static void main(String[] args) {
        System.out.println("B");
        sayHello();//call
        System.out.println("D");
    }
}

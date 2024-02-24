package chap_06;

public class _03_Return {
    public static String pn(){
        String pn="02-1234-5678";
        return pn;
    }

    public static String getAddress(){
        return "Seoul";
    }

    public static String getAc(){
        return "swim, balling";
    }

    public static void main(String[] args) {
        String number=pn();
        System.out.println(number);

        String address=getAddress();
        System.out.println(address);

        System.out.println(getAc());
    }
}

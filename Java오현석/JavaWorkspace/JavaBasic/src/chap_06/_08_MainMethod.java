package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        for(String s:args){
            System.out.println(s);
        }

        if(args.length==1){
            switch (args[0]){
                case "1":
                    System.out.println("search");
                    break;
                case "2":
                    System.out.println("lend");
                    break;
                case "3":
                    System.out.println("return");
                default:
                    System.out.println("wrong");
            }
        }else {
            System.out.println("go back to 1~3");
        }
    }
}

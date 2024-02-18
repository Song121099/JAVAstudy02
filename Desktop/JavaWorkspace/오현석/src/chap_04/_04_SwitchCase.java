package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        int rank=1;
        if(rank==1){
            System.out.println("all");
        }
        else if(rank==2||rank==3){
            System.out.println("half");
        }
        else{
            System.out.println("none");
        }
        System.out.println("search complete #1");

        rank=2;
        switch (rank){
            case 1:System.out.println("all");
                break;
            case 2:
            case 3:System.out.println("half");
                break;
            default:System.out.println("none");
        }
        System.out.println("search complete #2");

        int grade=1;
        int price =7000;
        switch(grade){
            case 1:
                price +=1000;
            case 2:
                price+=1000;
            case 3:
                price+=1000;
                break;
        }
        System.out.println(grade+"grade "+price+"won");
    }
}

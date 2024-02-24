package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        boolean pasta = true;
        boolean hotdog = true;
        boolean taco = true;

        System.out.println(pasta || hotdog || taco);//t
        System.out.println(pasta && hotdog && taco);//t

        System.out.println((5>3)&&(3>1));//t
        System.out.println((5>3)&&(3<1));//f

        System.out.println((5>3)||(3>1));//t
        System.out.println((5>3)||(3<1));//t
        System.out.println((5<3)||(3<1));//f

        //System.out.println(1<3<5);//impossible

        System.out.println(!true);//f
        System.out.println(!false);//t
        System.out.println(!(5==5));//f
        System.out.println(!(5==3));//t
    }
}

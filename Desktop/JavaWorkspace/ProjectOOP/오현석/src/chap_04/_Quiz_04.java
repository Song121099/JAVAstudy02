package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
         int hour=5;
         boolean small =false;
         boolean disabled =false;

         int fare=hour*4000;
         if(fare>=30000){
             fare=30000;
         }

         if(small||disabled){
             fare/=2;
         }

        System.out.println("주차요금은 "+fare+"원 입니다.");
    }
}

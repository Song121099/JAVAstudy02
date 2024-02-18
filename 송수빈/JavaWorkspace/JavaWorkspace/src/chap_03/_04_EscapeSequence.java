package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수 문자, 이스케이프 문자
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄바꿈
        System.out.println("재미가 \n 너무 \n 자바어요");

        //해물파전 9000원
        // 김치전 8000원
        // 부추전 8000원

        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t\t8000원");

        System.out.println("C:\\Program Files\\Java");
        //역슬래시는입력하려면두번써야됨

        // \" : 큰따옴표
        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\"이라고 했어요");

        // \' : 작따
        // 단비가 '뭘봐' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘봐\'하는 표정을 지었어요");
        System.out.println("단비가 '뭘봐'하는 표정을 지었어요");

        char c = 'A';
        c = '\''; // 작따 하나만 입력하려면 역슬레시 안에 넣어야
        System.out.println(c);

    }
}

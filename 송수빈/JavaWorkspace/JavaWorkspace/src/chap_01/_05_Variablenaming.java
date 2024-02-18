package chap_01;

public class _05_Variablenaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능 (공백은 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능 숫자로는 시작 불가
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어는 사용 불가(public static void int double float ...)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; //국적
        String firstName = "현성"; //이름
        String lastName = "김"; //성
        String dateOfBirth = "1999.12.10"; //생년월일
        String residentialAddress = "무슨 호텔"; //체류지
        String purposeOfVisit = "여행"; //입국목적
        String flighNo = "KE657"; //항공편명
        String _flightNo = "KE657"; // 밑줄 시작
        String flight_no_2 = "KE657";
        //String -flight_no = "ke657";

        int accompany = 2; //동반 가족 수
        int lengthOfStay = 5; // 체류 기간

        String item = "시계";
        String item2 = "가방";
        //String 3item = "가방"; //숫자 먼저 나오면 안 됨

        //프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요치 않을 때)
        int i = 0;
        String s = "djlsnfe";

        //절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";//절대 변하지 않는 값에 대해서는 앞에 final을 붙여주면 됨


    }
}

package chap_06;

public class _Quiz_06 {
//    public static String getHiddenData(String str, int num) {
//        int len = str.length()-num; // 별 개수
//        String starstr = "";
//        for (int i = 0; i < len; i++) {
//            starst r = starstr + "*";
//        }
//        String temp = str.substring(0, num);
//
//        return temp + starstr;
//    }      ㄴ개선의 여지가 너무 많다.
    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index);
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }
    public static void main(String[] args) {
        String name = "박세웅"; // 이름
        String id = "010430-1234567"; // 주민등록번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름 : " + getHiddenData(name, 1)); // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}

package chap_01;

import java.sql.SQLOutput;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형 변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score); //93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        //float double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f); //93
        System.out.println((int) score_d); //98

        // 정수 + 실수 연산
        score = 93 + (int)98.8; //93 + 98
        System.out.println(score);

        score_d = (double) 93+ 98.8; // 정수에서 실수는 따로 변환하지 않아도 자동으로 실수화 됨
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; //191 -> 191.0
        // int -> long -> float -> double (자동 형 변환)
        // 그니까 수 범위가 작은 애를 큰 애로 옮기려고 할 때에는 그냥 자동으로 되는데 큰 애를 작은 애로 넣을 땐 변환 필요
        // 실수들은 정수로 변환하기 위해서는 앞에 무조건 (int) 넣어줘!!!!!!!!!!!
        // 정수를 실수로 바꿀 때에는 자동 실수를 정수로 바꿀 때에는 키워드 필요
        int convertedScore = (int) score_d; //191.8->191

        //숫자를 문자열로
        String s1 = String.valueOf(93); //지금은 일단 알아만 둬
        s1 = Integer.toString(93); //93 위에 거랑 똑같음 둘 중 하나 써

        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); //98.8

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d); //98.8

        int error = Integer.parseInt("java"); //문자열을 숫자로 바꿀 때에는 따옴표 안에 숫자
        











    }
}

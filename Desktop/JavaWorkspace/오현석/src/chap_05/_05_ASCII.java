package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        char c='A';//A=65 a=97 0=48
        System.out.println(c);
        System.out.println((int)c);

        c='B';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        String[][] s=new String[10][15];
        char ch='A';

        for(int i=0;i<s.length;i++){
            for(int j=0;j<s[i].length;j++){
                s[i][j]=String.valueOf(ch)+(j+1);
            }
            ch++;
        }
        for(int i=0;i<s.length;i++){//세로기준
            for(int j=0;j<s[i].length;j++){//가로기준
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }
    }
}

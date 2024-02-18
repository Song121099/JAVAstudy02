package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats=new String[][]{//3X5 크기의 2차원 배열
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };

        for(int i=0;i<seats.length;i++){//세로기준
            for(int j=0;j<seats[i].length;j++){//가로기준
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }

        String[][] seats2={
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };
        for(int i=0;i<seats2.length;i++){//세로기준
            for(int j=0;j<seats2[i].length;j++){//가로기준
                System.out.print(seats2[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("-----------------------");
        String[][] s=new String[10][15];
        String[] eng={"A","B","C","D","E","F","G","H","I","J"};
        for(int i=0;i<s.length;i++){
            for(int j=0;j<s[i].length;j++){
                s[i][j]=eng[i]+(j+1);
            }
        }
        s[7][8]="___";
        s[7][9]="___";

        for(int i=0;i<s.length;i++){//세로기준
            for(int j=0;j<s[i].length;j++){//가로기준
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }
    }
}

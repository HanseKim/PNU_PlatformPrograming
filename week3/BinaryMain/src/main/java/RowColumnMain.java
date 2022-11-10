import java.util.Scanner;

public class RowColumnMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row,column;
        row = sc.nextInt(); column = sc.nextInt();
        int [][]matrix = new int[row][column];
        int cnt=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = cnt++;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++) {
                if (j < column - 1) {
                    System.out.printf("%d, ", matrix[i][j]);
                } else {
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }
}

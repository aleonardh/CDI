import java.util.Arrays;
public class Matrix{

    int[][] matrix;

    int n;

    public Matrix(int n){
        this.n = n;
        this.matrix = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = (i+j);
            }

        }

    }

    public int getHeight(){
        return this.n;
    }

    public int getWidth(){
        return this.n;
    }

    public void setValPos(int i, int j){
        matrix[i][j] *=2;
    }

    public void printMatrix(){
//         for (int i = 0; i < n; i++){
//             for (int j = 0; j < n; j++){
//                 x[i][j] = (i+j);
//             }
//
//         }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
import Java.util.Arrays;
public class Matrix{

    int[][] matrix;

    int n;

    public Matrix(int n){
        this.n = n;
        this.matrix = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                x[i][j] = (i+j);
            }

        }

    }

    public int getHeight(Matrix matrix){
        return this.n;
    }

    public int getWidth(Matrix matrix){
        return this.n;
    }

    public void setValPos(int i, int j){
        matrix[i][j] *=2;
    }

    public String toString(){
//         for (int i = 0; i < n; i++){
//             for (int j = 0; j < n; j++){
//                 x[i][j] = (i+j);
//             }
//
//         }

        System.out.println(Arrays.deepToString(matrix));

    }

}
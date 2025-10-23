public class simpleMatrixMultiplication
{
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int c[][]=new int[A.length][B[0].length];
       for(int i=0;i<A.length;i++)
       {
           for(int j=0;j<B[0].length;j++)
           {
               c[i][j]=0;
               for(int k=0;k<B.length;k++)
               {
                   c[i][j]=c[i][j]+A[i][k]*B[k][j];
               }
           }
       }
        return c;
    }

    public static void main(String[] args) {
      
        int[][] A = {
            {1, 1, 3},
            {5, 2, 6},
            {-2, -1, -3}
        };

        // Matrix B
        int[][] B = {
            {2, 1, 1},
            {1, 2, 3},
            {2, 3, 4}
        };

     
        int[][] C = multiplyMatrix(A, B);

      
        System.out.println("Result of A x B:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

}
 

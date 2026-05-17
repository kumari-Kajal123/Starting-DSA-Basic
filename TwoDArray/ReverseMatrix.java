package TwoDArray;

public class ReverseMatrix {
    public static void main(String[] args) {
        
        int[][] arr = { {5,6,3,2} , {4,7,9,0} , {3,5,1,2} , {4,6,1,8} , {6,3,2,8} };

        // TRANSPOSE
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < i ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // PRINTING TRANSPOSE 
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // for(int i = arr.length - 1 ; i>=0 ; i--){
        //     for(int j=arr[0].length - 1 ; j>=0 ; j--){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i = arr[0].length - 1; i >= 0; i--) {
        //     for(int j = arr[0].length - 1 ; j>=0 ; j--){
        //         System.out.print(arr[i][j] + " ");

        //     }
        //     System.out.println();
        // }

    }
}

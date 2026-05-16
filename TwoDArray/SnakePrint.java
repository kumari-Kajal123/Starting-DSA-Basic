package TwoDArray;

public class SnakePrint {
    public static void main(String[] args) {

        int[][] arr = { {5,6,3,2} , {4,7,9,0} , {3,5,1,2} , {4,6,1,8} };

        // PRINTING ROW WISE
        for(int i =0 ; i < arr.length ; i++){
            if (i%2 == 0) {
                for(int j =0 ; j<arr[0].length ; j++){
                    System.err.print(arr[i][j]+" ");
                }
            }else{
                for(int j =arr[0].length-1 ; j>=0 ; j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }

        // PRINTING COLUMN WISE        
        for(int i =0 ; i < arr.length ; i++){
            if (i%2 == 0) {
                for(int j =0 ; j<arr[0].length ; j++){
                    System.err.print(arr[j][i]+" ");
                }
            }else{
                for(int j =arr[0].length-1 ; j>=0 ; j--){
                    System.out.print(arr[j][i]+" ");
                }
            }
            System.out.println();
        }


    }
}

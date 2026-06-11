package TwoDArray;

public class RotateImage {
    public static void main(String[] args) {
        
        int[][] arr = { {5,6,3} , {7,9,0} , {5,1,2} };
     
        for(int i =0 ; i<arr.length ; i++){
            for(int j =0 ; j<i ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    

    }
}

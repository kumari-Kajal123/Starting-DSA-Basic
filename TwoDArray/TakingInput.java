package TwoDArray;
import java.util.*;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[3][4];
    
        int[][] arr = { {5,6,3,2} , {4,7,9,0} , {3,5,1,2} };
        int sum=0;

        for(int i = 0 ; i< arr.length ; i++){
            for(int j =0 ; j< arr[0].length ; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);

        // int[][] arr = { {5,6,3,2} , {4,7,9,0} , {3,5,1,2} };
        // for(int i = 0 ; i< arr.length ; i++){
        //     for(int j = 0 ; j< arr[0].length  ; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        // for(int i = 0 ; i< arr.length ; i++){
        //     for(int j = 0 ; j< arr[0].length  ; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

    }
}

public class MaxSubArrays {
    public static void maxsum(int arr[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i; j < arr.length; j++){
                curr=0;
                for(int k = i; k <= j; k++){
                    curr += arr[k];
                }
                if (max < curr) {
                    max = curr;
                }
            }
        }
        System.out.println( "maximum sum " + max);
    }

    public static void main(String[] args) {
        // int arr[] = { 1, -2, 6, -1, 3 };
        int arr[] = {2,4,6,8,10};
        maxsum(arr);
        
    }
}

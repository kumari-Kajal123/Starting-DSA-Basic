public class LargestNumber {
    public static int largest(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0 ; i<arr.length ; i++){
            if (max < arr[i]) {
               max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println( "smaller "+  min);
        return max;

    }
    public static void main(String[] args) {
        int arr[] = { 0, 2, 16, 3, 5 };
        System.out.println("greater " + largest(arr));
        
    }
}

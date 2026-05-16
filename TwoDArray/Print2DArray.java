package TwoDArray;

public class Print2DArray {
    public static void main(String[] args) {
    
        int[][] arr = { {5,6,3,2} , {4,7,9,0} , {3,5,1,2} };

        // APPLYING FOREACH LOOP
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        System.out.println("This is next method");

        // USING FOR LOOP
        int sum =0;
        for(int j = 0 ; j< arr[0].length;j++){
            for(int i=0 ; i< arr.length ; i++){
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
        
    }
}
public class KadanesAlgorithm {
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        // int arr[] = {-1,-2,-3,-4};
        int curr=0;
        int max=Integer.MIN_VALUE;
        // for(int i=0 ; i<arr.length; i++){
        //     curr = curr + arr[i];
        //     if (arr[i] < max) {
        //         curr += max;
        //     }else {
        //         curr++;
        //     }
        // }
        // System.out.println(curr);
        for(int i=0 ; i< arr.length;i++){
            curr = curr + arr[i] ;
            if (curr < 0) {
                curr = 0 ;
            }
            max = Math.max(curr, max);

        }
        if (max == 0) {
            System.out.println("-1");
        }else{
            System.out.println(max);
        }
    }
}

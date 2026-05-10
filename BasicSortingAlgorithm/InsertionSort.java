package BasicSortingAlgorithm;

public class InsertionSort {
    public static void insertion(int arr[]) {

    for(int i = 1; i < arr.length; i++) {

        int curr = arr[i];
        int prev = i - 1;

        while(prev >= 0 && arr[prev] > curr) {

            arr[prev + 1] = arr[prev];
            prev--;
        }

        arr[prev + 1] = curr;
    }
}
    public static void printinsertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2,6,8,2,1,3,5 };
        insertion(arr);
        printinsertion(arr);
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 2,4,6,8,10,12,14,16,18 };
        int key = 2;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                System.out.println("key found at " + mid);
            }
            if (arr[mid] < key) {
                start = mid + 1;

            }else{
                end = mid - 1;
            }
            
        }

    }
}


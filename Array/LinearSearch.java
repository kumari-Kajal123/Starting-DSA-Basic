public class LinearSearch {
    public static void arr(int arr[] , int key){
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == key){
                System.out.println("found arr key at " + i);
            }
        }
        return;        
    }
    public static void menu(String menu[] , String keyMenu){
        for(int i = 0 ; i < menu.length ; i++){
            if (menu[i] == keyMenu) {
                System.out.println("found menu at index " + i);
            }
        }
        return;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16};
        int key = 16;

        arr(arr, key);

        String menu[] = {"dosa" , "panner" , "chole" , "bhature"};
        String keyMenu = "chole";

        menu(menu, keyMenu);

    }
}

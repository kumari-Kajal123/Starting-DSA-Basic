package String;

public class Palindrome {

    public static void Changing(int age){
        int newAge = 30;
    }

    public static void main(String[] args) {
        int age = 10;
        System.out.println( "Before " + age);
        Changing(age);
        System.out.println("After " +  age);


        String name = "car";
        int left = 0;
        int right = name.length() - 1;
        while (left <= right) {
            if ( name.charAt(left) != name.charAt(right) ) {
                System.out.println("false");
                return;
            }
            left++;
            right--;
        }
        System.out.println("true");

    }
}

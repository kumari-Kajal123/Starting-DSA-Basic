package String;

import java.util.Scanner;

public class TakingInputString {
    public static void main(String[] args) {

        String s = "kajal";
        // System.out.println(s.toUpperCase());
        // System.out.println(s.toLowerCase());
        int count = 0;
        for(int i= 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch == 'u') {
                count++;
            }
        }
            System.out.println(count);

        // Scanner sc = new Scanner(System.in);
        // // emoji does not include 💀
        // String name = sc.nextLine();
        // System.out.println(name);
        // // printing index of string
        // // System.out.println(name.charAt(3)); 
        // System.out.println( "total length is " + name.length());

    }
}

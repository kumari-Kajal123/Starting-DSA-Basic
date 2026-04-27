import java.util.Scanner;

public class Day1{
        public static void main(String[] args) {
        // TAKING INPUT
        int number[] = new int[100];
        Scanner sc = new Scanner(System.in);
        int phy = sc.nextInt();
        System.out.println("phy marks : "  + phy);
        int chem = sc.nextInt();
        System.out.println("chem marks : " + chem);
        int math = sc.nextInt();
        System.out.println("math marks : " + math);
        System.out.println("Total " + ((phy + chem + math)/2) );
        System.out.println( "length of array " + number.length);

    }
}
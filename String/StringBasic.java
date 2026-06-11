package String;

public class StringBasic {
    public static void main(String[] args) {
        char[] letter = { 'k' , 'a' , 'j'  , 'a' , 'l' };

        //IT PRINTS THE NUMBER OF LETTER
        for(int get : letter){
            System.out.print(get+" ");
        }
        //IT PRINT EXACT LETTER
        System.out.println();
        for(char get : letter){
            System.out.print(get+" ");
        }
        System.out.println();

        //IT IS FULL/LINE OF STRING 
        String name = "kajal is a good girl.";
        System.out.println(name);

    }
}

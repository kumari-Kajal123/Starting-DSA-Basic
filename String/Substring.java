package String;

public class Substring {
    public static void main(String[] args) {
        
        String name = "kajal";
        //USING BUILTIN FUNCTION
        for(int i = 0 ; i< name.length() ; i++){
            for(int j =i+1; j<=name.length() ; j++){
                System.out.print( name.substring(i, j)+" " ); 
            } 
            System.out.println();
        }



    }
}

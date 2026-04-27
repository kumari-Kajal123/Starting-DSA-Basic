public class Day2 {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
        public static void main(String[] args) {

        //FUNCTION ARGUMENT
        int marks[] = {97,87,25};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i] + " ");
        }
        System.out.println();
        System.out.println("Editing first time on github directly");
    }
}

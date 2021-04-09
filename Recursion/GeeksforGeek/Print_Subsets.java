package Basic_Question;

public class Print_Subsets {

    protected static void print_subsets(String s, String current, int index){
        if(index == s.length()){
            System.out.println(current);
            return;
        }
        print_subsets(s, current, index+1);
        print_subsets(s,current + s.charAt(index), index+1);
    }

    public static void main(String[] args) {
        String text = "ABC";
        String current_text = "";
        int index = 0;
        print_subsets(text, current_text, index);
    }
}

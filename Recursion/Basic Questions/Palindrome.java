package Basic;

public class Palindrome {

    //TC: T(n-2) + T(1)
    protected static boolean check_palindrome(String text, int start_index, int end_index){
        if(start_index >= end_index){
            return true;
        }
        if(!(text.charAt(start_index) == text.charAt(end_index))){
            return false;
        }
        return check_palindrome(text, start_index+1, end_index-1);
    }

    public static void main(String... args){
        String text = "AbbabbA";
        System.out.println(check_palindrome(text, 0, text.length()-1));
    }
}

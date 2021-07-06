package Easy;



//Leetcode: 1876
//Easy
public class SubstringswithDistinctCharacters {

    //Sliding Window Algorithm
    public void countSubstring(String s){
        int count = 0;
        String customSubstring = "";
        int k = 3;
        if(s.length() < k){
            return;
        }
        for(int j = 0; j <= s.length()-k; j++){
//            if(customSubstring.length() != k){
//                customSubstring = customSubstring +  s.charAt(j);
//            }
            //else{
                customSubstring = s.substring(j,j+k);
            //}
            System.out.println(customSubstring);
            if(customSubstring.length() == k) {
                if (customSubstring.charAt(0) != customSubstring.charAt(1) &&
                        customSubstring.charAt(1) != customSubstring.charAt(2) &&
                        customSubstring.charAt(0) != customSubstring.charAt(2)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }


    public static void main(String... strings){
        SubstringswithDistinctCharacters substringswithDistinctCharacters = new SubstringswithDistinctCharacters();
        //String s = "aababcabc";
        String s = "xyzzaz";
        substringswithDistinctCharacters.countSubstring(s);

    }
}

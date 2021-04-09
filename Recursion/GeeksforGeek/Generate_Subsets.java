package Basic_Question;

import java.util.ArrayList;
import java.util.List;

public class Generate_Subsets {
    protected static List<String> generateSubsets(String text, String current_text,int index, List<String> subset_list){
        if(index == text.length()){
            subset_list.add(current_text);
            return subset_list;
        }
        generateSubsets(text, current_text, index+1, subset_list);
        generateSubsets(text, current_text + text.charAt(index), index+1, subset_list);
        return subset_list;
    }


    public static void main(String... strings){
        List<String> subset = new ArrayList<String>();
        String text = "ABC";
        String current_text = "";
        int index = 0;
        List<String> subsetlist = generateSubsets(text, current_text, index, subset);
        for(String text_subset:subsetlist){
            System.out.println(text_subset);
        }

    }
}

package HackerRank_Array.Medium;


//https://www.hackerrank.com/challenges/sparse-arrays/problem
public class SparseArrays {

    protected static int[] matchingStrings(String[] strings, String[] queries) {
        int[] result = new int[queries.length];

        for(int i = 0; i < queries.length; i++){
            int temp_result = 0;
            for (int j = 0; j < strings.length; j++) {
                if(queries[i].equals(strings[j])){
                    temp_result++;
                }
            }
            result[i] = temp_result;
        }
        return result;
    }



    public static void main (String... string){
        //Test Case 1:
        //String[] input = {"def","de", "fgh"};
        //String[] queries = {"de", "lmn", "fgh"};

        //Test Case 1:
        String[] input = {"aba","baba", "aba", "xzxb"};
        String[] queries = {"aba", "xzxb", "ab"};

        int[] result = matchingStrings(input, queries);
        for(int temp_value : result){
            System.out.println(temp_value);
        }
    }
}

package HackerRank_Array.Hard;

import java.util.Arrays;

public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        int[] result_array = new int[n];
        int noOfRows = queries[0].length;
        int start_index = 0;
        for(int i = 0; i <noOfRows; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            for(int j = a-1; j < b && b < n; j++){
                result_array[j] = result_array[j] + k;
            }
            System.out.println(Arrays.toString(result_array));
        }

        long max_value = result_array[0];
        for(int x = 1; x < result_array.length; x++){
            if(max_value < result_array[x]){
                max_value = result_array[x];
            }
        }
        return max_value;
    }



    public static void main (String... string){

        int n = 10;
        //int[][] queries = {{1,5,3}, {4,8,7}, {6,9,1}};
        int[][] queries = {{1,2,100}, {2,5,100}, {3,4,100}};

        System.out.println(arrayManipulation(n, queries));

    }
}

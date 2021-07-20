package Basic_Questions;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Count More than n/k Occurences
public class CountMoreThanOccurance {

    public void countOccurence(int[] arr, int n, int k)
    {
        // your code here,return the answer
        int requiredCount = (n/k);
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Set<Integer> result = new HashSet<>();
        for(int i = 0; i < n; i++){
            int valueCount = 1;
            if(hashMap.containsKey(arr[i])){
                valueCount =  hashMap.get(arr[i]);
                hashMap.put(arr[i],valueCount+1);
            }
            else{
                hashMap.put(arr[i],valueCount);
            }

            if(hashMap.get(arr[i]) > requiredCount){
                result.add(arr[i]);
            }
        }
        System.out.println(result.size());
    }

    public static void main(String... strings){
        CountMoreThanOccurance countMoreThanOccurance = new CountMoreThanOccurance();
        int[] arr = {3,1,2,2,1,2,3,3};
        countMoreThanOccurance.countOccurence(arr, arr.length,4);
    }
}

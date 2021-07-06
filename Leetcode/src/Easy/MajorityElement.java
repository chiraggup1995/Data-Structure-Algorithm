package Easy;

//Leetcode : 169
public class MajorityElement {

    //Method 1: Brute Force Approach
    //Two loop is used to keep track of maximum count for different element
    public static int majorityElement_BF(int[] array){
        for(int i =0; i < array.length; i++){
            int element = array[i];
            int count = 0;
            for(int j = 0; j < array.length; j++){
                if(array[j] == element){
                    count++;
                }
            }
            if(count > array.length/2){
                return element;
            }
        }
        return -1;
    }
    public static void main(String... s){
        int[] array = {3,3,4,2,4,4,2,4,4,4};
        System.out.println(majorityElement_BF(array));
    }
}

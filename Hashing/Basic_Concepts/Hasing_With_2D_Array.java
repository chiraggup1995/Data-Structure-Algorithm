package Basic_Concepts;



//If there is an array with Negative & Non-Negative Number. We can Implement hashing
//using 2D-Array
public class Hasing_With_2D_Array {

    final static int MAX = 1000;
    static int[][] hash = new int[MAX+1][2];//Row Number : 1001 & Column Number :2

    protected static void insertElements(int[] array){
        if(array.length == 0){
            return;
        }
        for(int i =0; i < array.length; i++){
            //Non-Negative Elements will be present in Column 1
            if(array[i] >= 0){
                hash[array[i]][0] = 1;
            }
            //Negative Elements will be present in Column 2
            else{
                hash[ Math.abs(array[i])][1] = 1;
            }
        }
    }

    protected static boolean searchElements(int element){
        if(element >= 0){
            if(hash[element][0] == 1){
                return true;
            }
            else{
                return false;
            }
        }
        if(hash[Math.abs(element)][1] == 1){
            return true;
        }
        else{
            return false;
        }
    }






    public static void main(String... strings){
        int[] array = {2,3,4,-1,2,-4,-4,-9,-2};
        //Insert Array Elements in 2D Array for implementing Hashing
        insertElements(array);
        //Search Non -Negative Element 9 is present or not
        System.out.println(searchElements(9));

        //Search Negative Element -9 is present or not
        System.out.println(searchElements(-9));
    }
}

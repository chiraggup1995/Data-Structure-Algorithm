package Basic_Concepts;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Chain_Hashing_Linked_List {

    protected static int hashFunction (int number){
        return number % 7;
    }


    //ArrayList Containing LinkedList<Integer> as a element
    protected static ArrayList<LinkedList<Integer>> createHashTable (int[] array){
        ArrayList<LinkedList<Integer>> hash_table = new ArrayList<LinkedList<Integer>>(array.length);
        System.out.println("Hash table: "+hash_table);
        for(int i =0; i < array.length; i++){
            hash_table.add(new LinkedList<Integer>());
        }

        for(int i = 0; i < array.length; i++){
            int hash_index = hashFunction(array[i]);
            insertKey(hash_index, array[i], hash_table);
        }
        printHashTable(hash_table);
        return hash_table;
    }

    protected static void insertKey(int hash_index,int element,
                                      ArrayList<LinkedList<Integer>> hash_table){
      hash_table.get(hash_index).add(element);
    }

    protected static void searchKey(int key, ArrayList<LinkedList<Integer>> hash_table){
        int key_index = hashFunction(key);
        boolean key_present = hash_table.get(key_index).contains(key);
       if(key_present == true){
           System.out.println("Key is present");
       }
       else{
           System.out.println("Key is not present");
       }

    }

    protected static void deleteKey(int key, ArrayList<LinkedList<Integer>> hash_table){

        int key_index = hashFunction(key);
        System.out.println(key_index);
        hash_table.get(key_index).remove(Integer.valueOf(key));
    }


    protected static void printHashTable(ArrayList<LinkedList<Integer>> hash_table){
        if(hash_table.isEmpty())
        {
        System.out.println("Hash table is Empty");
        }
        else{
            for(LinkedList<Integer> temp_list: hash_table){

                System.out.println( Arrays.toString( temp_list.toArray() ) );
            }
        }

    }


    public static void main(String... string){
        int[] array = {10,14,21,40,26,94, 78, 97,19,6};
        ArrayList<LinkedList<Integer>> chained_hash_table = createHashTable(array);
        //Search Key 10
        searchKey(10,chained_hash_table);
        //Search Key 5
        searchKey(5,chained_hash_table);
        //Search Key 19
        searchKey(19,chained_hash_table);
        //Delete Key 19
        deleteKey(19, chained_hash_table);
        //Print Hash Table
        printHashTable(chained_hash_table);

    }
}

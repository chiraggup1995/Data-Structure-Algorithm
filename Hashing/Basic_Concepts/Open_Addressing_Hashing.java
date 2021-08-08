package Basic_Concepts;

public class Open_Addressing_Hashing {

    int hash_table[];
    int capacity;
    int size;

    public Open_Addressing_Hashing(int capacity){
        hash_table = new int[capacity];
        for(int i = 0; i < capacity; i++){
            hash_table[i] = -1;
        }
    }

    protected static int hashFunction1(int key){
        return (key % 7);
    }

    protected static int hashFunction2(int key) {

        return (6 - (key % 6));
    }

    protected static int doubleHashing(int hash_index, int i,int offset){

        return (hash_index + (i * offset)) % 7;
    }


    //Insert the key in the empty slot using Double Hashing Algorithm of Open Address
    protected int[] insert(int key){
        int collision_index;
        int i = 1;
        int hash_index = hashFunction1(key);
        int offset;
        //Check whether Hash Index value is -1 (which means slot is empty)
        if(hash_table[hash_index] == -1){
            hash_table[hash_index] = key;
            //System.out.println("Key: " +key+ " Inserted at index " +hash_index);
        }
        //If Slot is not empty, call for Hash Function 2 which is offset (will find index for collision)
        else{
           // System.out.println("Collision Occur");
            while(true){
                offset = hashFunction2(key);
                collision_index = doubleHashing(hash_index, i, offset);
                //Check if collision index is free
                if(hash_table[collision_index] == -1){
                    hash_table[collision_index] = key;
                    break;
                }
                //If collision index slot is full, increment the value of i by 1
                else{
                    i++;
                }
            }
        }
        return hash_table;
    }


    //Search for the key in Hash Table
    protected int search(int key){
        int search_index = hashFunction1(key);
        int collision_search_index = -1;
        int i =1;
        int offset;
        if(hash_table[search_index] == key){
            System.out.println("Key is Present");
            return search_index;
        }
        offset = hashFunction2(key);
        collision_search_index = doubleHashing(search_index, i, offset);
        int first_collision_index = collision_search_index;
        while(hash_table[collision_search_index] != -1 || hash_table[collision_search_index] != -2){
            if(hash_table[collision_search_index] == key){
                System.out.println("Key is Present");
                return collision_search_index;
            }
            i++;
            offset = hashFunction2(key);
            collision_search_index = doubleHashing(search_index, i, offset);
            //System.out.println("Collision " +collision_search_index);
            if(collision_search_index == first_collision_index){
                System.out.println("Key is not present");
                return -1;
            }
        }
        System.out.println("Key is not present");
        return -1;
    }

    protected void deleteKey(int key){
        int key_index = search(key);

        if(key_index == -1){
            System.out.println("Key is not present for Delete");
        }
        else{
            hash_table[key_index] = -2;
        }
    }



    protected void printHashTable(){
        for(int i = 0; i < hash_table.length; i++){
            System.out.print(hash_table[i] +" ");
        }
    }

    public static void main(String... strings){

        Open_Addressing_Hashing open_addressing_hashing = new Open_Addressing_Hashing(7);
        //Insert Key 49;
        open_addressing_hashing.insert(49);
        //Insert Key 63;
        open_addressing_hashing.insert(63);
        //Insert Key 56;
        open_addressing_hashing.insert(56);
        //Insert Key 52;
        open_addressing_hashing.insert(52);
        //Insert Key 54;
        open_addressing_hashing.insert(54);
        //Insert Key 48;
        open_addressing_hashing.insert(48);
        //Insert Key 10;
        open_addressing_hashing.insert(10);
        //Print the Hash table
        open_addressing_hashing.printHashTable();
        System.out.println("");
        //Search for 10
        int search = open_addressing_hashing.search(10);
        //Search for 5
        search = open_addressing_hashing.search(5);
        //Delete for 10
        open_addressing_hashing.deleteKey(10);

        //Print the Hash table
        open_addressing_hashing.printHashTable();
        System.out.println("");

        //Search for 56
        search = open_addressing_hashing.search(56);
        //Search for 10
        open_addressing_hashing.search(10);

        //Print the Hash table
        //open_addressing_hashing.printHashTable();


    }
}

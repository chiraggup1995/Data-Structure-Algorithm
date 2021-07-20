package Basic_Questions;

public class Count1s {

    public static int count1(int[] array){
        int left_index = 0;
        int right_index = array.length-1;
        while((left_index <= right_index)){
            int mid_index = (left_index + right_index) / 2;
            System.out.println("Mid Index "+mid_index);
            if(array[mid_index] == 0){
                right_index = mid_index -1;
            }
            else if(array[mid_index] == 1){
                left_index = mid_index + 1;
            }
            System.out.println("Left Index: "+left_index );
            System.out.println("Right Index: "+right_index);
        }
        if(left_index > right_index){
            return left_index;
        }
        else{
            return right_index;
        }

    }

    public static void main(String... strings)
    {
        //int[] array = {1,1,1,1,1,0,0,0,0};
        //int[] array = {1,1,1,1,1,0,0,0,0};
        //int[] array = {1,1,1,1,1,0,0,0,0};
        int[] array = {1,1,1,0,0,0,0};
        //int[] array = {1,0,0,0,0};
        //int[] array = {1,1,1,1,1,0,0,0,0,0,0,0,0};
        //int[] array = {0,0,0,0};
       // int[] array = {1,1,1,1,1,1,1,1,1,1,1,0,0,0};
        int last_index_1 = count1(array);
        System.out.println("Number of 1: "+last_index_1);
    }
}

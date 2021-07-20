package Medium_Questions;

public class RepeatingElements {

    public void findRepeatedElements (int[] arr){

        //First find the max Element in the array
        //Also find sum of the array
        int maxElement = Integer.MIN_VALUE;
        int arraySum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxElement){
                maxElement = arr[i];
            }
            arraySum += arr[i];
        }

        int maxElementSum = 0;
        for(int j = maxElement; j > 0; j--){
            maxElementSum += j;
        }
        System.out.println(arraySum);
        System.out.println(maxElementSum);
        //Repeating element will be Total Array Sum - Max Element Sum divided by occurance of repeated element
        int result = (arraySum - maxElementSum)/ (arr.length - (maxElement+1));
        System.out.println(result);
    }
    public static void main(String... strings){
        RepeatingElements repeatingElements = new RepeatingElements();
        int[] array = {0,0};
        repeatingElements.findRepeatedElements(array);
        int[] array1 = {0,2,1,3,2,2};
        repeatingElements.findRepeatedElements(array1);
        int[] array2 = {1,2,3,0,3,4,5};
        repeatingElements.findRepeatedElements(array2);
        int[] array3 = {1,3,2,0,4,3,3};
        repeatingElements.findRepeatedElements(array3);

    }
}

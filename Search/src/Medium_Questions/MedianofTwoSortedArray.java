package Medium_Questions;

public class MedianofTwoSortedArray {

    public void findMedian(int[] array1, int[] array2){
        int length = array1.length + array2.length;
        int firstPointer = 0;
        int secondPointer = 0;
        int elementCount = 1;
        int temp_element = Integer.MIN_VALUE;
        int median_element = Integer.MIN_VALUE;
        while(firstPointer < array1.length || secondPointer < array2.length){
            if (array1[firstPointer] > array2[secondPointer]) {
                    secondPointer++;
                    elementCount++;
                } else {
                    firstPointer++;
                    elementCount++;
                }

                if(length % 2 == 0) {
                    if(elementCount == (length/2)){
                        median_element = Math.min(array1[firstPointer], array2[secondPointer]);
                    }
                    if (elementCount == (length / 2) + 1) {
                        temp_element = Math.min(array1[firstPointer], array2[secondPointer]);
                        float result = (median_element + temp_element) / 2;
                        System.out.println(result);
                        return;
                    }
                }else{
                    if (elementCount == (length / 2) + 1) {
                        median_element = Math.min(array1[firstPointer], array2[secondPointer]);
                        System.out.println(median_element);
                        return;
                    }

            }

        }

    }

    public static void main(String... strings){
        MedianofTwoSortedArray medianofTwoSortedArray = new MedianofTwoSortedArray();
        int[] array1 = {10,20,30,40,50};
        int[] array2 = {5,15,25,35,45,55,65,75,85};
        medianofTwoSortedArray.findMedian(array1, array2);
    }
}

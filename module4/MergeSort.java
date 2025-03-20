package module4;

import java.util.Arrays;

public class MergeSort {

    /*main frame of thinking with Merge Sort is that it divides your lists in half
until you have units of one.
You'll then, recursively, combine the lists back in a sorted order until all the
lists are sorted back into one list
*/
    /*
* Merge is what is called a helper function to help complete your merge sort
functionality.
* Helper functions are an integral part of programming, as you only want a
function to be doing one thing, just as you only want a class to be doing one
thing.
*
* The merge function requires to lists that are already both individually
sorted (this is critical, it will not work if they're not sorted already) and
combines them into a single sorted list
*
* */

    public static void main(String[] args) {
        int[] myArray = {4,2,6,5,1,3};

        System.out.println(Arrays.toString(myArray));
        System.out.println("Sorted:");
        System.out.println(Arrays.toString(mergeSort(myArray)));
    }


    public static int[] mergeSort(int[] array){
        if(array.length == 1) return array; //to avoid infinite loop

        int midIndex = array.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex)); // (which to copy, first, last)
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length)); // ending not included

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right){
        int [] combined = new int[left.length + right.length];

        int index = 0;
        int i = 0;
        int j = 0;

        while(i < left.length && j < right.length){

            if(left[i] < right[j]) {
                combined[index] = left[i];

                index++;
                i++;
            } else {
                combined[index] = right[j];
                index++;
                j++;
            }
        }
        while(i < left.length){
            combined[index] = left[i];
            index++;
            i++;
        }
        while(j < right.length){
            combined[index] = right[j];
            index++;
            j++;
        }
        return combined;
    }
}

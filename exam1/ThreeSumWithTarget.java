package exam1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import exam1.MergeSort;

public class ThreeSumWithTarget {

    public static List<List<Integer>> threeSumWithTarget(int[] list, int targetValue){
        List<List<Integer>> returnedList = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length ; j++) {
                for (int k = j + 1; k < list.length; k++) {
                    if((list[i] + list[j] + list[k]) == targetValue ){
                        List<Integer> comboList = new ArrayList<>();
                        comboList.add(list[i]); comboList.add(list[j]); comboList.add(list[k]);
                        returnedList.add(comboList);
                    }
                }
            }
        }
//        if(returnedList.isEmpty()) {
//            System.out.println("No valid combinations: ");
//        }
        return returnedList;
    }

    public static List<Integer> combineLists(List<List<Integer>> lists) {
        List<Integer> combinedList = new ArrayList<>();
        for (int i = 0; i < lists.size(); i++) {
            combinedList.addAll(lists.get(i));
        }
        return combinedList;
    }

    public static void main(String[] args) {
        int[] listOne = {9, -18, 0, 3, -9, -7, 5, -2};
        int[] listTwo = {5, -3, 15, -11, 29, -20, -5, 0};
        int[] listThree = {};

        System.out.println("The initial lists are: ");
        System.out.println(Arrays.toString(listOne));
        System.out.println(Arrays.toString(listTwo));
        System.out.println(Arrays.toString(listThree));

        System.out.println("\nThe lists contains the following combinations for target value: ");
        System.out.println("List One: " + threeSumWithTarget(listOne, 0));
        System.out.println("List Two: " + threeSumWithTarget(listTwo, 2));
        System.out.print("List Three : " + threeSumWithTarget(listThree, 0));


        System.out.println("\nThe combined, unsorted lists are: ");
        System.out.println("List One: " + combineLists(threeSumWithTarget(listOne, 0)));
        System.out.println("List Two: " + combineLists(threeSumWithTarget(listTwo, 2)));

        System.out.println("\nThe combined lists, sorted sorted are: ");
        System.out.println("List One: " + MergeSort.sortGivenArray(combineLists(threeSumWithTarget(listOne, 0))));
        System.out.println("List Two: " + MergeSort.sortGivenArray(combineLists(threeSumWithTarget(listTwo, 2))));
    }
}

// ANSWERS TO THEORY QUESTIONS

/*
Question 1:
"What is the best case Big O of this algorithm?" is not a relevant question, because even if the best case of an algorithm
is efficient, its average performance and, most importantly, its worst case scenario Big O might still be inefficient.

That's why we analyze algorithms worst case scenario instead. So a better question be: "What is the WORST case Big O of
this algorithm?"


Question 2:
We measure time complexity primarily through number of primitive operations that got executed relative to input size,
in the algorithm. This is because each primitive operation takes certain amount of time and they are the most basic process
we can measure that gets done in a program.
*/


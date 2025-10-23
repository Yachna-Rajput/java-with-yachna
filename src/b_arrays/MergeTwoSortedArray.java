package b_arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("Here we merge the two arrays");
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] mergedArr = merge(arr1, arr2);
        System.out.println("your merged array is");
        ArrayUtility.displayArray(mergedArr);

    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int newsize = arr1.length + arr2.length;
        int[] newArr = new int[newsize];

        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length) {
            if (j == arr2.length || i < arr1.length && arr1[i] < arr2[j]) {
                newArr[k] = arr1[i];
                i++;
                k++;
            } else {
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }
            return newArr;

        }
    }


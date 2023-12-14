public class Main {
    public static void main(String[] args) {
    }
    public int sumArray(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; ++i){
            sum += array[i];
        }
        return sum;
    }
    //time complexity is o(n) because it goes through every element of the array once
    public boolean findDuplicates(int[] array){
        HashSet<Integer> seen = new HashSet<Integer>();
        for(int i = 0; i < array.length; i++){
            if(seen.contains(i)){
                return true
            }
            seen.add(array[i]);
        }
        return false;
    }
    //time complexity is O(n) worst case
    //space complexity is S(n)

    public int[] mergeSortedArrays(int[] arr1, int[] arr2){
        int[] newArray = new int[arr1.length + arr2.length];
        int index = 0;
        int index1 = 0;
        int index2 = 0;
        while(index1 < arr1.length && index2 < arr2.length && index < newArray.length){
            if(arr1[index1] < arr2[index2]){
                newArray[index] = arr1[index1];
                index1++;
            }
            else{
                newArray[index] = arr2[index2];
                index2++;
            }
            index++;
        }
        for(int i = 0; i < Math.abs(arr1.length-arr2.length); i++){
            newArray[index] = arr1.length > arr2.length ? arr1[index1+i] : arr2[index2+i];
        }
        return newArray;
    }
    //time complexity of O(m+n) where m and n are lengths of the two arrays
    //space complexity of S(m+n)

    public int searchSortedMatrix(int[][] mat){

    }
}

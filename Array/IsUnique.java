package Array;

// IsUnique / Contains Duplicate - LeetCode 217
// Write a program to check if an array is unique or not.

// Example

// int[] intArray = {1,2,3,4,5,6};
// isUnique(intArray) // true


public class IsUnique {
    public static void main(String[] args) {
        IsUnique mn = new IsUnique();
        int[] intArray = {1,2,3,6,5,6};
        boolean result = mn.uniqueCheck(intArray);
        System.out.println(result);
      }
    



public boolean uniqueCheck(int[] intArray){
    for(int i = 0; i<intArray.length; i++){
        for(int j = i +1; j <intArray.length; j++){
            if(intArray[i] == intArray[j]){
                return false;
            }
        }
    }
    return true;
    
}
}
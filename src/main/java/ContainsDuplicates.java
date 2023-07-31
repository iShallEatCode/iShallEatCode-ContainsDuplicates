import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        // Create a Set to store unique values from the array
        Set<Integer> uniqueNums = new HashSet<>();

        // Iterate through the array
        for (int num : nums) {
            // If the Set already contains the current element, it is a duplicate
            if (uniqueNums.contains(num)) {
                return true;
            }
            //Otherwise add element to Set
            uniqueNums.add(num);
        }
        return false;
    }
}

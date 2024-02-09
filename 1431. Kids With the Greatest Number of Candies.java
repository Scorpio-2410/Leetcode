/*Required libraries for List & ArrayList, Leetcode already has these libraries*/
import java.util.List;
import java.util.ArrayList;

/*1431. Kids With the Greatest Number of Candies
Tags: Array

There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, 
and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, 
they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

 */

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        /*Set maxCandy to the first value of the candy array*/
        int maxCandy=candies[0];
        List<Boolean> result = new ArrayList<>();
        /*Initial loop is to determine the maximum amount of candy a child has in the array*/
        for(int i = 0; i < candies.length; i++){
            /*If the current candy is greater than the set value of maximum candy, then update maxCandy to the current value of the candy in the array*/
            if(candies[i]>maxCandy){
                maxCandy=candies[i];
            }
        }
        /*Loop through the array again, but this time add it to the boolean arraylist result, if current candy + extra candies are greater than or equal to maximum value of candy,
          add it to the arraylist, since its a boolean it will add true or false.
         */
        /*Note: we cannot have a if condition as the boolean array is already testing the condition if true or false, hence inserting true or false into the result array*/
        for(int j = 0; j<candies.length; j++){
            result.add(candies[j] + extraCandies >= maxCandy);
        }
        return result;
    }
}
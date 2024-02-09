/*605. Can Place Flowers
Tags: Array, Greedy

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, 
return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
 */


class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        /*Create a new boolean value to return*/
        boolean ans;
        /*Loop through the flowerbed array from start until you reach the end*/
        for(int i = 0; i < flowerbed.length; i++){
            /*If the current index is equal to 0 */
            if(flowerbed[i]==0){
                /*Create two boolean variables to check both the previous & next indexes to see if there are no adjacent flowers*/
                /*If the index itself is 0 then its the start of the array or the previous index value is 0 then true, else false*/
                boolean prevIndex = i == 0 || flowerbed[i - 1] == 0;
                /*If the index itself is equal to the end of the array or the next index value is 0 then true, else false*/
                boolean nextIndex = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
                /*If the current index is 0 & both previous and next are also 0, the number of flowers that need to be planted are decreased by one
                 & the index i increased so the code skips the next index and doesn't get confused with the no adjacent rule.*/
                if(flowerbed[i] == 0 && prevIndex && nextIndex){
                    n--;
                    i++;
                }
            }
        }
        /*If n less than or equal 0, then the required number of plants whilst following the no adjacent rule, else false it cant */
        if(n<=0){
            ans = true;
        } else{
            ans = false;
        }
        return ans;
    }
}
/*1071. Merge Common Disisor of Strings
Tags: Math, String

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
If a string is longer than the other, append the additional letters onto the end of the merged string.

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
*/

class Solution {
    /*Method gcd that is passed two integers x & y*/
    public int gcd(int x, int y){
        /*If y is 0, it means the lowest common divisor has been found so gcd value (x) is returned*/
        if(y==0){
            return x;
        } else{
            /*This method is recursing passing y as the x value & divisor of x & y as the y value*/
            return gcd(y,x%y);
        }
        
    }

    public String gcdOfStrings(String str1, String str2) {
        /*If the two strings are not the same when added then there is no common divisor, hence returning empty string*/
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        /*Variable gcdLength calls the gcd method and passes the lengths of str1 & str2 as the x & y values.*/
        int gcdLength = gcd(str1.length(), str2.length());
        /*Returns the substring from the start of str1 index 0 to the greatest common divisor*/
        return str1.substring(0,gcdLength);
    }
}

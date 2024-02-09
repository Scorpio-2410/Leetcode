/* 1768. Merge Strings Alternately
Tags: Two Pinters, String

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.
 
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
 */

 class Solution {
    public String mergeAlternately(String word1, String word2) { 
        /*new mergeString, StringBuilder dynamically allocates memory*/
        StringBuilder mergeArray = new StringBuilder();
        /*new integer to reference current index*/
        int i=0;
        /*loops until u reach end of both arrays*/
        while(i<word1.length() || i<word2.length()){
            /*append first array/remaining characters*/
            if(i<word1.length()){
                mergeArray.append(word1.charAt(i));
            }
            /*append second array/remaining characters*/
            if(i<word2.length()){
                mergeArray.append(word2.charAt(i));
            }
            /*increase i by 1*/
            i++;
        }
        return mergeArray.toString();
    }
}
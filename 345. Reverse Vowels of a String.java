/*345. Reverse Vowels of a String
Tags: Two Pointers, String

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:

Input: s = "hello"
Output: "holle"
 */

 class Solution {
    /*Boolean method for checking if the value is a vowel, if it is it will return true, else false*/
    public boolean isVowel(char c){
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }
    public String reverseVowels(String s) {
        /*Using StringBuilder as it dynamically allocates memory and intilising it with the existing string s, so existing values are copies to the new array ans*/
        StringBuilder ans = new StringBuilder(s);
        /*Create two points, one with value 0 for the start of the array and another for the end of the array*/
        int i = 0;
        int k = s.length()-1;
        /*Loop through the array until you reach the end*/
        while(i < k){
            /*If both indexes are vowels then swap them and increment i and decreament k both by 1*/
            if(isVowel(s.charAt(i)) && isVowel(s.charAt(k))){
                ans.setCharAt(i, s.charAt(k));
                ans.setCharAt(k, s.charAt(i));
                i++;
                k--;
            }
            /*If index i isn't a vowel then increase i by 1*/
            else if(!isVowel(s.charAt(i))){
                i++;
            }
            /*If index k isn't a vowel then decrease k by 1*/
            else if(!isVowel(s.charAt(k))){
                k--;
            }
        }
        return ans.toString();
    }
}
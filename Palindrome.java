import java.util.Scanner;

public class Palindrome {
    //Using loop
    public static boolean isPalindrome(String string)
    {
       int start =0;
       int end = string.length()-1;
       while(start <= end)
       {
           if(string.charAt(start)!=string.charAt(end))
           {
               return false;
           }
           start++;
           end--;
       }
       return true;
    }

    public static boolean isPalindromeRecursion(String string)
    {
        if(string.length() == 0 || string.length() == 1)
        return true;
        if(string.charAt(0) == string.charAt(string.length()-1))
        {
            return isPalindromeRecursion(string.substring(1, string.length()-1));
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String word = sc.nextLine();
       // System.out.println("Palindrome: "+isPalindrome(word));
        System.out.println("PalindromeRecursion: "+Palindrome.isPalindromeRecursion(word));
        //using SB
       /* if(word.equalsIgnoreCase(new StringBuffer(word).reverse().toString()))
            System.out.println("IS a Palindrome 1");
        else
        System.out.println("IS NOT a Palindrome1");
*/
    }
}
/*

Certainly! The method str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase() is a common way to clean up a string for case-insensitive palindrome checking or other similar purposes. Here's a detailed breakdown of how each part of this method works:

1. replaceAll("[^a-zA-Z0-9]", "")
replaceAll(): This is a method from the String class in Java that replaces each substring of the string that matches the given regular expression with the given replacement string.

"[a-zA-Z0-9]": This is a regular expression (regex) pattern.

a-z: Matches any lowercase letter from 'a' to 'z'.
A-Z: Matches any uppercase letter from 'A' to 'Z'.
0-9: Matches any digit from '0' to '9'.
[^...]: The ^ inside square brackets [^...] acts as a negation operator in regex, meaning "not" or "anything except". So, [^a-zA-Z0-9] matches any character that is not a letter (either uppercase or lowercase) or a digit.
"": This is the replacement string, which is empty in this case. It means that any character matching the pattern [^a-zA-Z0-9] will be replaced with nothing, effectively removing it from the string.

IntStream.range(0, str.length() / 2)
                        .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
 */
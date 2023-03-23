package String;

public class ReverseString {
	public static String reverseWord(String s) {
        // Reverse the string str
        // convert the string to a character array
        char[] charArray = s.toCharArray();
//        System.out.println(charArray);

        // initialize two pointers, one at the beginning and one at the end of the array
        int i = 0;
        int j = charArray.length - 1;

        // swap the characters at i and j until they meet in the middle
        while (i < j) {
//            System.out.println(charArray[i]);
//            System.out.println(charArray[j]);
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }

        // convert the character array back to a string and return it
        return new String(charArray);
    }
	
	public static void main(String[] args) {
        String inputString = "hello";
        String reversedString = reverseWord(inputString);
        System.out.println(reversedString);
    }
}

//The time complexity of this code is O(n), where n is the length of the input string. 
//This is because the while loop iterates through half of the characters in the string and swaps each pair, 
//resulting in a total of n/2 iterations. However, in big-O notation, constants are dropped, so the time complexity is simply O(n).

//The space complexity of this code is O(n), where n is the length of the input string. 
//This is because a character array is created to hold the characters of the input string, which takes up n units of space. 
//Additionally, a temporary variable "temp" is created to store the value of the character being swapped, 
//but since this variable is only used once at a time, it is not a significant factor in the overall space complexity.

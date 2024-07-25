public class ReverseWords {
    public static void main(String[] args) {
        String s = "i love programming";
        String reversedString = reverseWords(s);
        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + reversedString);
    }
    
    public static String reverseWords(String s) {
        // Split the string into words
        String[] words = s.split(" ");
        
        // Initialize a StringBuilder to store the reversed sentence
        StringBuilder reversed = new StringBuilder();
        
        // Iterate over the words in reverse order and append them to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add space between words
            }
        }
        
        return reversed.toString();
    }
}

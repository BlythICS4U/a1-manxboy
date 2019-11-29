package problem4;

import java.util.Scanner;

/**
 *
 * @author cgallinaro
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //prompt user
        System.out.print("Type a sentence: ");
        
        //get the scentance
        String original = scanner.nextLine();
        
        //remove punctuation
        original = original.replaceAll("([?!\"':;().,-])", "");
        
        //remove spaces
        original = original.replace(" ", "");
        
        //remove caps
        original = original.toLowerCase();
        
        //reverse
        String reversed = reverse(original);
        
        ///debug
        if (original.equals(reversed)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is NOT a palindrome");
        }
    }
    
    /**
     * Reverses a string by using a char sequence to conserve memory
     * @param input
     * @return 
     */
    public static String reverse(String input) {
        char[] output = new char[input.length()];
        
        //ittorate through the string backwards and the char[] forwards, setting the char[] at the index equal the the string at the index
        for (int CharPos=0, StringPos = input.length() - 1; StringPos >= 0; CharPos++, StringPos--) {
            output[CharPos] = input.charAt(StringPos);
        }
        
        return new String(output);
    }
    
}

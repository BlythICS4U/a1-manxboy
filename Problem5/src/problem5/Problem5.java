package problem5;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author cgallinaro
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //get input from user
        System.out.print("Type a line of text: ");
        String input = scanner.nextLine();
        String output = "";
        
        StringTokenizer tokenizer = new StringTokenizer(input);
        
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            
            //replace quotes
            token = token.replace("'", "\"");
            
            //replace all worlds ending with or with words ending in our
            // - (or) predicate matches any seqence of characters equaling 'or'
            // - (?=\W) predicate looks ahead to check wether the next symbols are part of a 'word' (matches any non alphabetic characters)
            token = token.replaceAll("(or)(?=\\W)", "our");
            
            //matches all worlds that start with capital letters
            // - \A 'anchors' the search to the begining of the string (only checks first character)
            // - [A-Z] matches all characters between capital A and capital Z
            // - [\s\S]* matches all following characters
            if (token.matches("\\A([A-Z][\\s\\S]*)")) {
                token = token.toUpperCase();
            }
            
            
            //adds a space to the begining of the token if the output string is empty (implying that the string is the first string to be added)
            if (output.length() > 0) {
                token = " " + token;
            }
                        
            //appends token to the output
            output += token;
        }
        
        
        //output
        System.out.println("Output line: " + output);
    }
    
}

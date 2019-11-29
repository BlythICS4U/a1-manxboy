package problem6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author cgallinaro
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        StringTokenizer tokenizer = new StringTokenizer(input);
        
        String finalOutput = "";
        String currentLine = "";
        
        while (tokenizer.hasMoreTokens()) {
            
            String token = tokenizer.nextToken();
            
            //validate input
            if (token.length() > 16) {
                System.out.println("The input includes " + token + ", which is longer than 16 characters.");
                return;
            }
            
            
            if ((currentLine + " " + token).length() > 16) {
                finalOutput += "\n" + currentLine;
                currentLine = token;
            } else {
                currentLine += " " + token;
            }
        }
        
        System.out.println(finalOutput);
    }
    
}

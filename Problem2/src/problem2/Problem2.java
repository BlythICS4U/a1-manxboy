package problem2;

import java.util.Scanner;

/**
 *
 * @author cgallinaro
 */
public class Problem2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            //prompt user
            System.out.print("\nEnter Grade: ");
            
            //input is assumed to be an integer in the range of [50, 99]
            int input = scanner.nextInt();
            
            //print out grade
            System.out.println("The grade is: " + getGrade(input));
        }
    }
    
    /**
     * Finds the grade based of the numeric value using if statements
     * @param value the numeric grade
     * @return the letter grade
     */
    public static String getGrade(int value) {
        if (value <= 53) return "D-";
        if (value <= 57) return "D" ;
        if (value <= 61) return "D+";
        if (value <= 65) return "C-";
        if (value <= 69) return "C" ;
        if (value <= 73) return "C+";
        if (value <= 77) return "B-";
        if (value <= 82) return "B" ;
        if (value <= 85) return "B+";
        if (value <= 89) return "A-";
        if (value <= 94) return "A" ;
        return "A+";
    }
    
}

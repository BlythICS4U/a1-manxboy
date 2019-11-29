package problem3;

import java.util.Scanner;

/**
 *
 * @author cgallinaro
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            
            System.out.print("Type the Kilometres: ");
            //get first number
            double km = scanner.nextDouble();
            //exit if the number is negative
            if (km < 0) break;
            
            System.out.print("Type the Litres: ");
            //get the second number
            double litres = scanner.nextDouble();
            //exit if the number is negative
            if (litres < 0) break;
            
            //print the result, with the number limited to two decimal places
            System.out.printf("Fuel Efficiency = %.2f\n\n", fuelEfficiency(km, litres));
            
        }
    }
    
    /**
     * Calculates the fuel Efficiency based on the litres of fuel used and kilometers driven.
     * @param litresUsed the fuel used
     * @param kmDriven the distance driven
     * @return the fuel efficiency
     */
    public static  double fuelEfficiency(double kmDriven , double litresUsed) {
        return (100 * litresUsed) / kmDriven;
    }
}

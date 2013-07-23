/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers.cubed;
import java.util.Scanner;
/**
 *
 * @author Burdens
 */
public class NumbersCubed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("what is your number");
    Scanner scanner = new Scanner(System.in);
    String number = scanner.nextLine();
    int num = Integer.parseInt(number);
    System.out.print(Math.pow(num, 3));
    }
}

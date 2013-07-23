/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers.squared;
import java.util.Scanner;
/**
 *
 * @author Burdens
 */
public class NumbersSquared {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("what is your number");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int num = Integer.parseInt(number);
        int square = num * num;
        System.out.println(square);
              
    }
}

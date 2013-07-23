/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.java;
import java.util.Scanner;
/**
 *
 * @author Burdens
 */
public class LearningJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        String source =  ab.nextLine();
        
        for (String part : source.split(" ")) {
            System.out.print(new StringBuffer (part).reverse().toString());
            System.out.print(" ");
        }
        // TODO code application logic here
    }
}

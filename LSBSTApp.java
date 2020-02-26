
/**
 * @author Tshilidzi
 * 26/02/2020
 * reads in data from the file and then creates a BST of the data
 */
import java.io.*;
import java.util.Scanner;

public class LSBSTApp extends BinaryTree {
    int i; // our counter for the comparisons
    private Scanner input;

    public LSBSTApp() {
        // acts as a constructor and it also reads in the data into the binary search
        // tree
        try {
            input = new Scanner(new FileInputStream("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File could not be opened");
            System.out.println(0);
        }
        while (input.hasNext()) {
            String line = input.nextLine();
            int space = line.indexOf(" ");
            String period = line.substring(0, space);
            String area = line.substring(space, line.length());
            this.insert(new LoadShedding(period, area));
            // System.out.println("out");
        }
    }

    /**
     * returns this current binary search tree
     * 
     * @return this binary search tree
     */
    public LSBSTApp getBST() {

        return this;
    }
}

package Sets;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner { 
    public static void main(String args[]){
        // Sample data
        String[] data = {
            "1 2 3 4 5",
            "4 5 6 7 8",
            "10 11 12 13 14 15 16 17",
            "11 13 15 17 19 21 23",
            "4 5 5 6 76 7 7 8 8 8 8 8",
            "23 3 4 3 5 3 53 5 46 46 4 6 5 3 4"
        };

        // Process each pair of lines as sets
        for (int i = 0; i < data.length; i += 2) {
            MathSet ms = new MathSet(data[i], data[i + 1]);
            System.out.println(ms);
            System.out.println("union - " + ms.union());
            System.out.println("intersection - " + ms.intersection());
            System.out.println("difference A-B - " + ms.differenceAMinusB());
            System.out.println("difference B-A - " + ms.differenceBMinusA());
            System.out.println("symmetric difference - " + ms.symmetricDifference());
            System.out.println();
        }
    }
}
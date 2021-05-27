package comBridge;

import java.util.Random;
import java.util.Scanner;

public class LineComparison {
    public int x1, x2, y1, y2;



}

public class LineComparision {


    public static void diffOfLine(double length1,double length2) {
        if (length1<length2) {
            System.out.println("line-1 is less than line-2.");
        } else if (length2<length1) {
            System.out.println("line-2 is less than line-1.");
        } else {
            System.out.println("Both line has equal lenth.");
        }

    }

    public static void main(String[] args) {
        System.out.println("Wellcome to the Line comparision Computatation problem");

        DistanceOfLine line1 = new DistanceOfLine(5, 8, 6, 9);

        double length1 = line1.calculateDistanceOfLine();
        System.out.println("Length of line-1 = "+length1);


        DistanceOfLine line2 = new DistanceOfLine(11, 9, 8, 9);

        double length2 = line2.calculateDistanceOfLine();
        System.out.println("Length of line-2 = "+length2);

        diffOfLine(length1, length2);
    }
}


    


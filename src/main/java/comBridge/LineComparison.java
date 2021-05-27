package comBridge;

import java.util.Random;
import java.util.Scanner;

public class LineComparison {

    private static double distanceLine1;

    public static void main(String[] args) {
        System.out.println("Welcome to line comparison computation");

        int x1,x2,y1,y2;
        double dis;
        x1=1;y1=1;x2=4;y2=4;
        dis=Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("Enter the values next co-ordinates ");
        System.out.println("x3= ");
        Scanner sc = null;
        int x3 = sc.nextInt();
        System.out.println("y3");
        int y3 = sc.nextInt();
        System.out.println("x4= ");
        int x4 = sc.nextInt();
        System.out.println("y4= ");
        int y4 = sc.nextInt();

        double distanceLine2=Math.sqrt(Math.pow(x4-x3,2) + Math.pow(y4-y3,2));
        System.out.println("distinctive"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);

        System.out.println("Length of line 2 = "+ distanceLine2);

        if (distanceLine1<distanceLine2) {
            System.out.println("Line1 is less than Line2");
        }
        else if (distanceLine1>distanceLine2) {
            System.out.println("Line1 is greater than line2");
        }
        else {
            System.out.println("Two lines are Equal");
        }
    }
    }
    


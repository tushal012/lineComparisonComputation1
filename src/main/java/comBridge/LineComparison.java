package comBridge;

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to line comparison computation");

        int x1,x2,y1,y2;
        double dis;
        x1=1;y1=1;x2=4;y2=4;
        dis=Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("distinctive"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
    }
    }
}

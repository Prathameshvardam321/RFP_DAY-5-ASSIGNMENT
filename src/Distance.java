import java.util.Scanner;

public class Distance {
    static void calcDistance(int x,int y){
        double distance;
        double z =x*x+y*y;
        distance=Math.pow(z,0.5);
        System.out.println("Distance of x :"+ x +" and y: " + y + " = "+distance);


    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of x: ");
       int x = s.nextInt();
        System.out.println("Enter value of y: ");
       int y = s.nextInt();
        calcDistance(x,y);
    }
}

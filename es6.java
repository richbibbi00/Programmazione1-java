import java.util.Scanner;
public class es6{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x,y,h;
    System.out.println("Ins valore base1");
    x=in.nextInt();
    System.out.println("Ins valore base2");
    y=in.nextInt();
    System.out.println("Ins valore altezza");
    h=in.nextInt();
    System.out.println("base1= "+x);
    System.out.println("base2= "+y);
    System.out.println("l'area equivale del trapezio e'  "+(x+y)*h/2);
  }
}

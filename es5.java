import java.util.Scanner;
public class es5{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x,y;
    System.out.println("Ins valore base");
    x=in.nextInt();
    System.out.println("Ins valore altezza");
    y=in.nextInt();
    System.out.println("il lato1 e' "+x);
    System.out.println("il lato2 e' "+y);
    System.out.println("l'area equivale ad "+x*y);
  }
}

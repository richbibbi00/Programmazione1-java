import java.util.*;
public class es7{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x,y;
    double a,b,c,d,e,f;
    System.out.println("Ins valore x");
    x=in.nextInt();
    System.out.println("Ins valore y");
    y=in.nextInt();
    a=(13+9+6-7)*2;
    b=((2+3)*5)+((2/3+5)*4)+(3*(7+5-13));
    c=((3.4+5-6.3)*4.3+(3.5*(-4)))*+6;
    d=(x+y)*(x-y);
    e=Math.pow(x,2)+ Math.pow(y,2);
    f=((x+y)*(x-y))/Math.pow((2*x+y),2);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);

  }
}

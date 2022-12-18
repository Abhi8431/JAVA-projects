import java.util.*;
class DisplayOverloading
{
  int add(int a, int b)
  {
    int sum = a+b;
    return sum;
  }
  int add(int a, int b, int c)
  {
    int sum = a+b+c;
    return sum;
  }
  public float add(float a, float b)
  {
    float sum = a+b;
    return sum;
  }
  public double add(double  a, double  b)
  {
    double sum = a+b;
    return sum;
  }
}

public class METHOD_OVERLODING
{
	public static void main(String args[])
	{
		 DisplayOverloading obj = new DisplayOverloading();
		 System.out.println("taking diffrent no parametrs");
		    System.out.println(obj.add(10, 20));
		    System.out.println(obj.add(10, 20, 30));
		    System.out.println("taking diffrent no of datatypes");
		    System.out.println(obj.add(5, 15));
		    System.out.println(obj.add(5.5f, 2.5f));
		    System.out.println(obj.add(7.995d, 2.5567d));
	}
}

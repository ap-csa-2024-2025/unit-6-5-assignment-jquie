import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int size;
    String[] words;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length");
    size = sc.nextInt();
    words = new String[size];

    sc.nextLine();
    System.out.println("Enter" + size + "words");
    for (int i = 0; i < size; i++)
    {
      words[i] = sc.nextLine();
    }
    reverse(words);
  }

  public static void reverse(String[] arr)
  {
    for (int n: arr)
    {
      String rev = "";
      for (int i = n.length()-1; i >= 0; i--)
      {
        rev += n.substring(i, i+1);
      }
      System.out.println(rev);
    }


  public int product(int[] arr)
  {
    return 0;
  }

  public double average(double[] arr)
  {
    return 0.0;
  }
}

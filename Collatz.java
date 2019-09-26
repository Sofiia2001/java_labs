import java.util.Scanner;

class Collatz {
  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    // int next = 0;
    System.out.println(n);
    while (n != 1){
      if (n % 2 == 0){
        n = n / 2;
      }
      else {
        n = n * 3 + 1;
      }
      System.out.println(n);
    }
  }
}

import java.util.Scanner;

class metertofeet {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter number in meter : ");
    double meter = input.nextDouble();

    double feet = meter * 3.28;
    System.out.println("Number in feet " + feet);

    input.close();
  }
}

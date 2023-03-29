import java.util.Scanner;

public class BodyMassIndex {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Body Weight in pound : ");
    float weight = input.nextFloat();

    System.out.println("Enter body Height in inches : ");
    float Height = input.nextFloat();

    double a = weight * 0.45359237;
    double b = Height * 0.0254;

    System.out.println("Weight in Kilogram(KG) : " + a);
    System.out.println("height meters : " + b);

    double sum = a / (b * b);
    System.out.println("BMI is : " + sum);

    input.close();
  }
}

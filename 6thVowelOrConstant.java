import java.util.Scanner;

public class VowelOrConstant {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter letter : ");
    String letter = input.next();

    switch (letter) {
      case "a":
        System.out.println(letter + " is vowel");
        break;
      case "e":
        System.out.println(letter + " is vowel");
        break;
      case "i":
        System.out.println(letter + " is vowel");
        break;
      case "o":
        System.out.println(letter + " is vowel");
        break;
      case "u":
        System.out.println(letter + " is vowel");
        break;
      default:
        System.out.println(letter + " is consonant");
    }
    input.close();
  }
  
}

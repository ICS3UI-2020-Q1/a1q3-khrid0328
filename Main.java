import java.util.Scanner;

/**
 * This program calculates the subtotal, the amount to taxes (13%) and the total.
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user how many chromebook chargers
    System.out.println("How many chromebook chargers?");

    // declare and initialize a variable for computerchargers
    int computerchargers = input.nextInt();

    // ask the user how many motherboards
    System.out.println("How many motherboards?");

    // declare and initialize a variable for motherboards
    int motherboards = input.nextInt();

    // ask the user how many mice
    System.out.println("How many mice?");

    // declare and initialize a variable more mice
    int mice = input.nextInt();

    // declare amd calculate the chromebooks price
    double chromebookprice = computerchargers * 34.99;

    // declare amd calculate the motherboards price
    double motherboardsprice = motherboards * 127.50;

    // declare amd calculate the mice price
    double miceprice = mice * 18.00;

    // declare and calculate subtotal
    double subtotal = chromebookprice + motherboardsprice + miceprice;
    System.out.println("Subtotal= $" + subtotal);

    // declare and calculate taxes %13
    double taxes = (13 * subtotal) / 100;
    System.out.println("Taxes = $" + taxes);

    // declare and calculate total payment
    double total = subtotal + taxes;
    System.out.println("Total = $" + total);
  }
}

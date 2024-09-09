import java.util.ArrayList;
import java.util.Scanner;

public class Store
{

    private static ArrayList<Product> products = new ArrayList<Product>();
    private static ArrayList<Product> shoppingCart = new ArrayList<Product>();

    public static void main(String[] args)
    {

        final double stateTax = 0.0825;
        int index = 1;
        int number = 0;
        String selection = "0";
        Scanner in = new Scanner(System.in);

        Taxed.setTaxRate(stateTax);

        products.add(new Taxed("Bread", 2.86));
        products.add(new Taxed("Lunch Meat (9oz)", 4.50));
        products.add(new Taxed("Milk", 3.48));
        products.add(new Taxfree("Soda (12 pk)", 4.23));
        products.add(new Taxfree("Paper Plates (204 count)", 6.99));
        products.add(new Taxfree("Mayonnaise (11.2 fl oz)", 3.49));

        while (!selection.equalsIgnoreCase("q"))
        { 
            // loop until user enters q or Q
            index = 1;
            System.out.println("=======================\nWelcome to the Store!\n=======================\n");

            for (Product product : products)
            { 
                // iterate through list of Products showing user's their options
                System.out.println(index + ") " + product);
                index++;
            }

            System.out.println("Please make a selection from the menu (Enter 'q' or 'Q' to checkout): ");
            selection = in.nextLine();
		 
            if (!selection.equalsIgnoreCase("q"))
            {
                try 
                {
                    number = Integer.parseInt(selection); // changes user's option to an integer type and stores it
                    if (number < 0) 
                    {
                        break;
                    }
                } 
                catch (NumberFormatException e) 
                {
                    System.out.println("Invalid input. Please enter a valid integer or 'q' to quit.");
                }
            }
            else
            {
                break;
            }

            try
            {

                Product product = products.get(number - 1); // gets the product user selected
                shoppingCart.add(product);	// adds user's product to shopping cart

                System.out.println("\n\n\nYour shopping cart\n-----------------------------");

                for (Product inCart : shoppingCart)
                { 
                    // iterates and prints items in user's current shopping cart
                    System.out.println(inCart);
                }

                System.out.println("\n\n\n");

            } 
            catch (NumberFormatException e)
            {
                System.out.println("\nInvalid input. Please enter a valid integer or 'q' to quit.\n");
            } 
            catch (IndexOutOfBoundsException e)
            {
                System.out.println("\nInvalid input. Please enter a valid integer or 'q' to quit.\n");
            }
        
        }

        Receipt receipt = new Receipt(shoppingCart); // sends user's shopping cart to receipt class 
        System.out.println("Here's your receipt. \n" + receipt.printReceipt()); 
        System.out.println("\n\nThank you for shopping with us! Have a nice day!");

    }

}

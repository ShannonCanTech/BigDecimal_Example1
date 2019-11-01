package shannonfoster.dev;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
        Object item1 = "pencils";
        Object item2 = "paper towels";
        Object item3 = "bread";
        BigDecimal priceOfItem1;
        BigDecimal priceOfItem2;
        BigDecimal priceOfItem3;

        System.out.printf("**************\nItems\n**************\n1. %s\n2. %s\n3. %s\n**************\n", item1, item2, item3);

        System.out.println("Enter the items you'd like to add to your shopping cart: ");
        Object answer = scan.nextLine();

        //BigDecimalObject.doubleValue() converts the BigDecimal object to a double
        // casting a BigDecimal to a double (double)bogDecimalObj doesn't work
        if (answer.toString().toLowerCase().contains(item1.toString().toLowerCase())){
            priceOfItem1 = new BigDecimal(2.30);
            System.out.printf("\n%s added to list - %.2f", item1, priceOfItem1.doubleValue());
        }

        if (answer.toString().toLowerCase().contains(item2.toString().toLowerCase())){
            priceOfItem2 = new BigDecimal(4.50);
            System.out.printf("\n%s added to list - %.2f", item2, priceOfItem2.doubleValue());
        }

        if (answer.toString().toLowerCase().contains(item3.toString().toLowerCase())){
            priceOfItem3 = new BigDecimal(3.80);
            System.out.printf("\n%s added to list - %.2f", item3, priceOfItem3.doubleValue());
        }

    }
}

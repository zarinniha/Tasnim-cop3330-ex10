import java.util.Scanner;

class selfCheckout{

    public static void main(String args[])
    {
        //collect the inputs
        System.out.print("Enter the price of item 1: ");
        Scanner obj1 = new Scanner(System.in);
        double price1 = obj1.nextDouble();

        System.out.print("Enter the quantity of item 1: ");
        Scanner obj2 = new Scanner(System.in);
        int quantity1 = obj2.nextInt();

        System.out.print("Enter the price of item 2: ");
        Scanner obj3 = new Scanner(System.in);
        double price2 = obj3.nextDouble();

        System.out.print("Enter the quantity of item 2: ");
        Scanner obj4 = new Scanner(System.in);
        int quantity2 = obj4.nextInt();

        System.out.print("Enter the price of item 3: ");
        Scanner obj5 = new Scanner(System.in);
        double price3 = obj5.nextDouble();

        System.out.print("Enter the quantity of item 3: ");
        Scanner obj6 = new Scanner(System.in);
        int quantity3 = obj6.nextInt();

        //performing math
        double subtotal = (price1*quantity1)+(price2*quantity2)+(price3*quantity3);
        double tax = (subtotal * 5.5)/100;
        double total = subtotal+tax;

        //printing the output
        System.out.printf("Subtotal: %.2f\nTax: %.2f\nTotal: %.2f",subtotal,tax,total);




    }
}
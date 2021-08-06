package Currency;

import java.util.Scanner;

public class currencyConverter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("1) Lira to Euro");
        System.out.println("2) Lira to Dollar");
        System.out.println("2) Lira to Pound");
        System.out.println("Choose one from the options");

        int exchange = sc.nextInt();
     
        switch (exchange){
            case 1: {
                System.out.println("Enter the number of Euro");
                double NofEuro= sc.nextDouble();
                if (NofEuro>=0){
                    System.out.println( NofEuro + " Euro is " + NofEuro*10+"Lira");
                }
                else
                {
                    System.out.println("Please put in positive number");
                }
                break;
            }


            case 2: {
                System.out.println("Enter the number of Dollar");
                double NofDollar= sc.nextDouble();
                if (NofDollar>=0){
                    System.out.println( NofDollar + " Dolar is " + NofDollar*8.5+"Lira");
                }
                else
                {
                    System.out.println("Please put in positive number");
                }
                break;
            }
            case 3: {
                System.out.println("Enter the number of Pound");
                double NofPound= sc.nextDouble();
                if (NofPound>=0){
                    System.out.println( NofPound + " Pound is " + NofPound*12+"Lira");
                }
                else
                {
                    System.out.println("Please put in positive number");
                }
                break;
            }

        }
        sc.close();
}
    }




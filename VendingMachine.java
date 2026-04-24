/******************************************************************************

 ******************************************************************************/
import java.util.Scanner;
public class VendingMachine {


    public static void main(String[] args) {
    String vendingMachine [][] = {{"Hershey Bar" ,"Kit Kat" , "Crunch", "Reese's"},
                                 {"Strawberry GummyBear" , "Blueberry GummyBear" , "Lime GummyBear" , "Cherry Gummybear"},   
                                 {"White Chocolate" , "Dark Chocolate" , "Milk Chocolate" , "Bittersweet Choclate"},
                                 {"Ferrero Rocher" , "Ghiradelli" , "Nestle" , "Godiva" }};
    
    double cost [][] = {{ .5 , .5 , .5 , .5  },
                    { .10 , .10 , .10 , .10  },
                    { 1 , 1 , .9 , 1 },
                    { 1.5, 1.5, 1, 1.5  }};
                    
    String iD [][] = {{"A1" , "B1" , "C1" , "D1"},
                   {"A2" , "B2" , "C2" , "D2"},
                   {"A3" , "B3" , "C3" , "D3"},
                   {"A4" , "B4" , "C4" , "D4"}};
                    
    
     for ( int r = 0; r < 4; r++ ) {
       for (int c = 0; c < 4; c++) {
         System.out.print(iD[r][c] + ": " + vendingMachine[r][c] + " = $" + cost[r][c] + "  " );
       }
       System.out.println();
       System.out.println();
     }
    
    System.out.println("Please enter '1' or '5' to access something in this vending machine.");
    Scanner pay = new Scanner(System.in);
    double payment = pay.nextDouble();
    
    System.out.println("Please enter the ID of the candy/chocolate you want.");
    Scanner vend = new Scanner(System.in);
    String product = vend.nextLine();
    
  for ( int r = 0; r < 4; r++ ) {
       for (int c = 0; c < 4; c++) {
          if (product.equals(iD[r][c])) {
            System.out.println("You picked " + iD[r][c]);
            String idStore = iD[r][c];
            String item = vendingMachine[r][c];
            double total =  cost[r][c];
            while (payment < cost[r][c]) {
              System.out.println("Please pay more to buy this product. Then we will give your choice of product.");
              Scanner repay = new Scanner(System.in);
              payment = pay.nextDouble() + payment;            
            }
               double change;
          change = payment -  total;
          System.out.println("Here is your change: $" + change + " and your item: " + idStore + " " + item);

          }
       }
     }  


    
    }
}


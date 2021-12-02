package demo;
import java.util.Scanner;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class


public class Welcome {
public static void main(String[] args) {
/*System.out.println("             "); 
System.out.println("             ");
String txt = "Hello, where am I?";
System.out.println(txt.indexOf("am"));
System.out.println(txt.toUpperCase());
System.out.println(txt.toLowerCase());
System.out.println(txt.length());
int myint = 9;
float myfn = 69.33339f;
double mydoub = 7.7494763937e40;
String txttxt = "hi";
char mychar = 'u';
System.out.println(myint);
System.out.println(mydoub);
System.out.println(myfn);
System.out.println(txttxt);
System.out.println(mychar);
System.out.println("             ");*/
LocalDateTime myDateObj = LocalDateTime.now();
DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E MMM dd yyyy HH:mm:ss");

String formattedDate = myDateObj.format(myFormatObj);
System.out.println(formattedDate);
System.out.println("             ");
System.out.println("             ");
System.out.println("             ");
System.out.println("             ");
Scanner objact = new Scanner(System.in);
System.out.println("Hi. Welcome to DeliveryDaddy."); 
System.out.println("We have Burgers, Pizzas and Sandwiches.");
System.out.println("What a fine day, " + formattedDate + "!");
boolean food = true;
int cost = 0;
while (food == true){
System.out.println("Please say what you want.");
switch (objact.nextLine()) {
case "Burger" :
System.out.println("How much?");
int quantity = objact.nextInt();
cost = quantity * 10;
System.out.println("Your order cost is: $" + cost + ". Thanks for ordering!");
break;

case "Pizza" :
System.out.println("How much?");
quantity = objact.nextInt();
cost = quantity * 20;
System.out.println("Your order cost is: $" + cost + ". Thanks for ordering!");
break;

case "Sandwich" :
System.out.println("How much?");
quantity = objact.nextInt();
cost = quantity * 15;
System.out.println("Your order cost is: $" + cost + ". Thanks for ordering!");
break;

default :
System.out.println("Sorry, we do not cook and sell that here. Please re-run the program and enter one of the following: \nBurger \nSandwich \nPizza.");
break;
} 
}
}
}

package question7;

import java.util.Scanner;

public class DessertShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String role = "";
        System.out.println("Enter the Role Owner or Customer");
        role = sc.nextLine();
        if (role.equals("owner")) {
            owner();
        } else if (role.equals("customer")) {
            customer();
        }
    }
    public static void owner()
    {
        Scanner sc = new Scanner(System.in);
        String add ="";
        System.out.println("Welcome Owner");
        System.out.println("What do u want to add");
        System.out.println("1.Candy\n 2.Cookie\n 3.Icecream");
        add = sc.nextLine();
        if(add.equals("candy"))
        {
            System.out.println("candy added to shop");
        }
        else if (add.equals("cookie"))
        {
            System.out.println("Cookie added to shop");
        }
        else if (add.equals("icecream"))
        {
            System.out.println("Icecream added to shop");
        }
    }
    public static void customer()
    {
        Scanner sc = new Scanner(System.in);
        String input = "";
        System.out.println("Welcome to our Dessert shop");
        System.out.println("What u want to buy");
        DessertItem dessertItem = new Icecream(400,12);
        dessertItem.getCost();
        new Candy(3,12).getCost();
        new Cookie(3,8).getCost();
        System.out.println("1.Candy\n 2.Cookie\n 3.Icecream");
        input = sc.nextLine();
        if(input.equals("candy"))
        {
            System.out.println("Order placed for candy");
        }
        else if (input.equals("cookie"))
        {
            System.out.println("Order placed for Cookie");
        }
        else if (input.equals("icecream"))
        {
            System.out.println("order placed for icecream");
        }
    }


}
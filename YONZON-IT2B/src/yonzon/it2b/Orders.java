package yonzon.it2b;

import java.util.Scanner;

public class Orders {
    
    public static void main(String[] args){
        
        Scanner sc = new scanner(System.in);
        
        
        System.out.println("Enter number of Order(s): ");
        int orders = sc.nextInt();
        
        for (int i = 0; i <= orders ; i++){
            
            System.out.println("Enter details of Order "+(i+1));
            System.out.println("/nOrder ID: ");
            Sring id = sc.next();
            System.out.println("\nCustomer name: ");
            String name = sc.next();
            System.out.println("\nOrder Date: ");
            String date = sc.next();
            System.out.println("\nOrder amount: ");
            double amount = sc.nextDouble();
            System.out.println("\nOrder status : ");
            String status = sc.next();
            
        }
    }
}
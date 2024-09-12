
package yonzon.it2b;

public class Order {

        String id, cname, status;
        double amount;
        int date;
        
       public void Order(String id, String cname, double amount, int date){
            
        this.id = id;
        this.cname = name;
        this.date = date;
        this.amount = amount;
        this,status = status;
        } 
       public void viewOrder(){
            
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n"
                    ,"Order ID","Customer name","Order date","Order amount","Order status");
            System.out.printf("%-10d %-10s %-10.1f %-10.1f %-10.1f %-10.1f %-10.1f %-10s\n"
                    ,this.id, this.cname,this.date,this.amount,this.status);
          
           
        }
 }
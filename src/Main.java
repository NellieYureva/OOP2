import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

      public static void main(String[] args) {

        Deque<Product> productsDeque = new ArrayDeque<>();

        Product p1 = new Product("Product1");
        Product p2 = new Product("Product2");
        Product p3 = new Product("Product3");
        Product p4 = new Product("Product4");

        productsDeque.addLast(p1);
        productsDeque.addLast(p2);
        productsDeque.addLast(p3);
        productsDeque.addLast(p4);

        
        Market market = new Market();

        Human hm = new Human("Olga");
        Human hm1 = new Human("Igor");
        market.acceptToMarket(hm);
        market.acceptToMarket(hm1);

       
       
        market.takeInQueue(hm);
        market.giveOrders();
        
        market.takeOrders(productsDeque); 
        
        market.releaseFromQueue(hm);
        market.releaseFromMarket(hm);
        
        market.update(productsDeque);
    


        



    }

}

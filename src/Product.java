import java.util.ArrayDeque;
import java.util.Deque;

public class Product {
    public Deque<Product> productsDeque = new ArrayDeque<>();
    public String name;
        
    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + 
                '}';
    }

}

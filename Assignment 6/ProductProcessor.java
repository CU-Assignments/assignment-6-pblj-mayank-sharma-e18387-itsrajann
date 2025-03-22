import java.util.*;
import java.util.stream.Collectors;

class Product {
    String name;
    String category;
    double price;

    Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String toString() {
        return name + " - Price: " + price;
    }
}

public class ProductProcessor {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", "Electronics", 800),
            new Product("Phone", "Electronics", 500),
            new Product("TV", "Electronics", 1000),
            new Product("Shirt", "Clothing", 50),
            new Product("Jeans", "Clothing", 80),
            new Product("Sofa", "Furniture", 700),
            new Product("Table", "Furniture", 300)
        );

        Map<String, Optional<Product>> mostExpensiveByCategory = products.stream()
            .collect(Collectors.groupingBy(
                p -> p.category,
                Collectors.maxBy(Comparator.comparingDouble(p -> p.price))
            ));

        double averagePrice = products.stream()
            .collect(Collectors.averagingDouble(p -> p.price));

        System.out.println("Most Expensive Product in Each Category:");
        mostExpensiveByCategory.forEach((category, product) ->
            System.out.println(category + ": " + product.orElse(null))
        );

        System.out.println("Average Price of All Products: " + averagePrice);
    }
}

package vendingmachine.domain;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private final List<Product> products;

    public Products() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public Integer getLowestPrice() {
        Integer lowestPrice = 1000;
        for (Product product : products) {
            lowestPrice = product.getProductPrice();
            if (product.getProductPrice() < lowestPrice) {
                lowestPrice = product.getProductPrice();
            }
        }
        return lowestPrice;
    }
}

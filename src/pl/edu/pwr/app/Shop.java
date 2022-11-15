package pl.edu.pwr.app;

import pl.edu.pwr.model.Product;

public class Shop {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Mleko");
        product.setProducer("Mlekowita");

        System.out.println(product.getName() + " " + product.getProducer());
    }
}

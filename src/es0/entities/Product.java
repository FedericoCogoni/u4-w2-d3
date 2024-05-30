package es0.entities;

import java.util.Random;

public class Product {
        private long id;
        private String name;
        private String category;
        private double price;

        Random random = new Random();

        public Product(String name,String category, double price){
            this.id = random.nextLong(899999999999L, 999999999999L );
            this.name = name;
            this.category = category;
            this.price = price;
        }
    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}

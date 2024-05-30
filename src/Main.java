import es0.entities.Product;
import es0.entities.Order;
import es0.entities.Customer;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Product> products = new ArrayList<>();
        Product acqua = new Product("sant'anna", "Alimentari", 1.00);
        Product birra = new Product("ichnusa", "Alimentari", 4.00);
        Product vino = new Product("mesa", "Alimentari", 8.00);

        Product scarpe = new Product("bullboys", "Boys", 25.00);
        Product maglia = new Product("adidas", "Boys", 20.00);
        Product pantalone = new Product("jeans", "Boys", 30.00);

        Product ciuccio = new Product("chicco", "Baby", 6.00);
        Product pannolini = new Product("day/night", "Baby", 26.00);
        Product cappello = new Product("sun", "Baby", 9.00);


        products.add(acqua);
        products.add(birra);
        products.add(vino);
        products.add(scarpe);
        products.add(maglia);
        products.add(pantalone);
        products.add(ciuccio);
        products.add(pannolini);
        products.add(cappello);

        System.out.println("prodotti alimentari che costano meno di 100");
        products.stream()
                .filter(product -> product.getCategory().equals("Alimentari"))
                .filter(product -> product.getPrice()<100.00)
                .forEach(product -> System.out.println(product.toString()));

        System.out.println("lista prodotti categoria Baby");
        products.stream()
                .filter(product -> product.getCategory().equals("Baby"))
                .forEach(product -> System.out.println(product.toString()));

        System.out.println("prodotti categoria 'Boys' scontati al 10%");
        products.stream()
                .filter(product -> product.getCategory().equals("Boys"))
                .forEach(product -> product.setPrice(product.getPrice()*0.9));
        products.stream()
                .filter(product -> product.getCategory().equals("Boys"))
                .forEach(product -> System.out.println(product));


    }
    }

package com.oleg.lesson1;

import com.oleg.lesson1.bean.Encoder;
import com.oleg.lesson1.bean.Product;
import com.oleg.lesson1.bean.RandomGenerator;
import com.oleg.lesson1.bean.SimpleCalculator;
import com.oleg.lesson1.service.EncoderService;
import com.oleg.lesson1.service.ProductService;
import com.oleg.lesson1.service.RandomGeneratorService;
import com.oleg.lesson1.service.SimpleCalculatorService;

public class Main {
    public static void main(String[] args) {
        // App
        Product product = new Product();
        ProductService productService = new ProductService(product);
        product.setName("Milk");
        product.setRegularPrice(100);
        product.setDiscount(10);

        System.out.println(productService.actualPrice());

    }
}

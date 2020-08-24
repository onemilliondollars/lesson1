package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.Product;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

public class ProductServiceTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void actualPrice() {
        Product product = new Product();
        ProductService productService = new ProductService(product);
        product.setName("iPhone 4s");
        product.setRegularPrice(100);
        product.setDiscount(10);
        double expected = 90.0;
        double actual = productService.actualPrice();
        assertEquals(expected,actual,0);
    }

    @Test
    public void printInformation() {
        Product product = new Product();
        ProductService productService = new ProductService(product);
        product.setName("iPhone 4s");
        product.setRegularPrice(100);
        product.setDiscount(10);
        productService.printInformation();
        String expected = "[main] INFO  com.oleg.lesson1.service.ProductService  - Product name: iPhone 4s Product regular price: 100.0 Product discount: 10.0\n";
        assertEquals(expected,systemOutRule.getLog());

    }
}
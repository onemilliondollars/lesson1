package com.oleg.lesson1.service;

import com.oleg.lesson1.bean.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductService {
    private Logger logger = LoggerFactory.getLogger(ProductService.class);
    private Product product;

    public ProductService(Product product) {
        this.product = product;
    }

    public double actualPrice(){
        logger.info("Actual price product method running");
        double actualPrice =  product.getRegularPrice() - (product.getRegularPrice() * (product.getDiscount() / 100));
        return actualPrice;
    }

    public void printInformation(){
        logger.info("Product name: " +product.getName()
        +" Product regular price: " +product.getRegularPrice()
        +" Product discount: " +product.getDiscount());
    }



}

package com.dialectics.spring.controller;

import com.dialectics.spring.bean.Product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huseyinaydin
 */
@RestController
@RequestMapping("api/products")
public class ProductController {

  @GetMapping
  public ResponseEntity getProducts() {
    List<Product> products = new ArrayList<>();
    products.add(new Product(1L, "Sütaş Süt 1 L", "Sütaş süt", new BigDecimal("9.99")));
    products.add(new Product(2L, "Erikli Su 0.5 L", "Erikli Su", new BigDecimal("4.25")));
    return ResponseEntity.ok(products);
  }
}

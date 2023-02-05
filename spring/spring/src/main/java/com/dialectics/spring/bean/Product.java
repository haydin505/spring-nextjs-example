package com.dialectics.spring.bean;

import java.math.BigDecimal;

/**
 * @author huseyinaydin
 */
public record Product(Long id, String productTitle, String productDescription, BigDecimal price) {

}

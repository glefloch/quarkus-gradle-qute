package org.my.group;

import io.quarkus.qute.TemplateExtension;

import java.math.BigDecimal;


public class TemplateExtensions {
    @TemplateExtension
    public static BigDecimal discountedPrice(Item item) {
        return item.price.multiply(new BigDecimal("0.9"));
    }

    @TemplateExtension(namespace = "str", matchName = TemplateExtension.ANY)
    public static String sayHello(String val) {
        return "hello " + val;
    }
}
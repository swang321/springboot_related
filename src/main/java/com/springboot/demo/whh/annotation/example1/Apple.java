package com.springboot.demo.whh.annotation.example1;

import java.lang.reflect.Field;

/**
 * @Author whh
 */
public class Apple {

    @FruitName(value = "apple", alias = "iphone")
    private String name;

    @FruitColor(fruitColor = Color.RED)
    private String color;

    public static void main(String[] args) {

        System.out.println(FruitName.class);
        Field[] fields = Apple.class.getDeclaredFields();
        System.out.println(FruitName.class);
        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {

                FruitName fruitName = field.getAnnotation(FruitName.class);

                System.out.println("fruitName: " + fruitName.value());
                System.out.println("alias: " + fruitName.alias());
            } else if (field.isAnnotationPresent(FruitName.class)) {

                FruitColor fruitColor = field.getAnnotation(FruitColor.class);

                System.out.println("fruitColor: " + fruitColor);
            }
        }

    }

}

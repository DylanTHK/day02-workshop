package prog;

import cart.*;

public class Main {
    
    public static void main(String[] args) {
        // Item apple = new Item("apple", "Apple");
        // Item orange = new Item("orange", "Orange");

        // apple.setPrice(.5f);
        // apple.setQuantity(10);

        
        Apple apple = new Apple();
        apple.setType("Fuji");
        Orange orange = new Orange();
        
        System.out.println(apple.getName());
        System.out.println(apple.getCode());
        System.out.println(apple.getType());

        System.out.println(orange.getName());
        System.out.println(orange.getCode());

        Item item = apple;
        System.out.printf("item code: %s\n", item.getCode());

        Apple washington = (Apple) item;
        System.out.printf("washington code: %s\n", washington.getCode());

        System.out.printf("is item an Orange? %b\n", item instanceof Orange);
        if (item instanceof Orange) {
            orange = (Orange) item; //this line might cause compiler error 
        }

    }
}

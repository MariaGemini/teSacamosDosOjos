import ar.com.ada.categories.tool.Nails;
import ar.com.ada.categories.tool.Screwdriver;
import ar.com.ada.store.Product;
import ar.com.ada.store.ShoppingCart;
import ar.com.ada.categories.clothes.Pants;
import ar.com.ada.categories.clothes.Shirt;
import ar.com.ada.categories.clothes.Socks;
import ar.com.ada.categories.grocery.Bread;
import ar.com.ada.categories.grocery.Flour;
import ar.com.ada.categories.grocery.Milk;
import ar.com.ada.categories.tool.Hammer;
import ar.com.ada.categories.toy.Ball;
import ar.com.ada.categories.toy.Car;
import ar.com.ada.categories.toy.Doll;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        Scanner sc = new Scanner(System.in);


        System.out.println("Bienvenido a su carrito de compras virtual");
        System.out.println("Elija los productos que quiere comprar: ");
        System.out.println("1. Pan");
        System.out.println("2. Harina");
        System.out.println("3. Leche");
        System.out.println("4. Pelota");
        System.out.println("5. Muñeca");
        System.out.println("6. Autito");
        System.out.println("7. Remera");
        System.out.println("8. Pantalón");
        System.out.println("9. Medias");
        System.out.println("10. Martillo");
        System.out.println("11. Hacha");
        System.out.println("12. Destornillador");
        System.out.println("0. Terminé de llenar mi carrito");

        int opcion;

        do {
            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    Product bread = new Bread(50., "Pan");
                    shoppingCart.addToProductList(bread);
                    System.out.print("Agregaste: ");
                    System.out.println(bread.getProductName());
                    break;
                case 2:
                    Product flour = new Flour(40., "Harina");
                    shoppingCart.addToProductList(flour);
                    System.out.print("Agregaste: ");
                    System.out.println(flour.getProductName());
                    break;
                case 3:
                    Product milk = new Milk(60., "Leche");
                    shoppingCart.addToProductList(milk);
                    System.out.print("Agregaste: ");
                    System.out.println(milk.getProductName());
                    break;
                case 4:
                    Product ball = new Ball(100., "Pelota");
                    shoppingCart.addToProductList(ball);
                    System.out.print("Agregaste: ");
                    System.out.println(ball.getProductName());
                    break;
                case 5:
                    Product doll = new Doll(200., "Muñeca");
                    shoppingCart.addToProductList(doll);
                    System.out.print("Agregaste: ");
                    System.out.println(doll.getProductName());
                    break;
                case 6:
                    Product car = new Car(4000., "Autito");
                    shoppingCart.addToProductList(car);
                    System.out.print("Agregaste: ");
                    System.out.println(car.getProductName());
                    break;
                case 7:
                    System.out.println("1. Niños 2. Mujer 3. Hombre");
                    Integer department;
                    department = sc.nextInt();
                    Product shirt = new Shirt(40., "Remera", department);
                    shoppingCart.addToProductList(shirt);
                    System.out.print("Agregaste: ");
                    System.out.println(shirt.getProductName());
                    break;
                case 8:
                    System.out.println("1. Niños 2. Mujer 3. Hombre");
                    department = sc.nextInt();
                    Product pants = new Pants(40., "Pantalon", department);
                    shoppingCart.addToProductList(pants);
                    System.out.print("Agregaste: ");
                    System.out.println(pants.getProductName());
                    break;
                case 9:
                    System.out.println("1. Niños 2. Mujer 3. Hombre");
                    department = sc.nextInt();
                    Product socks = new Socks(40., "Medias", department);
                    shoppingCart.addToProductList(socks);
                    System.out.print("Agregaste: ");
                    System.out.println(socks.getProductName());
                    break;
                case 10:
                    Product hammer = new Hammer(40., "Martillo");
                    shoppingCart.addToProductList(hammer);
                    System.out.print("Agregaste: ");
                    System.out.println(hammer.getProductName());
                    break;
                case 11:
                    Product nail = new Nails(40., "Clavos");
                    shoppingCart.addToProductList(nail);
                    System.out.print("Agregaste: ");
                    System.out.println(nail.getProductName());
                    break;
                case 12:
                    Product screwdriver = new Screwdriver(40., "Destornillador");
                    shoppingCart.addToProductList(screwdriver);
                    System.out.print("Agregaste: ");
                    System.out.println(screwdriver.getProductName());
                    break;
                case 0:
                    System.out.println("Terminaste de llenar tu carrito ");
                    break;

                default:
                    System.out.println("No es una opción válida");

            }

        } while (opcion != 0);


        System.out.println("Elija el método de pago: 1. Efectivo 2. TDC 3. TDD");

        shoppingCart.setPaymentMethod(sc.nextInt());

        System.out.println("Cantidad total de artìculos: " + shoppingCart.productlist.size());
        System.out.print("El precio total sin descuentos es: $");
        shoppingCart.calculateTotalWithoutdisc();
        System.out.println(shoppingCart.getPaymentWithoutDiscount());

        System.out.print("El total de descuentos es: $");
        shoppingCart.calculateTotalDisc();
        System.out.println(shoppingCart.getTotalDiscount());

        System.out.print("El total a pagar es: $");
        shoppingCart.calculateTotalWithDisc();
        System.out.println(shoppingCart.getPaymentWithDiscount());


    }
}







import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do produto: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        System.out.println("Dados do produto: " + product);

        System.out.println();

        System.out.println("Digite um número de produtos a serem adicionados no estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Dados do produto: " + product);

        System.out.println();

        System.out.println("Digite um número de produtos a serem removidos: " );
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Dados do produto: " + product);

        sc.close();

    }
}
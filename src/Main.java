import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Digite os dados do produto: ");
        System.out.print("Nome: ");
        product.name = sc.nextLine();
        System.out.print("Preço: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade: ");
        product.quantity = sc.nextInt();


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
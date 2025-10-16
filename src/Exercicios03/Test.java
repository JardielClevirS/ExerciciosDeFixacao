package Exercicios03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de Produtos: ");
        int productQuantity = sc.nextInt();
        sc.nextLine();  //Consumir quebra de linha

        Product[] vect = new Product[productQuantity];

        for (int i = 0; i < productQuantity ; i++) {
            System.out.printf("Digite o nome do %d objeto: ", i + 1);
            String nameOfObject = sc.nextLine();

            System.out.printf("Digite o Preço do %d objeto: ", i + 1);
            double priceOfObject = sc.nextDouble();

            vect[i] = new Product(nameOfObject, priceOfObject);
            sc.nextLine();
        }

        System.out.println("Lista com preço dos Objetos: ");
        for (int i = 0; i < productQuantity ; i++) {
            System.out.printf("%s = R$ %.2f%n", vect[i].getName(), vect[i].getPrice());
        }
    }

}

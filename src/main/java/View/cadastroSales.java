package View;

import Models.SalesMock;
import Models.sales;

import java.util.Scanner;

public class  cadastroSales {
    public static void cadastrarVendas(){
        Scanner scanner = new Scanner(System.in);
        SalesMock salesMock = new SalesMock();
        sales sale = new sales();

        System.out.println("Cadastro de vendas");

        System.out.print("Usuario: ");
        sales.user = scanner.nextLine();
        System.out.print("Senha: ");
        sales.password = scanner.nextLine();
        System.out.print("Produto: ");
        sales.products = scanner.nextLine();
        System.out.print("Valor: ");
        sales.value = scanner.nextLine();

        System.out.println("Venda Registrada: ");
        System.out.println("Usuario: " +SalesMock.user );
        System.out.println("Senha: " + SalesMock.password);
        System.out.println("Produto: " + SalesMock.products);
        System.out.println("Valor: " + SalesMock.value);
    }


}



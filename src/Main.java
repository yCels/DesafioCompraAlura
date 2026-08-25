import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu limite do cartão:  ");
        double limite = input.nextDouble();
        input.nextLine();

        Cartao cartao = new Cartao(limite);

        int sair = 1;

        while (sair != 0) {
            System.out.println("Digite o nome do produto que irá comprar :");
            String nome = input.nextLine();

            System.out.println("Digite o valor do produto: ");
            double valor = input.nextDouble();
            input.nextLine();

            Compra compra = new Compra(nome, valor);

            Boolean sucessoCompra = cartao.lancaCompra(compra);

            if (sucessoCompra) {
                System.out.println("O produto foi comprado com sucesso");

            } else {
                System.out.println("Saldo insufuciente");
                sair = 1;
            }
            System.out.println("Digite 1 para realizar outra compra");
            System.out.println("Digite 0 para sair : ");
            sair = input.nextInt();
            input.nextLine();

        }






    }
        }

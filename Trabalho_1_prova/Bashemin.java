import java.util.Scanner;

public class Bashemin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vagas vagas = new Vagas();
        int escolhaUser = 0;
        String placa;

        while(escolhaUser != 3){
            System.out.println("Informe a movimentação que deseja efetuar:");
            System.out.print("0 - Saida de carro\n1 - Entrada de carro\n3 - Encerrar programa\n");
            escolhaUser = sc.nextInt();

            if(escolhaUser == 0){
                System.out.println("Informe a placa do carro a ser retirado");
                placa = sc.next();
                vagas.removeCarro(placa);
            }else if(escolhaUser == 1){
                System.out.println("Informe a placa do carro a ser inserido");
                placa = sc.next();
                vagas.setVagas(placa);
                System.out.println(vagas);
            }else if(escolhaUser == 3){
                System.out.println("Encerrando sistema.");
            }else System.out.println("Informe uma opção valida");
        }
        sc.close();
    }
}
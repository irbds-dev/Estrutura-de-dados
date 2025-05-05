import java.util.Scanner;

public class Bashemin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vagas vagas = new Vagas();
        int escolhaUser = 0;
        String placa;

        while(escolhaUser != 4){
            System.out.print("\n\n### Informe a movimentação que deseja realizar: ###\n\n");
            System.out.print("0 - Saida de carro\n1 - Entrada de carro\n3 - Visualizar vagas\n4 - Encerrar programa\n");
            escolhaUser = sc.nextInt();

            if(escolhaUser == 0){
                System.out.print("\nInforme a placa do carro a ser retirado: ");
                placa = sc.next();
                vagas.removeCarro(placa);

            }else if(escolhaUser == 1){
                if(vagas.estaCheio()) {
                    System.out.println("\n\n### Não existe vaga para esse carro ###\n\n");
                }else{
                    System.out.print("\nexiste vaga para esse carro, informe a placa: ");
                    placa = sc.next();
                    if(vagas.setVagas(placa)) System.out.print("\n\n### Carro de placa: " + placa + " Estacionado na vaga: " + vagas.getOcupacao());
                }

            }else if(escolhaUser == 3){
                System.out.println(vagas);

            }else if(escolhaUser == 4){
                System.out.println("\n\n### Encerrando sistema ###\n\n");
                
            }else System.out.println("\n\n### Informe uma opção valida ###\n\n");
        }
        sc.close();
    }
}
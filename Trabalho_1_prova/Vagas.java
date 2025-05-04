public class Vagas {
    private String[] vagas;
    private int ocupacao;
    private int contaManobras = 0;

    public Vagas(){
        this.vagas = new String[10];
        this.ocupacao = 0;
    }

    public int getOcupacao(){
        return ocupacao;
    }

    public String getVagas(int index){
        return vagas[index];
    }

    // Adiciona carros no estacionamento
    public boolean setVagas(String placa){
        if(encontraPlaca(placa) != -1){
            System.out.println("\n\n### O carro já está estacionado ###\n\n");
            return false;
        }else{
            this.vagas[this.ocupacao++] = placa;
            return true;
        }
    }

    // recebe a solicitação para remover o carro e guia o fluxo
    public void removeCarro(String placa){
        int numVaga = encontraPlaca(placa);
        if(numVaga == -1){
            System.out.println("\n\n### Seu carro está estacionado em outro lugar, senhor ### \n\n");
        }else {
            Vagas auxVagas = manobraCarro(numVaga);
            estacionaRemovidos(auxVagas, placa);
        }
    }

    // responsavel por manobrar os carros e remover o solicitado
    public Vagas manobraCarro(int numVaga){
        
        Vagas auxVagas = new Vagas();
        for(int i = this.ocupacao-1; i > numVaga; i--){
            auxVagas.setVagas(vagasPop());
        }
        vagasPop();
        return auxVagas;
    }

    // retorna carros removidos na manobra para o estacionamento
    public void estacionaRemovidos(Vagas auxVagas, String placa){
        for(int i = auxVagas.getOcupacao()-1; i >= 0; i--){
            setVagas(auxVagas.vagasPop());
            contaManobras++;
        }
        System.out.println("\n\n### Carro placa: " + placa + " saiu com " + contaManobras + " manobra(s) realizada(s) ###\n\n");
        contaManobras = 0;
    }

    // remove itens da pilha
    public String vagasPop(){
        contaManobras++;
        return vagas[--this.ocupacao];
    }

    // verifica se a pilha esta cheia
    public boolean estaCheio(){
        return this.ocupacao == this.vagas.length;
    }

    // verifica se o item a ser removido se encontra na pilha, retorna sua posição 
    public int encontraPlaca(String placa){
        for(int qualVaga = ocupacao-1; qualVaga >= 0; qualVaga--){
            if(placa.equals(vagas[qualVaga])){
                return qualVaga;
            }
        }
        return -1;
    }

    // sobrescrita do toString
    @Override
    public String toString(){
        String s = "\nNumero de vagas ocupadas = " + ocupacao + "\n\n";
        for (int i = 0; i < ocupacao; i++)
            s += "### placa do carro na vaga " + (i+1) + ": " + vagas[i] + " ###\n";
        return s + "\n";
    }
}
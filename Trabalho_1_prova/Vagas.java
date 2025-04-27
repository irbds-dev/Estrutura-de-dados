public class Vagas {
    private String[] vagas;
    private int ocupacao;

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
    public void setVagas(String placa){
        if(estaCheio()) {
            System.out.println("Não existe vaga para esse carro");
        }
        else{
            this.vagas[this.ocupacao++] = placa;
            System.out.println("Carro adicionado");
        }
    }

    public void removeCarro(String placa){
        int numVaga = encontraPlaca(placa);
        if(numVaga == -1){
            System.out.println("Seu carro está estacionado em outro lugar, senhor");
        }else {
            System.out.println("NUMERO DA VAGA QUE O CARRO ESTÁ: " + numVaga);
            int contaManobras = 0;
            Vagas auxVagas = new Vagas();
            for(int i = this.ocupacao-1; i > numVaga; i--){
                auxVagas.setVagas(vagasPop());
                contaManobras++;
            }
            vagasPop();
            System.out.println("Numero de manobras realizadas: " + contaManobras);
            estacionaRemovidos(auxVagas);
        }
    }

    // retorna carros removidos na manobra
    public void estacionaRemovidos(Vagas auxVagas){
        for(int i = auxVagas.getOcupacao()-1; i >= 0; i--){
            setVagas(auxVagas.vagasPop());
        }
    }

    // remove itens da pilha
    public String vagasPop(){
        return vagas[--this.ocupacao];
    }

    // verifica se a pilha esta cheia
    public boolean estaCheio(){
        return this.ocupacao == this.vagas.length;
    }

    // verifica se o item a ser removido se encontra na pilha
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
        String s = "\nNumero de vagas ocupadas = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++)
            s += "placa do carro na vaga " + (i) + ": " + vagas[i] + "\n";
        return s + "\n";
    }
}
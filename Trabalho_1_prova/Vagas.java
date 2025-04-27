public class Vagas {
    private String[] vagas;
    private int ocupacao;
    private int contaManobras = 0;

    public Vagas(){
        this.vagas = new String[10];
        this.ocupacao = 0;
    }

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
            System.out.println("\n#######Codigo para remover o carro aqui");
        }
    }

    public boolean estaCheio(){
        return this.ocupacao == this.vagas.length;
    }

    public int encontraPlaca(String placa){
        for(int qualVaga = ocupacao; qualVaga >= 0; qualVaga--){
            if(placa.equals(vagas[qualVaga])){
                return qualVaga;
            }
        }
        return -1;
    }

    @Override
    public String toString(){
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++)
            s += "placa do carro na vaga " + (i) + ": " + vagas[i] + "\n";
        return s + "\n";
    }
}
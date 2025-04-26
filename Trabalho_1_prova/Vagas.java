public class Vagas {
    private String[] vagas;
    private int ocupacao;
    private int contaManobras = 0;

    public Vagas(){
        this.vagas = new String[10];
        this.ocupacao = 0;
    }

    public void setVagas(String placa){
        if(isFull()) {
            System.out.println("Não existe vaga para esse carro");
        }
        else{
            this.vagas[this.ocupacao++] = placa;
            System.out.println("Carro adicionado");
        }
    }

    public static void getVagas(){
        
    }

    public boolean isFull(){
        return this.ocupacao == this.vagas.length;
    }

    @Override
    public String toString(){
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++)
            s += "placa do carro na vaga " + (i+1) + ": " + vagas[i] + "\n";
        return s + "\n";
    }
}
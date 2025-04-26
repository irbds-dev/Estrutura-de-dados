public class Vagas {
    private String[] vagas;
    private int ocupacao;

    public Vagas(){
        this.vagas = new String[10];
        this.ocupacao = 0;
    }

    public void setVagas(String placa){
        if(isFull()) {
            System.out.println("Não existe vagas para esse carro");
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
            s += vagas[i] + " ";
        return s + "\n";
    }
}
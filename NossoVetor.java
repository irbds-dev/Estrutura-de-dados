public class NossoVetor{
  private int ocupacao;
  private int[] vetor;

  public NossoVetor(int tamanho){
    this.vetor = new int[tamanho];
    this.ocupacao = vetor.length;
  }

  public int removeElemento(int qnt){
    int aux = ocupacao;
    for(int i = 1; i <= qnt; i++){
      aux = vetor[--ocupacao];
    }

    return aux;
  }



  @Override
    public String toString() {
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++)
            s += vetor[i] + " ";
        return s + "\n";
    }
}
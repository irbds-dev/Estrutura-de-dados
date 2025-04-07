public class NossoVetor{
  private int ocupacao;
  private int[] vetor;

  public NossoVetor(int tamanho){
    this.vetor = new int[tamanho];
    this.ocupacao = vetor.length;
  }

  public NossoVetor(int[] vetor){
    this.vetor = vetor;
    this.ocupacao = vetor.length;
  }

  // Metodo do 1° exercicio
  public int removeElemento(int qnt){
    int aux = ocupacao;
    for(int i = 1; i <= qnt; i++){
      aux = vetor[--ocupacao];
    }

    return aux;
  }

  // Metodo do 2° exercicio
  public int[] invertePilha(int[] pilha){
    int aux1, aux2;

    for (int i = 0; i < pilha.length; i+=2) {
      aux1 = pilha[pilha.length - i - 1];
      aux2 = pilha[i];
      pilha[pilha.length - i - 1] = aux2;
      pilha[i] = aux1;
    }

    return pilha;
  }



  @Override
    public String toString() {
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++)
            s += vetor[i] + " ";
        return s + "\n";
    }
}
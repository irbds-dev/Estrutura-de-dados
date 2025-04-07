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
    System.out.println(pilha.length);
    for (int i = 0, v = 0; i < pilha.length; i+=2, v++) {
      aux1 = pilha[pilha.length - v - 1];
      aux2 = pilha[v];
      pilha[pilha.length - v - 1] = aux2;
      pilha[v] = aux1;
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
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

  ///////////////////////////// INICIO Metodo do 1° exercicio
  public int removeElemento(int qnt){
    int aux = ocupacao;
    for(int i = 1; i <= qnt; i++){
      aux = vetor[--ocupacao];
    }

    return aux;
  }
  ///////////////////////////// FIM Metodo do 1° exercicio

  ///////////////////////////// INICIO Metodo do 2° exercicio
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
  ///////////////////////////// FIM Metodo do 2° exercicio

  ///////////////////////////// INICIO Metodo do 4° exercicio
  public int[] agrupaPilha(int[] pilha1, int[] pilha2){
    int ocupacao1 = pilha1.length -1;
    int ocupacao2 = pilha2.length -1;
    int aux1 = 0;
    int aux2 = 0;
    this.ocupacao = 0;

    while(ocupacao1+ocupacao2 >= -1){
      if(ocupacao1 >= 0){
        aux1 = removeElemento(pilha1, ocupacao1);
      }else{
        aux1 = removeElemento(pilha2, ocupacao2);
      } 
      
      if(ocupacao2 >= 0){
        aux2 = removeElemento(pilha2, ocupacao2);
      }else{
        aux2 = removeElemento(pilha1, ocupacao1);
      } 

      if(aux1 <= aux2){
        addElemento(aux1);
        ocupacao1--;
      }else{
        addElemento(aux2);
        ocupacao2--;
      }
    }

    return vetor;
  }

  public int removeElemento(int[] vetor, int index){
    return vetor[index];
  }

  public void addElemento(int valor){
    this.vetor[ocupacao++] = valor;
  }
  ///////////////////////////// FIM Metodo do 4° exercicio


  ///////////////////////////// INICIO Exercico 7
  /// int[] p1 = {1,2,3,4}
  /// int[] p2 = {}
  /// int[] p3 = {}
  /// int temp = p1.pop();        ||        p1 = [1, 2, 3]; temp = 4
  /// p2.push(temp);              ||        p2 = [4];
  /// p3.push(p1.pop());          ||        p1 = [1, 2]; p3 = [3]
  /// p2.push(p1.pop());          ||        p1 = [1]; p2 = [4, 2]
  /// temp = p1.pop();            ||        p1 = []; temp = 1;
  /// p3.push(temp);              ||        p3 = [3, 1]
  /// p1.push(p2.pop());          ||        p2 = [4]; p1 = [2]
  /// p3.push(p2.pop());          ||        p2 = []; p3 = [3, 1, 4]
  /// p3.push(p1.pop());          ||        p1 = []; p3 = [3, 1, 4, 2]
  ///////////////////////////// FIM Exercico 7

  
  @Override
    public String toString() {
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++)
            s += vetor[i] + " ";
        return s + "\n";
    }
}
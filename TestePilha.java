public class TestePilha {
  public static void main(String[] args) {
    
    ///////////////////////// Primeiro exercicio
    // NossoVetor vet = new NossoVetor(4);
    // vet.removeElemento(2);
    // System.out.println(vet);

    ///////////////////////// Segundo exercicio
    // int[] pilhaTeste = {1,2,3,4,5};

    // NossoVetor vet = new NossoVetor(pilhaTeste);
    // vet.invertePilha(pilhaTeste);
    // System.out.println(vet);

    ///////////////////////// Quarto exercicio
    int[] pilha1 = {187,89,84,82,38,14,10};
    int[] pilha2 = {14,12,10};
    int tamVetor = pilha1.length+pilha2.length;

    NossoVetor vet = new NossoVetor(tamVetor);
    vet.agrupaPilha(pilha1, pilha2);
    System.out.println(vet);
  }
}

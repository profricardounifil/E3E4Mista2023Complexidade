public class Main {
    public static void main(String[] args) {
        VetorOps vetorOps = new VetorOps();
        vetorOps.preencherVetor();
        vetorOps.mergeSort(0, vetorOps.vetor.length-1);
        vetorOps.exibirVetor();
    }
}

import java.util.Scanner;

public class VetorOps {
    Integer vetor [] = new Integer [5];


    public void preencherVetor() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.print("Vetor[" + i + "] = ");
            this.vetor[i] = scanner.nextInt();
        }
    }

    public void ordenarCrescente() {
        for (int j = 0; j < this.vetor.length-1; j++) {
            int aux;
                int cont = 0;
                System.out.println("Laço Externo.");
                for (int i = 0; i < this.vetor.length-1-j; i++) {
                    if(this.vetor[i] > this.vetor[i+1]) {
                        aux = this.vetor[i];
                        this.vetor[i] = this.vetor[i+1];
                        this.vetor[i+1] = aux;
                        cont++;
                    }
                }
                if(cont == 0) {
                    break;
                }
        }

    }

    public void exibirVetor() {
        System.out.println("Exibindo o vetor: ");
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.println("Vetor[" + i + "] = " + this.vetor[i]);
        }
        System.out.println("=============");
    }
}

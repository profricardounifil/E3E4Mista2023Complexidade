import java.util.Scanner;

public class VetorOps {
    Integer vetor [] = new Integer [5];
    int aux;


    public void preencherVetor() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.print("Vetor[" + i + "] = ");
            this.vetor[i] = scanner.nextInt();
        }
    }

    public void bubbleSort() {
        for (int j = 0; j < this.vetor.length-1; j++) {
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

    public void insertionSort() {
        for (int i = 1; i < this.vetor.length; i++) {
            if(this.vetor[i] < this.vetor[i-1]) {
                for (int j = i; j > 0; j--) {
                    this.aux = this.vetor[j];
                    this.vetor[j] = this.vetor[j-1];
                    this.vetor[j-1] = this.aux;
                    if(j == 1 || this.vetor[j-1] > this.vetor[j-2]) {
                        break;
                    }
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < this.vetor.length-1; i++) {
            int indiceMenor = i;
            for (int j = i+1; j < this.vetor.length; j++) {
                if(this.vetor[j] < this.vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            aux = this.vetor[i];
            this.vetor[i] = this.vetor[indiceMenor];
            this.vetor[indiceMenor] = aux;
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

import java.util.*;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        double somaNotas = 0;
        double nota;
        int quantidade = 0;

        System.out.println("--------------------------------");
        System.out.println("CALCULADORA MÉDIA GERAL DA TURMA");
        System.out.println("--------------------------------\n");

        System.out.println("Digite um número negativo para finalizar\n");

        do{

            System.out.println("Digite a média: ");
            nota = entrada.nextDouble();
            System.out.println();

            if (nota >= 0 && nota <= 10){

                somaNotas += nota;
                quantidade++;
            }
            else if (nota > 10) System.out.println("Média inválida!\n");

        }
        while(nota >= 0);

        if (quantidade > 0) {

            double media = somaNotas / quantidade;

            System.out.printf("Média geral: %.2f", media);

        }
        else{
            System.out.println("Nenhuma média digitada.");
        }
        entrada.close();

    }

}

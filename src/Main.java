import java.util.*;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        double media;

        double somaMedias = 0;
        int quantidadeMedias = 0;

        int idAluno = 1;

        double maiorMedia = 0;
        double menorMedia = 10;

        int quantidadeAprovados = 0;
        int quantidadeReprovados = 0;

        System.out.println("--------------------------------");
        System.out.println("CALCULADORA MÉDIA GERAL DA TURMA");
        System.out.println("--------------------------------\n");

        System.out.println("Digite um número negativo para finalizar\n");

        do{

            System.out.printf("Digite a média do %dº aluno: \n", idAluno);
            media = entrada.nextDouble();
            System.out.println();

            if (media >= 0 && media <= 10){

                if (media > maiorMedia) maiorMedia = media;
                if (media < menorMedia) menorMedia = media;

                if (media >= 6) quantidadeAprovados++;
                if (media < 6) quantidadeReprovados++;

                somaMedias += media;
                quantidadeMedias++;
                idAluno++;
            }
            else if (media > 10) System.out.println("Média inválida!\n");

        }
        while(media >= 0);

        if (quantidadeMedias > 0) {

            double mediaFinal = somaMedias / quantidadeMedias;

            System.out.println("----------");
            System.out.println("RESULTADOS");
            System.out.println("----------");
            System.out.printf("Média geral: %.2f %n", mediaFinal);
            System.out.printf("Maior média: %.2f %n", maiorMedia);
            System.out.printf("Menor média: %.2f %n", menorMedia);
            System.out.println("--------------------");
            System.out.printf("Quantidade de alunos: %d %n", quantidadeMedias);
            System.out.printf("Quantidade de Aprovados: %d %n", quantidadeAprovados);
            System.out.printf("Quantidade de Reprovados: %d %n", quantidadeReprovados);

        }
        else{
            System.out.println("Nenhuma média digitada.");
        }
        entrada.close();

    }

}

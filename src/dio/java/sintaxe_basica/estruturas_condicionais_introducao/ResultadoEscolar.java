package dio.java.sintaxe_basica.estruturas_condicionais_introducao;

import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a nota do(a) aluno(a): ");
        double nota = scanner.nextDouble();


        if(nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)    
        System.out.println("Prova de recuperação");

        else
            System.out.println("Reprovado");
    }
}

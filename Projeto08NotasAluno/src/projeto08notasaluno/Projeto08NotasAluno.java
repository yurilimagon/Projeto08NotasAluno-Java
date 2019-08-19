/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto08notasaluno;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Projeto08NotasAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Solicite ao usuario que informe as
        tres Notas (de 0 a 10) de um aluno, e calcule a
        média e teste as condicoes:
        1) se a média for menor ou igual a 5.0 (Reprovado)
        2) se a média for menor ou igual a 7.0 (Aprovado)
        3) se a média for menor ou igual a 9.0 (Muito Bom)
        4) se a média for maior do que 9.0 (Excelente)
        */
        
        Scanner entrada = new Scanner(System.in);
        
        float nota1, nota2, nota3, media;
        
        System.out.println("Digite a nota 1: ");
        nota1 = entrada.nextFloat();
        
        System.out.println("Digite a nota 2: ");
        nota2 = entrada.nextFloat();
        
        System.out.println("Digite a nota 3: ");
        nota3 = entrada.nextFloat();
        
        media = ((nota1 + nota2 + nota3) / 3);
        
        System.out.printf("Média: %.2f", media);
        
        if(media <= 5.0)
        {
            System.out.print(" - Reprovado \n");
        }
        else if(media <= 7.0)
        {
            System.out.print(" - Aprovado \n");
        }
        else if(media <= 9.0)
        {
            System.out.print(" - Muito Bom \n");
        }
        else if(media > 9.0)
        {
            System.out.print(" - Excelente \n");
        }
    }
}

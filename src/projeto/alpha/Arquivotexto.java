/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.alpha;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 66241001258
 */
public class Arquivotexto {
    
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int i, n;
        
        System.out.println("informe o  número para a tabuada:\n");
        n = ler.nextInt();
        
        FileWriter arq = new FileWriter("C:\\Users\\66241001258\\Downloads\\tabuada.txt");
       PrintWriter gravarArq = new PrintWriter(arq);
       
       gravarArq.printf("+--Resultado--+%n");
        for (int j = 1; j < 10; j++) {
            gravarArq.printf("| %2d X %d = %2d |%n", j, n, (j*n));
        }
        gravarArq.printf("+-------------+");
        
        arq.close();
        
        System.out.println("\nTabuada do %d foi gravada com sucesso em \"d:\\tabuada.txt\".\n");
        }
    
    public static void text() throws IOException{
         FileWriter arquivo = new FileWriter("C:\\Users\\66241001258\\Downloads\\cadastro.txt");
       PrintWriter gravarArq = new PrintWriter(arquivo);
    }
    }

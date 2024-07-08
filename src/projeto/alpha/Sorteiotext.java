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
public class Sorteiotext {
    
  
    public static void main(String[] args) throws IOException {
        int []vet = new int [10];
        Scanner ler = new Scanner(System.in);
        int i, n;
        
        /*System.out.println("informe o  número para a tabuada:\n");
        n = ler.nextInt();*/
        
        FileWriter arq = new FileWriter("C:\\Users\\66241001258\\Downloads\\tabuada.txt");
       PrintWriter gravarArq = new PrintWriter(arq);
       
       gravarArq.printf("+--numbers--+%n");
        for (int k = 0; k < 10; k++) {
             vet[k] = (int) (Math.random() * 100 + 1);
        }
        for (int j = 1; j < 10; j++) {
            if(vet[j]<10){
           gravarArq.println("|0"+vet[j]+"         |");
            }
            else{gravarArq.println("|"+vet[j]+"         |");}
            
           
        }
        gravarArq.printf("+-----------+");
        
        arq.close();
        
        System.out.println("\nTabuada do %d foi gravada com sucesso em \"d:\\tabuada.txt\".\n");
        }
}

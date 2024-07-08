/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.alpha;

import java.util.Scanner;

/**
 *
 * @author 66241001258
 */
public class ProjetoAlpha {


    public static int dobro(int a){
    return a*2;
    }
    
    public static int quadrado(int b){
    return b*b;
    }
    
    public static void sequencia(int c){
        System.out.println((c-1));
        System.out.println((c+1));
    }
          
    public static void sorteio(int b){
        double n;
        int m, z=0, y=0;
    while(y!=b){
    n = Math.random() * 30 + 1;
    m = (int)n;
  System.out.println(m);
  y=y+1;
    }
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nr = new Scanner(System.in);
        System.out.println("informe 3 numeros");
        int a = nr.nextInt();
        int b = nr.nextInt();
       int c = nr.nextInt();
       int d;
       System.out.println("o dobro de " + a + " e ");
       System.out.println(dobro(a));
        System.out.println("o quadrado de " + b + " e ");
       System.out.println(quadrado(b));
        System.out.println("os numeros ant6ecessor e sucessor de " + c + " sao ");
   sequencia(c);
    System.out.println("diga um numero de sorteio a serem feitos");
      d=nr.nextInt();
       sorteio(d);
        
        

}}

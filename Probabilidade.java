package com.mycompany.probabilidade;
import java.util.Random;
import java.util.Scanner;
//Programa criado por Antônio Lucas Costa Araújo.
import javax.swing.JOptionPane;


public class Probabilidade {

    public static void main(String[] args) {
  
        Scanner s = new Scanner(System.in);
        int palpite = Integer.parseInt(JOptionPane.showInputDialog(" Em uma empresa um sorteio será feito para o funcionário do mês.\n Entre com o seu palpite: \nDigite 1 para Davi Lucas. \nDigite 2 para Anna Sofia. \n"));
        System.out.println("Seu palpite é: " + palpite);
      
        Random n = new Random();
        int nome = n.nextInt(2)+1;
            
        if(palpite>0 && palpite<3) {
             
            if(palpite == nome){
                System.out.println("Parabéns! você acertou, seu palpite está CORRETO!.");
            }else{
                System.out.println("Que pena, não foi dessa vez, seu palpite está ERRADO!.");
            }
                    
            if(nome == 1){
                System.out.println("O aluno(a) sorteado foi: 1 = Davi Lucas");
            }
            
            if(nome == 2){
                System.out.println("O aluno(a) sorteado foi: 2 = Anna Sofia");
            }
            
        }
        if(palpite<=0 || palpite>2){  
           System.out.println("Por favor, digite um palpite válido!");
        }  
        
    } 
}

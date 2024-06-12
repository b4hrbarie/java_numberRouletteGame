import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Boas vindas! Quer brincar de adivinhar? s = sim / n = não");
    Scanner scan1 = new Scanner(System.in);
    char wannaPlay = scan1.next().charAt(0);
      if (wannaPlay =='s') {
        System.out.println("Escolha uma dificuldade: ");
        System.out.println("1 - Fácil (1 a 10 com três tentativas)");
        System.out.println("2 - Médio (1 a 50 com quinze tentativas)");
        System.out.println("3 - Difícil (1 a 100 com vinte tentativas)");
        System.out.println("4 - Impossível (1 a 500 com incontáveis tentativas)");
        Scanner scan2 = new Scanner(System.in);
        int difficulty = scan2.nextInt();
            //Declaração de variáveis que serão usadas em todas as dificuldades
            Random random = new Random();
            int guess = 0;
            int tries =1;
            int rouletteNumber = 0;
            switch (difficulty){
              //Dificuldade fácil
              case 1 : {
                int totalTries = 3;
                System.out.println("Estou pensando em um número de 1 à 10. Tente adivinhar! (voce tem 3 tentativas)");
                rouletteNumber = random.nextInt(1,11);
                do {
                Scanner scan3 = new Scanner(System.in);
                guess = scan3.nextInt();  
                if (guess == rouletteNumber) {
                System.out.println("Parabéns! Você acertou!");
                break;
                } else if (tries < (totalTries -1)) {
                System.out.println("Você errou! Tente novamente! (tentativa " +tries+")");
                tries++;
                } else {
                  System.out.println("ATENÇÃO! Ultima tentativa!");
                  tries ++;
                }
                  
                } while (guess != rouletteNumber && tries <= totalTries);
                if (tries == (totalTries+1)) {
                  System.out.println("GAME OVER! Você perdeu! O número era " +rouletteNumber);
                }
              } break; 
              //Dificuldade média
              case 2 : {
                int totalTries = 15;
                System.out.println("Estou pensando em um número de 1 à 50. Tente adivinhar! (voce tem 15 tentativas)");
                rouletteNumber = random.nextInt(1,16);
                do {
                Scanner scan3 = new Scanner(System.in);
                guess = scan3.nextInt();  
                if (guess == rouletteNumber) {
                System.out.println("Parabéns! Você acertou!");
                break;
                } else if (tries < (totalTries -1)) {
                System.out.println("Você errou! Tente novamente! (tentativa " +tries+")");
                tries++;
                } else {
                  System.out.println("ATENÇÃO! Ultima tentativa!");
                  tries ++;
                }
                } while (guess != rouletteNumber && tries <= totalTries);
                if (tries == (totalTries+1)) {
                System.out.println("GAME OVER! Você perdeu! O número era " +rouletteNumber);
                }
              } break;
              //Dificuldade dicíl
              case 3 : {
                int totalTries = 20;
                System.out.println("Estou pensando em um número de 1 à 100. Tente adivinhar! (voce tem 20 tentativas)");
                rouletteNumber = random.nextInt(1,21);
                do {
                Scanner scan3 = new Scanner(System.in);
                guess = scan3.nextInt();  
                if (guess == rouletteNumber) {
                System.out.println("Parabéns! Você acertou!");
                break;
                } else if (tries < (totalTries -1)) {
                System.out.println("Você errou! Tente novamente! (tentativa " +tries+")");
                tries++;
                } else {
                  System.out.println("ATENÇÃO! Ultima tentativa!");
                  tries ++;
                }
                } while (guess != rouletteNumber && tries <= totalTries);
                if (tries == (totalTries+1)) {
                  System.out.println("GAME OVER! Você perdeu! O número era " +rouletteNumber);
                }
              } break;
          
            
            }
        
      }
  }
}
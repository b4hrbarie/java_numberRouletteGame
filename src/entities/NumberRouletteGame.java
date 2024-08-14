package entities;

public class NumberRouletteGame {
    //para iniciar o jogo
    private char wannaPlay;
    private int difficulty;
    private int totalTries; //depende da dificuldade, colocar um set

    private int guess = 0;
    private int tries = 1;



    public Integer newGame() {
        validateNewGame();
        // botar uma estrutura que sete o this.totaltries (case, lista, sei lá)  
        return this.difficulty = 1;
    }

    private void validateNewGame() {
        if (this.wannaPlay != 's' & != 'n') {

        } 

    }


    
}

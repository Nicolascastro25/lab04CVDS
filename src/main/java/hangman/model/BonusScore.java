/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman.model;

import com.google.inject.Inject;

/**
 *
 * @author jaime.cacuna valentina Alvarado
 */
public class BonusScore implements GameScore{
    private int score;
    @Inject
    public BonusScore() {
       score = 0;
    }

    /*
    * Esta clase calcula el puntaje para el tipo de juego bonus.
    * @param correctCount 
    * @param incorrectCount
    * @pos Se calcula el puntaje usando la ecuacion: correctCount*10-(5*incorrectCount)
    * en caso de que incorrectCount sea > 10 y el valor sea negativo; el puntaje 
    * por defecto cerá cero.
    * @return int
    * @throws cuando correctCount o incorrectCount son valores negativos
    */
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException {
        if (correctCount < 0 || incorrectCount < 0) {
            throw new GameScoreException(GameScoreException.INVALIDCOUNT);
        } else {
            score += 10 * correctCount;
            score -= 5 * incorrectCount;
            if(score < 0){
                score = 0;
            }
        }
        return score;
    }
}

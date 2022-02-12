/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman.model;

/**
 *
 * @author jaime.cacuna
 */
public class BonusScore implements GameScore{

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
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}

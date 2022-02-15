/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman.model;

/**
 *
 * @author jaime.cacuna Valentina Alvarado
 */
public class OriginalScore implements GameScore {
    
    /*
    * Esta clase calcula el puntaje para el tipo de juego original.
    * @param correctCount 
    * @param incorrectCount
    * @pre puntaje inicia con 100 puntos
    * @pos Se calcula el puntaje usando la ecuacion: puntaje-(10*incorrectCount)
    * en caso de que incorrectCount sea > 10 y el valor sea negativo; el puntaje 
    * por defecto cerá cero.
    * @return int
    * @throws cuando correctCount o incorrectCount son valores negativos
    */
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException{
        int puntaje = 100;
        if(correctCount <0 || incorrectCount < 0){
            throw new GameScoreException(GameScoreException.INVALIDCOUNT);
        }else{
            puntaje -= 10*incorrectCount;
            if(puntaje < 0){
                puntaje = 0;
            }
        }
        return puntaje;
    }
}

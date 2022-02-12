/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman.model;

/**
 *
 * @author jaime.cacuna
 */
public interface GameScore {
    /*
    * Esta clase abstracta calcula el puntaje dependiendo del esquema.
    * @param correctCount 
    * @param incorrectCount
    * @return int
    */ 
    public abstract int calculateScore(int correctCount, int incorrectCount);
}

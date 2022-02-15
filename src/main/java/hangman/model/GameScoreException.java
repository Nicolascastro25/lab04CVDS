/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman.model;

/**
 *
 * @author jaime.cacuna
 */
public class GameScoreException extends Exception {
    public static final String INVALIDCOUNT = "Contadores deben ser positivos";
    public GameScoreException(String msg){
        super(msg);
    }
}

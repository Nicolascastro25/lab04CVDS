/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package hangman.Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import hangman.model.*;
import org.junit.Assert;

/**
 *
 * @author jaime.cacuna
 */
public class GameScoreTest {
    
    @Test
    public void deberialanzarexcos () throws GameScoreException{
        GameScore score = new OriginalScore();
        try{
            int punt = score.calculateScore(-3,-2);
        }catch(Exception ex){}
    }
    
    @Test
    public void deberiacalcularpuntajeos() throws GameScoreException{
        GameScore score = new OriginalScore();
        int punt = score.calculateScore(2,5);
        Assert.assertEquals(score,50);
    }
    
    //bonusscore
    @Test
    public void deberilanzarexbs() throws GameScoreException{
        GameScore score = new BonusScore();
        try{
            int punt = score.calculateScore(-10, -2);
        }
        catch(Exception ex){}
    }
    
    @Test
    public void deberiacalcularpuntajebs() throws GameScoreException{
        GameScore score = new BonusScore();
        int punt = score.calculateScore(2,5);
        Assert.assertEquals(score,50);
    }
    
    //powerscore
    @Test
    public void deberialanzarexps() throws GameScoreException{
        GameScore score = new PowerScore();
        try{
            int punt = score.calculateScore(-10, -2);
        }
        catch(Exception ex){}
    }
    
    @Test
    public void deberiacalcularpuntajeps() throws GameScoreException{
        GameScore score = new PowerScore();
        int punt = score.calculateScore(2,5);
        Assert.assertEquals(score,50);
    }
}

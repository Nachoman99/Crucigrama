/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.Serializable;

/**
 * this class is responsible for the progress of each user
 * 
 *@version 10/12/2018
 * @author Kevin Trejos/Jose Ignacio Zamora/Edwin Molina
 */
public class Progress implements Serializable {
    private int levelEasy;
    private int levelMedium;
    private int levelHard;
    private int levelVeryHard;

    /**
     *Builder

     */
    
    
    public Progress() {
        this(0,0,0,0);
    }

    public Progress(int levelEasy, int levelMedium, int levelHard, int levelVeryHard) {
        this.levelEasy = levelEasy;
        this.levelMedium = levelMedium;
        this.levelHard = levelHard;
        this.levelVeryHard = levelVeryHard;
    }

    /**
     * get
     * @return
     */
    public int getLevelEasy() {
        return levelEasy;
    }

    /**
     * set
     * @param levelEasy
     */
    public void setLevelEasy(int levelEasy) {
        this.levelEasy = levelEasy;
    }

    /**
     * get
     * @return
     */
    public int getLevelMedium() {
        return levelMedium;
    }

    /**
     *set
     * @param levelMedium
     */
    public void setLevelMedium(int levelMedium) {
        this.levelMedium = levelMedium;
    }

    /**
     *get
     * @return
     */
    public int getLevelHard() {
        return levelHard;
    }

    /**
     *set
     * @param levelHard
     */
    public void setLevelHard(int levelHard) {
        this.levelHard = levelHard;
    }

    /**
     *get
     * @return
     */
    public int getLevelVeryHard() {
        return levelVeryHard;
    }

    /**
     * set
     * @param levelVeryHard
     */
    public void setLevelVeryHard(int levelVeryHard) {
        this.levelVeryHard = levelVeryHard;
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        return "Progress{" + "levelEasy=" + levelEasy + ", levelMedium=" + levelMedium + ", levelHard=" + levelHard + ", levelVeryHard=" + levelVeryHard + '}';
    }
}

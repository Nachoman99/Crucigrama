/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.Serializable;

/**
 *
 * @author Kevin Trejos
 */
public class Progress implements Serializable {
    private int levelEasy;
    private int levelMedium;
    private int levelHard;
    private int levelVeryHard;

    public Progress(int levelEasy, int levelMedium, int levelHard, int levelVeryHard) {
        this.levelEasy = levelEasy;
        this.levelMedium = levelMedium;
        this.levelHard = levelHard;
        this.levelVeryHard = levelVeryHard;
    }

    public int getLevelEasy() {
        return levelEasy;
    }

    public void setLevelEasy(int levelEasy) {
        this.levelEasy = levelEasy;
    }

    public int getLevelMedium() {
        return levelMedium;
    }

    public void setLevelMedium(int levelMedium) {
        this.levelMedium = levelMedium;
    }

    public int getLevelHard() {
        return levelHard;
    }

    public void setLevelHard(int levelHard) {
        this.levelHard = levelHard;
    }

    public int getLevelVeryHard() {
        return levelVeryHard;
    }

    public void setLevelVeryHard(int levelVeryHard) {
        this.levelVeryHard = levelVeryHard;
    }

    @Override
    public String toString() {
        return "Progress{" + "levelEasy=" + levelEasy + ", levelMedium=" + levelMedium + ", levelHard=" + levelHard + ", levelVeryHard=" + levelVeryHard + '}';
    }
}

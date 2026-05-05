package com.yukitey.spring.whfrp.data.character;

/**
 * @author Andrey Sadovinskiy
 */
public abstract class Fate {

    private final int fate;
    private int fortune;

    public Fate(final int fate) {
        this.fate = fate;
        this.fortune = fate + getModifier();
    }

    public int getFate() {
        return fate;
    }

    public int getFortune() {
        return fortune;
    }

    public void resetFortune() {
        this.fortune = fate + getModifier();
    }

    public void usedFortune(){
        fortune--;
    }

    protected abstract int getModifier();
}
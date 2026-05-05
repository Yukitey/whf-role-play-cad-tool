package com.yukitey.spring.whfrp.data.character;

public abstract class Movement {

    private final int movement;

    public Movement(final int movement) {
        this.movement = movement;
    }

    public int getMovement() {
        return movement + getModifier();
    }

    public int getWalk() {
        return getMovement() * 2;
    }

    public int getRun() {
        return getWalk() * 2;
    }

    protected abstract int getModifier();
}

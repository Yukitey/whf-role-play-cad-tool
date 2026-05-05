package com.yukitey.spring.whfrp.data;

public abstract class AbstractValue {

    private final int initial;

    private int advances;

    protected AbstractValue(final int initial) {
        this.initial = initial;
    }

    public int getInitial() {
        return initial;
    }

    public int getAdvances() {
        return advances;
    }

    public void setAdvances(int advances) {
        this.advances = advances;
    }

    public int getCurrent() {
        return getInitial() + getAdvances();
    }
}
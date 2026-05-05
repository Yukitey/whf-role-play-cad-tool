package com.yukitey.spring.whfrp.data.character;

/**
 * @author Andrey Sadovinskiy
 */
public class Experience {

    private int total;
    private int spent;

    public Experience(final int total) {
        this(total, 0);
    }

    public Experience(final int total, final int spent) {
        this.total = total;
        this.spent = spent;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(final int total) {
        this.total = total;
    }

    public int getSpent() {
        return spent;
    }

    public void setSpent(final int spent) {
        this.spent = spent;
    }

    public int getCurrent() {
        return total - spent;
    }
}
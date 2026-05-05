package com.yukitey.spring.whfrp.data.character;

import org.springframework.lang.NonNull;

public class Resilience {
    private final int resilience;

    private int resolve;

    private final String motivation;

    public Resilience(final int resilience, @NonNull final String motivation) {
        this.resilience = resilience;
        this.resolve = resilience;
        this.motivation = motivation;
    }

    public int getResilience() {
        return resilience;
    }

    public int getResolve() {
        return resolve;
    }

    @NonNull
    public String getMotivation() {
        return motivation;
    }

    private void motivationFulfillment(){
        if (resolve < resilience){
            resolve++;
        }
    }
}
package com.yukitey.spring.whfrp.data;

import java.util.Random;

public enum Dice {
    
    D10(10),
    D100(100);

    private static final Random random = new Random();
    private final int edge;
    Dice(int edge) {

        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    public int roll(){
        return random.nextInt(getEdge()) +1;
    }

    public int roll(final int count){
        int result = 0;
        for (int i= 0; i < count; i++){
            result+= roll();
        }
        return result;
    }
}
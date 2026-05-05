package com.yukitey.spring.whfrp.data;

public enum TestDifficulty {
    ;

    private final int modifier;

    TestDifficulty(int modifier) {
        this.modifier = modifier;
    }

    public int getModifier() {
        return modifier;
    }
}

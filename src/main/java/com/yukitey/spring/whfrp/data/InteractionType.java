package com.yukitey.spring.whfrp.data;

import org.springframework.lang.NonNull;

public enum InteractionType {
    PLAYER("player"), NPC("npc");

    private final String type;

    InteractionType(@NonNull final String type) {
        this.type = type;
    }

    @NonNull
    public String getType() {
        return type;
    }
}
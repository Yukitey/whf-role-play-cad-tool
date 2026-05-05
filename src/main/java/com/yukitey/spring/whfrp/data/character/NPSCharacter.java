package com.yukitey.spring.whfrp.data.character;

import com.yukitey.spring.whfrp.data.InteractionType;
import com.yukitey.spring.whfrp.data.classes.careers.Career;
import com.yukitey.spring.whfrp.data.species.Species;
import org.springframework.lang.NonNull;

/**
 * @author Andrey Sadovinskiy
 */
public class NPSCharacter extends Character {

    public NPSCharacter(@NonNull final String name, @NonNull final Species species, @NonNull final Career career) {
        super(name, species, career);
    }

    @NonNull
    @Override
    public InteractionType getInteractionType() {
        return InteractionType.NPC;
    }
}
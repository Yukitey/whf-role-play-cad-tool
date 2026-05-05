package com.yukitey.spring.whfrp.data.character;

import com.yukitey.spring.whfrp.data.InteractionType;
import com.yukitey.spring.whfrp.data.classes.careers.Career;
import com.yukitey.spring.whfrp.data.species.Species;
import org.springframework.lang.NonNull;

/**
 * @author Andrey Sadovinskiy
 */
public class PlayerCharacter extends Character {

    private final Fate fate;
    private final Resilience resilience;
    private final Experience experience;

    public PlayerCharacter(@NonNull final String name, @NonNull final Species species, @NonNull final Career career) {
        super(name, species, career);

        this.fate = new Fate(0) {
            @Override
            protected int getModifier() {
                return 0;
            }
        };
        this.resilience = new Resilience(0, "");
        this.experience = new Experience(0);
    }

    @Override
    public final InteractionType getInteractionType() {
        return InteractionType.PLAYER;
    }

    @NonNull
    public Fate getFate() {
        return fate;
    }

    @NonNull
    public Resilience getResilience() {
        return resilience;
    }

    @NonNull
    public Experience getExperience() {
        return experience;
    }
}
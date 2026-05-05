package com.yukitey.spring.whfrp.data;

import org.springframework.lang.NonNull;

/**
 * Interface for any game entity.
 *
 * @author Andrey Sadovinskiy
 */
public interface IGameEntity extends UniqueNamed {
    @NonNull
    InteractionType getInteractionType();

    default int performTest(AbstractValue value, TestDifficulty difficulty) {
        return (value.getCurrent() + difficulty.getModifier() - Dice.D100.roll()) / 10;
    }
}

package com.yukitey.spring.whfrp.data.characteristics;

import com.yukitey.spring.whfrp.data.AbstractValue;
import org.springframework.lang.NonNull;

public class CharacteristicValue extends AbstractValue {
    private final Characteristic characteristic;

    public CharacteristicValue(@NonNull final Characteristic characteristic, final int initial) {
        super(initial);
        this.characteristic = characteristic;

    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public int getBonus() {
        return (int) Math.floor(getCurrent() / 10);
    }

    @Override
    public String toString() {
        return getCharacteristic().getId() + ":" + getCurrent();
    }
}
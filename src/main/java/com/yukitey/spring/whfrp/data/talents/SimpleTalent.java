package com.yukitey.spring.whfrp.data.talents;

import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import org.springframework.lang.NonNull;

import java.util.Map;

public abstract class SimpleTalent implements Talent {

    @NonNull
    private final String id;

    private int level;

    public SimpleTalent(@NonNull final String id, @NonNull final Map<Characteristic, CharacteristicValue> characteristics) {
        this.id = id;
    }

    @NonNull
    @Override
    public String getId() {
        return id;
    }

    public Talent levelUp(@NonNull final Map<Characteristic, CharacteristicValue> characteristics){
        if (level < getMax(characteristics)){
            level++;
        }
        return this;
    }
}
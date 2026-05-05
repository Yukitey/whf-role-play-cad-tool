package com.yukitey.spring.whfrp.data.talents;


import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Map;

/**
 * Petty Magic
 * <p>
 * Просешая магия
 *
 * @author Andrey Sadovinskiy
 */
public class PettyMagicTalent extends MagicTalent{

    public PettyMagicTalent(@NonNull final String id,
                            @NonNull final Map<Characteristic, CharacteristicValue> characteristics) {
        super(
                id,
                characteristics,
                characteristics.get(Characteristic.WP).getBonus(),
                Characteristic.WP
        );
    }

    @Override
    public int getMax(Map<Characteristic, CharacteristicValue> characteristics) {
        return 1;
    }

    @Override
    public String getDescription(@Nullable Map<Characteristic, CharacteristicValue> characteristics) {
        return """
                You have the spark to cast magic within you and have mastered
                techniques to control it at a basic level. When you take this
                Talent, you manifest, and permanently memorise, a number of
                spells equal to your Willpower Bonus. You can learn extra Petty
                spells for the following cost in XP.""";
    }

    @Override
    protected int getSpellXpCost() {
        return 50;
    }
}
package com.yukitey.spring.whfrp.data.talents;

import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Map;

/**
 * Arcane Magic (Lore)
 * <p>
 * Школа магии (любая стихийная школа)
 *
 * @author Andrey Sadovinskiy
 */
public class ArcaneMagicTalent extends MagicTalent{


    public ArcaneMagicTalent(@NonNull final String id, @NonNull final Map<Characteristic, CharacteristicValue> characteristics) {
        super(
                id,
                characteristics,
                0,
                Characteristic.Int
        );
    }

    @Override
    protected int getSpellXpCost() {
        return 100;
    }

    @Override
    public int getMax(Map<Characteristic, CharacteristicValue> characteristics) {
        return 1;
    }

    @Override
    public String getDescription(@Nullable Map<Characteristic, CharacteristicValue> characteristics) {
        return "";
    }
}

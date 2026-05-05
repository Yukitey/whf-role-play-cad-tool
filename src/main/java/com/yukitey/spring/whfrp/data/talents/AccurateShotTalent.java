package com.yukitey.spring.whfrp.data.talents;

import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Map;

/**
 * Accurate Shot
 * <p>
 * Точный выстрел
 *
 * @author Andrey Sadovinskiy
 */
public class AccurateShotTalent extends SimpleTalent {

    public AccurateShotTalent(@NonNull final String id, @NonNull final Map<Characteristic, CharacteristicValue> characteristics) {
        super(id, characteristics);
    }

    @Override
    public int getMax(@NonNull final Map<Characteristic, CharacteristicValue> characteristics) {
        return characteristics.get(Characteristic.BS).getBonus();
    }

    @NonNull
    @Override
    public String getDescription(@Nullable final Map<Characteristic, CharacteristicValue> characteristics) {
        return """
                You are an exceptional shot and know where to shoot an enemy
                in order to inflict maximum damage. You deal your Accurate
                Shot level in extra Damage with all ranged weapons.""";
    }
}
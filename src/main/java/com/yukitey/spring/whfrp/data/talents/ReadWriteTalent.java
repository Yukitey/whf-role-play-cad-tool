package com.yukitey.spring.whfrp.data.talents;

import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Map;

/**
 * Read / Write
 * <p>
 * Грамотность
 *
 * @author Andrey Sadovinskiy
 */
public class ReadWriteTalent extends SimpleTalent {

    public ReadWriteTalent(@NonNull final String id, @NonNull final Map<Characteristic, CharacteristicValue> characteristics) {
        super(id, characteristics);
    }

    @Override
    public int getMax(@NonNull final Map<Characteristic, CharacteristicValue> characteristics) {
        return 1;
    }

    @Override
    public String getDescription(@Nullable final Map<Characteristic, CharacteristicValue> characteristics) {
        return """
                  You are one of the rare literate individuals in the Old World. You
                  are assumed to be able to read and write (if appropriate) all of the
                  Languages you can speak.""";
    }
}
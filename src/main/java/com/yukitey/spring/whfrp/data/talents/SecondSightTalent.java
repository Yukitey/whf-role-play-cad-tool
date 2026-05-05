package com.yukitey.spring.whfrp.data.talents;

import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import com.yukitey.spring.whfrp.data.skills.Skill;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.List;
import java.util.Map;

/**
 * Second Sight
 * <p>
 * Второе зрение
 *
 * @author Andrey Sadovinskiy
 */
public class SecondSightTalent extends TestedTalent {

    public SecondSightTalent(@NonNull final String id, @NonNull final Map<Characteristic, CharacteristicValue> characteristics) {
        super(id, characteristics);
    }

    @NonNull
    @Override
    public int getMax(@NonNull final Map<Characteristic, CharacteristicValue> characteristics) {
        return characteristics.get(Characteristic.I)
                .getBonus();
    }

    @NonNull
    @Override
    public String getDescription(@Nullable final Map<Characteristic, CharacteristicValue> characteristics) {
        return """
                You can perceive the shifting Winds of Magic that course from
                the Chaos Gates at the poles of the world. You now have the
                Sight (see page 233).""";
    }

    @Override
    public List<Skill> getTests() {
        return null;
    }
}
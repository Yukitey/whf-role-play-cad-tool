package com.yukitey.spring.whfrp.data.talents;

import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import com.yukitey.spring.whfrp.data.skills.AdvancedSkill;
import com.yukitey.spring.whfrp.data.skills.Skill;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Aethyric Attunement
 * <p>
 * Концентранция
 *
 * @author Andrey Sadovinskiy
 */
public class AethyricAttunementTalent extends TestedTalent {

    public AethyricAttunementTalent(@NonNull final String id, @NonNull final Map<Characteristic, CharacteristicValue> characteristics) {
        super(id, characteristics);
    }

    @Override
    public int getMax(@NonNull final Map<Characteristic, CharacteristicValue> characteristics) {
        return characteristics.get(Characteristic.I).getBonus();
    }

    @Override
    public List<Skill> getTests() {
        return Collections.singletonList(AdvancedSkill.Channelling);
    }

    @Override
    public String getDescription(@Nullable final Map<Characteristic, CharacteristicValue> characteristics) {
        return """
                Your experience, talent or training lets you more safely manipulate
                the Winds of Magic. You do not suffer a Miscast if you roll a
                double on a successful Channel Test.""";
    }
}
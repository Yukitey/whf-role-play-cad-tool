package com.yukitey.spring.whfrp.data.talents;

import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import com.yukitey.spring.whfrp.data.skills.BasicSkill;
import com.yukitey.spring.whfrp.data.skills.Skill;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.List;
import java.util.Map;

/**
 * Sixth Sense
 * <p>
 * Шестое чувство
 *
 * @author Andrey Sadovinskiy
 */
public class SixthSenseTalent extends TestedTalent {

    public SixthSenseTalent(@NonNull final String id, @NonNull final Map<Characteristic, CharacteristicValue> characteristics) {
        super(id, characteristics);
    }

    @Override
    public int getMax(Map<Characteristic, CharacteristicValue> characteristics) {
        return characteristics.get(Characteristic.I).getBonus();
    }

    @Override
    public String getDescription(@Nullable Map<Characteristic, CharacteristicValue> characteristics) {
        return """
                You get a strange feeling when you are threatened, and can react
                accordingly. The GM may warn you if you are walking into
                danger; this will normally come after a secret Intuition Test
                on your behalf. Further, you may ignore Surprise if you pass an
                Intuition Test.""";
    }

    @Override
    public List<Skill> getTests() {
        return List.of(
                BasicSkill.Intuition
        );
    }
}

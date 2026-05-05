package com.yukitey.spring.whfrp.data.talents;

import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import com.yukitey.spring.whfrp.data.skills.AdvancedSkill;
import com.yukitey.spring.whfrp.data.skills.BasicSkill;
import com.yukitey.spring.whfrp.data.skills.Skill;
import com.yukitey.spring.whfrp.data.skills.specializations.MeleeSpecialization;
import jakarta.annotation.Nullable;

import java.util.List;
import java.util.Map;

/**
 * Fast Hands
 * <p>
 * Быстрые руки
 *
 * @author Andrey Sadovinskiy
 */
public class FastHandsTalent extends TestedTalent {

    public FastHandsTalent(String id, Map<Characteristic, CharacteristicValue> characteristics) {
        super(id, characteristics);
    }

    @Override
    public int getMax(Map<Characteristic, CharacteristicValue> characteristics) {
        return characteristics.get(Characteristic.Dex).getBonus();
    }

    @Override
    public String getDescription(@Nullable Map<Characteristic, CharacteristicValue> characteristics) {
        return """
                You can move your hands with surprising dexterity. Bystanders
                get no passive Perception Tests to spot your use of the Sleight of
                Hand Skill, instead they only get to Oppose your Sleight of Hand
                Tests if they actively suspect and are looking for your movements.
                Further, attempts to use Melee (Brawling) to simply touch an
                opponent gain a bonus of +10 × your level in Fast Hands.""";
    }

    @Override
    public List<Skill> getTests() {
        return List.of(
                AdvancedSkill.HandSleight,
                BasicSkill.Melee.selectingSpecialization(MeleeSpecialization.Brawling)
        );
    }
}

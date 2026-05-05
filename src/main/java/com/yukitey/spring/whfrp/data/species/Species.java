package com.yukitey.spring.whfrp.data.species;

import com.yukitey.spring.whfrp.data.UniqueNamed;
import com.yukitey.spring.whfrp.data.classes.careers.Career;
import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import com.yukitey.spring.whfrp.data.skills.Skill;
import com.yukitey.spring.whfrp.data.talents.Talent;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Map;

public interface Species extends UniqueNamed {

    @NonNull
    List<Career> getAvailableCareers();

    @NonNull
    List<Skill> getAvailableElevationSkills() ;

    @NonNull
    List<Talent> getAvailableTalents();

    int getBaseModifierByCharacteristic (@NonNull final Characteristic characteristic);

    int getBaseWounds( final Map<Characteristic, CharacteristicValue> characteristics);

    int getBaseFate();

    int getBaseResilience();

    int getExtraPoints();

    int getBaseMovement();
}
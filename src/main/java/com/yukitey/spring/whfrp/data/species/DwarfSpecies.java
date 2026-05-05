package com.yukitey.spring.whfrp.data.species;

import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import com.yukitey.spring.whfrp.data.classes.careers.Career;
import com.yukitey.spring.whfrp.data.skills.Skill;
import com.yukitey.spring.whfrp.data.talents.Talent;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class DwarfSpecies implements Species {

    protected final static DwarfSpecies FACTORY = new DwarfSpecies();

    @Override
    public List<Career> getAvailableCareers() {
        return Collections.emptyList();
    }

    @Override
    public List<Skill> getAvailableElevationSkills() {
        return Collections.emptyList();
    }

    @Override
    public List<Talent> getAvailableTalents() {
        return Collections.emptyList();
    }

    @Override
    public int getBaseModifierByCharacteristic(Characteristic characteristic) {
        return 0;
    }

    @Override
    public int getBaseWounds(Map<Characteristic, CharacteristicValue> characteristics) {
        return 0;
    }

    @Override
    public int getBaseFate() {
        return 0;
    }

    @Override
    public int getBaseResilience() {
        return 0;
    }

    @Override
    public int getExtraPoints() {
        return 0;
    }

    @Override
    public int getBaseMovement() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getId() {
        return "";
    }
}

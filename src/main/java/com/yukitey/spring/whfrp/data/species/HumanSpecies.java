package com.yukitey.spring.whfrp.data.species;

import com.yukitey.spring.whfrp.data.classes.careers.Career;
import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import com.yukitey.spring.whfrp.data.skills.Skill;
import com.yukitey.spring.whfrp.data.talents.Talent;

import java.util.*;

public class HumanSpecies implements Species {

    protected final static HumanSpecies FACTORY = new HumanSpecies();

    private final static String id = "species.human";

    private final static Map<Characteristic, Integer> characteristicBaseModifiers = new HashMap<>();

    private HumanSpecies() {

        for (Characteristic characteristic : Characteristic.values()) {
            characteristicBaseModifiers.put(characteristic, 20);
        }

    }

    @Override
    public String getId() {
        return "species.human";
    }

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
        return characteristics.get(Characteristic.S).getBonus() + 2 * characteristics.get(Characteristic.T).getBonus() + characteristics.get(Characteristic.WS).getBonus();
    }

    @Override
    public int getBaseFate() {
        return 2;
    }

    @Override
    public int getBaseResilience() {
        return 1;
    }

    @Override
    public int getExtraPoints() {
        return 3;
    }

    @Override
    public int getBaseMovement() {
        return 4;
    }

    @Override
    public String getName() {
        return "";
    }
}
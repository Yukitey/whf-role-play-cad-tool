package com.yukitey.spring.whfrp.data.character;

import com.yukitey.spring.whfrp.data.IGameEntity;
import com.yukitey.spring.whfrp.data.classes.CharacterClass;
import com.yukitey.spring.whfrp.data.classes.careers.Career;
import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import com.yukitey.spring.whfrp.data.skills.BasicSkill;
import com.yukitey.spring.whfrp.data.skills.Skill;
import com.yukitey.spring.whfrp.data.skills.SkillValue;
import com.yukitey.spring.whfrp.data.species.Species;
import com.yukitey.spring.whfrp.data.spells.Spell;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Andrey Sadovinskiy
 */
public abstract class Character implements IGameEntity {

    private final String name;

    private final Species species;

    private CharacterClass characterClass;

    private List<Career> careerPath;

    private final Map<Characteristic, CharacteristicValue> characteristics;

    private final Map<Skill, SkillValue> skills;

    private String id;

    public Character(@NonNull final String name, @NonNull final Species species, @NonNull final Career career) {
        this.name = name;
        this.species = species;
        this.careerPath = Collections.singletonList(career);
        this.characteristics = new HashMap<>(10);
        Arrays.stream(Characteristic.values())
                .forEach(characteristic -> characteristics.put(
                        characteristic,
                        new CharacteristicValue(characteristic, species.getBaseModifierByCharacteristic(characteristic))
                ));

        this.skills = new HashMap<>();
        Arrays.stream(BasicSkill.values())
                .forEach(skill -> skills.put(
                        skill,
                        new SkillValue(skill, getCurrentCharacteristicValue(skill.getCharacteristic()))
                ));
        this.species.getAvailableElevationSkills()
                .forEach(skill -> skills.put(
                        skill,
                        new SkillValue(skill, getCurrentCharacteristicValue(skill.getCharacteristic()))
                ));

        getCurrentCareer().getAvailableElevationSkills()
                .forEach(skill -> skills.put(
                        skill,
                        new SkillValue(skill, getCurrentCharacteristicValue(skill.getCharacteristic()))
                ));
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    public Career getCurrentCareer() {
        return careerPath.get(careerPath.size() - 1);
    }

    public int getCurrentCharacteristicValue(@NonNull final Characteristic characteristic) {
        return characteristics.get(characteristic).getCurrent();
    }

    public SkillValue getSkillValue(@NonNull final Skill skill) {
        return skills.get(skill);
    }

    @Override
    public String toString() {
        return species.getName() + " " + name + " ["+ characteristics.values().stream().map(Object::toString).collect(Collectors.joining(", ")) +"]";
    }
}
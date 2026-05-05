package com.yukitey.spring.whfrp.data.skills;

import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.skills.specializations.SkillSpecialization;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Collections;
import java.util.Optional;

public class SpecializationSkill<SS extends SkillSpecialization<? extends Enum<?>>> implements Skill {

    @NonNull
    private final Skill skill;

    @NonNull
    private final SS specialization;

    private final SpecializationType specializationType;
    public SpecializationSkill(@NonNull final Skill skill,
                               @NonNull final SS specialization,
                               @Nullable final SpecializationType specializationType) {
        this.skill = skill;
        this.specialization = specialization;
        this.specializationType = specializationType;
    }

    @NonNull
    @Override
    public String getId() {
        return String.join(".", skill.getId(), specialization.getId());
    }

    @NonNull
    @Override
    public Characteristic getCharacteristic() {
        return skill.getCharacteristic();
    }

    @Override
    public boolean isSpecialize() {
        return true;
    }

    @Override
    public Optional<SkillSpecialization<?>[]> specialize() {
        return Optional.of((SkillSpecialization<?>[]) Collections.singleton(specialization).toArray());
    }

    @NonNull
    public SkillSpecialization<?> getSpecialization() {
        return specialization;
    }

    @Override
    public String getName() {
        return String.format("%s (%s)", skill, specialization.getId().replace(".", " "));
    }
}
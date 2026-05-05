package com.yukitey.spring.whfrp.data.skills;

import com.yukitey.spring.whfrp.data.Identifiable;
import com.yukitey.spring.whfrp.data.UniqueNamed;
import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.skills.specializations.SkillSpecialization;
import org.springframework.lang.NonNull;

import java.util.Arrays;
import java.util.Optional;

/**
 * Interface for skill.
 *
 * @author Andrey Sadovinskiy
 */
public interface Skill extends UniqueNamed {

    @NonNull
    Characteristic getCharacteristic();

    boolean isSpecialize();

    @NonNull
    Optional<SkillSpecialization<?>[]> specialize();

    @NonNull
    default SpecializationSkill<?> selectingSpecialization(SkillSpecialization<?> skillSpecialization) {

        return specialize().map(
                specialize -> Arrays.stream(specialize)
                        .filter(ss -> ss.equals(skillSpecialization))
                        .map(ss -> ss.specialize(this))
                        .findFirst()
                        .orElseThrow()
        ).orElseThrow();
    }
}
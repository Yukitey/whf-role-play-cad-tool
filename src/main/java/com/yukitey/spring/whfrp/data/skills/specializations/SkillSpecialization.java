package com.yukitey.spring.whfrp.data.skills.specializations;

import com.yukitey.spring.whfrp.data.Identifiable;
import com.yukitey.spring.whfrp.data.skills.Skill;
import com.yukitey.spring.whfrp.data.skills.SpecializationSkill;
import com.yukitey.spring.whfrp.data.skills.SpecializationType;

/**
 * Simple interface for skill specialization.
 *
 * @author Andrey Sadovinskiy
 */
public interface SkillSpecialization<SS extends SkillSpecialization<? extends Enum<?>>> extends Identifiable {

    default SpecializationSkill<SS> specialize(Skill skill) {

        return new SpecializationSkill<>(skill, (SS) this, getSpecializeType());
    }

    SpecializationType getSpecializeType();
}
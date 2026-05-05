package com.yukitey.spring.whfrp.data.skills;

import com.yukitey.spring.whfrp.data.AbstractValue;
import org.springframework.lang.NonNull;

public class SkillValue extends AbstractValue {
    private final Skill skill;

    public SkillValue(@NonNull final Skill skill, final int initial) {
        super(initial);
        this.skill = skill;
    }

    public Skill getSkill() {
        return skill;
    }
}

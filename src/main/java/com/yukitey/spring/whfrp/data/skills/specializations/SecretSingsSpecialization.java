package com.yukitey.spring.whfrp.data.skills.specializations;

import com.yukitey.spring.whfrp.data.skills.SpecializationType;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public enum SecretSingsSpecialization implements SkillSpecialization<SecretSingsSpecialization> {

    // Серый орден
    GreyOrder("grey.order"),

    // Гильдия
    Guild("guild"),

    // Охотники
    Ranger("ranger"),

    // Разведчики
    Scout("scout"),

    // Воры
    Thief("thief"),

    // Бродяги
    Vagabond("vagabond");

    @NonNull
    private final String id;

    @Nullable
    public final SpecializationType type;

    SecretSingsSpecialization(@NonNull final String id) {
        this(id, null);
    }

    SecretSingsSpecialization(@NonNull String id, SpecializationType type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String getId() {
        return id;
    }

    @Nullable
    @Override
    public SpecializationType getSpecializeType() {
        return type;
    }
}
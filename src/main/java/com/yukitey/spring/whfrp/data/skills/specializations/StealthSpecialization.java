package com.yukitey.spring.whfrp.data.skills.specializations;

import com.yukitey.spring.whfrp.data.skills.SpecializationType;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public enum StealthSpecialization implements SkillSpecialization<StealthSpecialization> {

    // Дикая природа
    Rural("rural"),

    // Подземелье
    Underground("underground"),

    // Города
    Urban("urban");

    @NonNull
    private final String id;

    @Nullable
    public final SpecializationType type;

    StealthSpecialization(@NonNull final String id) {
        this(id, null);
    }

    StealthSpecialization(@NonNull final String id, @Nullable final SpecializationType type) {
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
package com.yukitey.spring.whfrp.data.skills.specializations;

import com.yukitey.spring.whfrp.data.skills.SpecializationType;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public enum EntertainSpecialization implements SkillSpecialization<EntertainSpecialization> {

    // Актерство
    Acting("acting"),

    // Комедия
    Comedy("comedy"),

    // Пение
    Singing("singing"),

    // Сказительство
    Storytelling("storytelling");

    @NonNull
    private final String id;

    @Nullable
    public final SpecializationType type;

    EntertainSpecialization(@NonNull final String id) {
        this(id, null);
    }

    EntertainSpecialization(@NonNull final String id, @Nullable final SpecializationType type) {
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
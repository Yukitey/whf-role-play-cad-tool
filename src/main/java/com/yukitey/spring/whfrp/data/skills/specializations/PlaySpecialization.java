package com.yukitey.spring.whfrp.data.skills.specializations;

import com.yukitey.spring.whfrp.data.skills.SpecializationType;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public enum PlaySpecialization implements SkillSpecialization<PlaySpecialization>{

    // Волынка
    Bagpipe("bagpipe"),

    // Лютня
    Lute("lute"),

    // Клавесин
    Harpsichord("harpsichord"),

    // Рожок
    Horn("horn"),

    // Скрипка
    Violin("violin");

    @NonNull
    private final String id;

    @Nullable
    public final SpecializationType type;

    PlaySpecialization(@NonNull final String id) {
        this(id, null);
    }

    PlaySpecialization(@NonNull final String id, @Nullable final SpecializationType type) {
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
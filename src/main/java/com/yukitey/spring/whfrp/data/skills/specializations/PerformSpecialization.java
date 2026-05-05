package com.yukitey.spring.whfrp.data.skills.specializations;

import com.yukitey.spring.whfrp.data.skills.SpecializationType;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public enum PerformSpecialization implements SkillSpecialization<PerformSpecialization>{

    // Акробатика
    Acrobatics("acrobatics"),

    // Клоунада
    Clowning("clowning"),

    // Танец
    Dancing("dancing"),

    // Глотание огня
    Firebreathing("firebreathing"),

    // Жонглирование
    Juggling("juggling"),

    // Пантомима
    Miming("miming"),

    // Хождение по канату
    RopeWalking("rope.walking");

    @NonNull
    private final String id;

    @Nullable
    public final SpecializationType type;

    PerformSpecialization(@NonNull final String id) {
        this(id, null);
    }

    PerformSpecialization(@NonNull final String id, @Nullable final SpecializationType type) {
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
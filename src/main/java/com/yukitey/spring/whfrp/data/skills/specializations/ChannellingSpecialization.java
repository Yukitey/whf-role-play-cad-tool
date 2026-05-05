package com.yukitey.spring.whfrp.data.skills.specializations;

import com.yukitey.spring.whfrp.data.skills.SpecializationType;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public enum ChannellingSpecialization implements SkillSpecialization<ChannellingSpecialization>{

    // Акши
    Aqshy("aqshy"),

    // Азир
    Azyr("azyr"),

    /// Шамон
    Chamon("chamon"),

    // Дхар
    Dhar("dhar"),

    // Гарр
    Ghur("ghur"),

    // Гайран
    Ghyran("ghyran"),

    // Хиш
    Hysh("hysh"),

    // Шаиш
    Shyish("shyish"),

    // Улгу
    Ulgy("ulgy");

    @NonNull
    private final String id;

    @Nullable
    public final SpecializationType type;

    ChannellingSpecialization(@NonNull final String id) {
        this(id, null);
    }

    ChannellingSpecialization(@NonNull final String id, @Nullable final SpecializationType type) {
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
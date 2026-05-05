package com.yukitey.spring.whfrp.data.skills.specializations;

import com.yukitey.spring.whfrp.data.skills.SpecializationType;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public enum ArtSpecialization implements SkillSpecialization<ArtSpecialization> {

    // Картография
    Cartography("cartography"),

    // Гравюра
    Engraving("engraving"),

    // Мозаика
    Mosaics("mosaics"),

    // Живопись
    Painting("painting"),

    // Скульптура
    Sculpture("sculpture"),

    // Татуировка
    Tattoo("tattoo"),

    // Ткачество
    Weaving("weaving");

    @NonNull
    private final String id;

    @Nullable
    public final SpecializationType type;

    ArtSpecialization(@NonNull final String id) {
        this(id, null);
    }

    ArtSpecialization(@NonNull final String id, @Nullable SpecializationType type) {
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
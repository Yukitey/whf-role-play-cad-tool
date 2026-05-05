package com.yukitey.spring.whfrp.data.skills.specializations;

import com.yukitey.spring.whfrp.data.skills.SpecializationType;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public enum RangedSpecialization implements SkillSpecialization<RangedSpecialization>{

    // Пороховое
    Blackpowder("blackpowder"),

    // Луки
    Bow("bow"),

    // Арбалеты
    Crossbow("crossbow"),

    // Инженерное
    Engineering("engineering"),

    // Ловчее
    Entangling("entangling"),

    // Взрывчатка
    Explosives("explosives"),

    // Праща
    Sling("sling"),

    // Метательное
    Throwing("throwing");

    @NonNull
    private final String id;

    @Nullable
    public final SpecializationType type;

    RangedSpecialization(@NonNull final String id) {
        this(id, null);
    }

    RangedSpecialization(@NonNull final String id, @Nullable final SpecializationType type) {
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
package com.yukitey.spring.whfrp.data.skills.specializations;

import com.yukitey.spring.whfrp.data.skills.SpecializationType;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public enum RideSpecialization implements SkillSpecialization<RideSpecialization> {

    /**
     * Demigryph
     * <p>
     * Демигрифы
     */
    Demigryph("demigryph"),

    /**
     * Great Wolf
     * <p>
     * Гигантские волки
     */
    GreatWolf("great.wolf"),

    /**
     * Griffon
     * <p>
     * Грифоны
     */
    Griffon("griffon"),

    /**
     * Horse
     * <p>
     * Лошади
     */
    Horse("horse"),

    /**
     * Pegasus
     * <p>
     * Пегасы
     */
    Pegasus("pegasus");

    @NonNull
    private final String id;

    @Nullable
    public final SpecializationType type;

    RideSpecialization(@NonNull final String id) {
        this(id,null);
    }

    RideSpecialization(@NonNull final String id, @Nullable final SpecializationType type) {
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
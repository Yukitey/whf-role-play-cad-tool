package com.yukitey.spring.whfrp.data.skills.specializations;

import com.yukitey.spring.whfrp.data.skills.SpecializationType;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public enum MeleeSpecialization implements SkillSpecialization<MeleeSpecialization> {

    /**
     * Основное
     */
    Basic("basic"),

    /**
     * Кулачное
     */
    Brawling("brawling"),

    /**
     * Кавалерийское
     */
    Cavalry("cavalry"),

    /**
     * Фехтовальное
     */
    Fencing("fencing"),

    /**
     * Цепы
     */
    Flail("flail"),

    /**
     * Парирующее
     */
    Parry("parry"),

    /**
     * Древковое
     */
    PoleArm("pole.arm"),

    /**
     * Двуручное
     */
    TwoHanded("two.handed");

    @NonNull
    private final String id;

    @Nullable
    public final SpecializationType type;

    MeleeSpecialization(@NonNull final String id) {
        this(id, null);
    }

    MeleeSpecialization(@NonNull final String id, @Nullable final SpecializationType type) {
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
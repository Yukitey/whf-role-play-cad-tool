package com.yukitey.spring.whfrp.data.skills.specializations;

import com.yukitey.spring.whfrp.data.skills.SpecializationType;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public enum LoreSpecialization implements SkillSpecialization<LoreSpecialization> {

    /**
     * Engineering
     * <p>
     * Инженерное дело
     */
    Engineering("engineering"),

    /**
     * Geology
     * <p>
     * Геология
     */
    Geology("geology"),

    /**
     * Heraldry
     * <p>
     * Геральдика
     */
    Heraldry("heraldry"),

    /**
     * History
     * <p>
     * История
     */
    History("history"),

    /**
     * Law
     * <p>
     * Закон
     */
    Law("law"),

    /**
     * Magick
     * <p>
     * Магия
     */
    Magick("magick"),

    /**
     * Metallurgy
     * <p>
     * Металлургия
     */
    Metallurgy("metallurgy"),

    /**
     * Military science
     * <p>
     * Военное дело
     */
    MilitaryScience("military.science"),

    /**
     * Science
     * <p>
     * Наука
     */
    Science("science"),

    /**
     * Theology
     * <p>
     * Теология
     */
    Theology("theology");

    @NonNull
    private final String id;

    @Nullable
    public final SpecializationType type;

    LoreSpecialization(@NonNull final String id) {
        this(id, null);
    }

    LoreSpecialization(@NonNull final String id, @Nullable final SpecializationType type) {
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
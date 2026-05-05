package com.yukitey.spring.whfrp.data.skills.specializations;

import com.yukitey.spring.whfrp.data.skills.SpecializationType;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public enum LanguageSpecialization implements SkillSpecialization<LanguageSpecialization> {
    /**
     * Mundane
     * <p>
     * Мутланский
     */
    Mundane("mundane"),

    /**
     * Battle Tongue
     * <p>
     * Боевой арго
     */
    BattleTongue("battle.tongue"),

    /**
     * Bretonnian
     * <p>
     * Бретонский
     */
    Bretonnian("Bretonnian"),

    /**
     * Classical
     * <p>
     * Классический
     */
    Classical("classical"),

    /**
     * Guilder
     * <p>
     * Гильдейский арго
     */
    Guilder("guilder"),

    /**
     * Khazalid
     * <p>
     * Khazalid
     */
    Khazalid("khazalid"),

    /**
     * Magick
     * <p>
     * Магический
     */
    Magick("magick"),

    /**
     * Thief
     * <p>
     * Воровской арго
     */
    Thief("thief"),

    /**
     * Tilean
     * <p>
     * Тилейский
     */
    Tilean("tilean");

    @NonNull
    private final String id;

    @Nullable
    public final SpecializationType type;

    LanguageSpecialization(@NonNull final String id) {
        this(id, null);
    }

    LanguageSpecialization(@NonNull final String id, @Nullable final SpecializationType type) {
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
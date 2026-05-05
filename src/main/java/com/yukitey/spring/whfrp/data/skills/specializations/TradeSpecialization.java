package com.yukitey.spring.whfrp.data.skills.specializations;

import com.yukitey.spring.whfrp.data.skills.SpecializationType;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public enum TradeSpecialization implements SkillSpecialization<TradeSpecialization> {

    // Аптекарь
    Apothecary("apothecary"),

    // Каллиграф
    Calligrapher("calligrapher"),

    // Свечник
    Chandler("chandler"),

    // Плотник
    Carpenter("carpenter"),

    // Повар
    Cook("cook"),

    // Бальзамировщик
    Embalmer("embalmer"),

    // Кузнец
    Smith("smith"),

    // Дубильщик
    Tanner("tanner");

    @NonNull
    private final String id;

    @Nullable
    public final SpecializationType type;

    TradeSpecialization(@NonNull final String id) {
        this(id,null);
    }

    TradeSpecialization(@NonNull final String id, @Nullable final SpecializationType type) {
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
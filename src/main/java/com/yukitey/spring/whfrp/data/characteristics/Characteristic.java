package com.yukitey.spring.whfrp.data.characteristics;

import com.yukitey.spring.whfrp.data.UniqueNamed;
import org.springframework.lang.NonNull;

public enum Characteristic implements UniqueNamed {

    /**
     * Weapon skill
     * <p>
     * Ближний бой
     */
    WS("weapon.skill"),

    /**
     * Ballistic skill
     * <p>
     * Дальний бой
     */
    BS("ballistic.skill"),

    /**
     * Strength
     * <p>
     * Сила
     */
    S("strength"),

    /**
     * Toughness
     * <p>
     * Выноливость
     */
    T("toughness"),

    /**
     * Initiative
     * <p>
     * Инициатива
     */
    I("initiative"),

    /**
     * Agility
     * <p>
     * Провоство
     */
    Ag("agility"),

    /**
     * Dexterity
     * <p>
     * Ловкость
     */
    Dex("dexterity"),

    /**
     * Intelligence
     * <p>
     * Интелект
     */
    Int("intelligence"),

    /**
     * Will power
     * <p>
     * Сила воли
     */
    WP("will.power"),

    /**
     * Fellowship
     * <p>
     * Харизма
     */
    Fel("fellowship");

    private final String id;

    Characteristic(@NonNull final String id) {
        this.id = id;
    }

    @NonNull
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return String.format("%s (%s)", name(), getId().replace(".", " "));
    }
}

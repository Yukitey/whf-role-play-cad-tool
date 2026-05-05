package com.yukitey.spring.whfrp.data.skills;

import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.skills.specializations.*;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Arrays;
import java.util.Optional;

public enum BasicSkill implements Skill {

    /**
     * Искусство (?)
     */
    Art("art", Characteristic.Dex, ArtSpecialization.class),

    /**
     * Атлетика
     */
    Athletics("athletics", Characteristic.Ag),

    /**
     * Подкуп
     */
    Bribery("bribery", Characteristic.Fel),

    /**
     * Обаяние
     */
    Charm("charm", Characteristic.Fel),

    /**
     * Усмирение животных
     */
    CharmAnimal("charm.animal", Characteristic.WP),

    /**
     * Лазанье
     */
    Climb("climb", Characteristic.S),

    /**
     * Хладнокровие
     */
    Cool("cool", Characteristic.WP),

    /**
     * Кутеж
     */
    ConsumeAlcohol("consume.alcohol", Characteristic.T),

    /**
     * Уклонение
     */
    Dodge("dodge", Characteristic.Ag),

    /**
     * Вождение
     */
    Drive("drive", Characteristic.Ag),

    /**
     * Стойкость
     */
    Endurance("endurance", Characteristic.T),

    /**
     * Артистизм (?)
     */
    Entertain("entertain", Characteristic.Fel, EntertainSpecialization.class),

    /**
     * Азартные игры
     */
    Gamble("gamble", Characteristic.Int),

    /**
     * Сплетничество
     */
    Gossip("gossip", Characteristic.Fel),

    /**
     * Торговля
     */
    Haggle("haggle", Characteristic.Fel),

    /**
     * Запугивание
     */
    Intimidate("intimidate", Characteristic.S),

    /**
     * Интуиция
     */
    Intuition("intuition", Characteristic.I),

    /**
     * Лидерство
     */
    Leadership("leadership", Characteristic.Fel),

    /**
     * Рукопашный бой (основной)
     */
    MeleeBasic("melee.basic", Characteristic.WS),

    /**
     * Рукопашный бой (?)
     */
    Melee("melee", Characteristic.WS, MeleeSpecialization.class),

    /**
     * Ориентирование
     */
    Navigation("navigation", Characteristic.I),

    /**
     * Выживание
     */
    OutdoorSurvival("outdoor.survival", Characteristic.Int),

    /**
     * Наблюдательность
     */
    Perception("perception", Characteristic.I),

    /**
     * Верховая езда (?)
     */
    Ride("ride", Characteristic.Ag, RideSpecialization.class),

    /**
     * Гребля
     */
    Row("row", Characteristic.S),

    /**
     * Скрытность (?)
     */
    Stealth("stealth", Characteristic.Ag, StealthSpecialization.class);

    @NonNull
    private final String id;
    @NonNull
    private final Characteristic characteristic;

    @Nullable
    private final Class<? extends SkillSpecialization<?>> specializationClazz;

    BasicSkill(@NonNull final String id, final @NonNull Characteristic characteristic) {
        this(id, characteristic, null);
    }

    BasicSkill(@NonNull final String id, final @NonNull Characteristic characteristic, @Nullable final Class<? extends SkillSpecialization<?>> specializationClazz) {
        this.id = id;
        this.characteristic = characteristic;
        this.specializationClazz = specializationClazz;
    }

    @NonNull
    @Override
    public String getId() {
        return id;
    }

    @NonNull
    @Override
    public Characteristic getCharacteristic() {
        return characteristic;
    }

    @Override
    public boolean isSpecialize() {
        return specializationClazz != null;
    }

    @NonNull
    public Optional<SkillSpecialization<?>[]> specialize() {
        return specializationClazz != null
                ? Optional.of(specializationClazz.getEnumConstants())
                : Optional.empty();
    }

    @Override
    public String getName() {
        return getId().replace(".", " ");
    }
}

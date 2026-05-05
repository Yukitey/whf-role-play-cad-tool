package com.yukitey.spring.whfrp.data.skills;

import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.skills.specializations.*;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Arrays;
import java.util.Optional;

public enum AdvancedSkill implements Skill {

    /**
     * Обращение с животными
     */
    AnimalCare("animal.care", Characteristic.Int),

    /**
     * Дрессировка
     */
    AnimalTraining("animal.training", Characteristic.Int),

    /**
     * Концентрация (?)
     */
    Channelling("channelling", Characteristic.WS, ChannellingSpecialization.class),

    /**
     * Оценка
     */
    Evaluate("evaluate", Characteristic.Int),

    /**
     * Лечение
     */
    Heal("heal", Characteristic.Int),

    /**
     * Язык (?)
     */
    Language("language", Characteristic.Int, LanguageSpecialization.class),

    /**
     * Знание (?)
     */
    Lore("lore", Characteristic.Int, LoreSpecialization.class),

    /**
     * Сценическое искусство (?)
     */
    Perform("perform", Characteristic.Ag, PerformSpecialization.class),

    /**
     * Взлом
     */
    PickLock("pick.lock", Characteristic.Dex),

    /**
     * Музицирование (?)
     */
    Play("play", Characteristic.Dex, PlaySpecialization.class),

    /**
     * Молитвословие
     */
    Pray("pray", Characteristic.Fel),

    /**
     * Стрельба (?)
     */
    Ranged("ranged", Characteristic.BS, RangedSpecialization.class),

    /**
     * Книжные изыскания
     */
    Research("research", Characteristic.Int),

    /**
     * Хождение под парусом (?)
     */
    Sail("sail", Characteristic.Ag, SailSpecialization.class),

    /**
     * Тайные знаки (?)
     */
    SecretSings("secret.sings", Characteristic.Int, SecretSingsSpecialization.class),

    /**
     * Обращения с ловушками
     */
    SetTrap("set.trap", Characteristic.Dex),

    /**
     * Ловкость рук
     */
    HandSleight("hand.sleight", Characteristic.Dex),

    /**
     * Плаванье
     */
    Swim("swim", Characteristic.S),

    /**
     * Выслеживание
     */
    Track("track", Characteristic.I),

    /**
     * Ремесло (?)
     */
    Trade("trade", Characteristic.Dex, TradeSpecialization.class);

    @NonNull
    private final String id;

    @NonNull
    private final Characteristic characteristic;

    @Nullable
    private final Class<? extends SkillSpecialization<?>> specializationClazz;

    AdvancedSkill(@NonNull final String id, final @NonNull Characteristic characteristic) {
        this(id, characteristic, null);
    }

    AdvancedSkill(@NonNull final String id, final @NonNull Characteristic characteristic, @Nullable final Class<? extends SkillSpecialization<?>> specializationClazz) {
        this.id = id;
        this.characteristic = characteristic;
        this.specializationClazz = specializationClazz;
    }

    @NonNull
    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return getId().replace(".", " ");
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
}
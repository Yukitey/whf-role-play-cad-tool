package com.yukitey.spring.whfrp.data.talents;

import com.yukitey.spring.whfrp.data.character.Experience;
import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public enum TalentEnum implements Talent {
    /**
     * Accurate Shot
     * <p>
     * Точный выстрел
     */
    AccurateShot("accurate.shot", AccurateShotTalent.class),

    /**
     * Aethyric Attunement
     * <p>
     * Концентранция
     */
    AethyricAttunement("aethyric.attunement", AethyricAttunementTalent.class),

    /**
     * Arcane Magic (Lore)
     * <p>
     * Школа магии (любая стихийная школа)
     */
    ArcaneMagic("arcane.magic", ArcaneMagicTalent.class),

    /**
     * Detect Artefact
     * <p>
     * Распознание артефакта
     */
    DetectArtefact("detect.artefact", DetectArtefactTalent.class),

    /**
     * Fast Hands
     * <p>
     * Быстрые руки
     */
    FastHands("fast.hands", FastHandsTalent.class),

    /**
     * Petty Magic
     * <p>
     * Просешая магия
     */
    PettyMagic("petty.magic", PettyMagicTalent.class),

    /**
     * Read / Write
     * <p>
     * Грамотность
     */
    ReadWrite("read.write", ReadWriteTalent.class),

    /**
     * Second Sight
     * <p>
     * Второе зрение
     */
    SecondSight("second.sight", SecondSightTalent.class),

    /**
     * Sixth Sense
     * <p>
     * Шестое чувство
     */
    SixthSense("sixth.sense", SixthSenseTalent.class);

    @NonNull
    private final String id;

    @NonNull
    private final Class<? extends Talent> talent;

    TalentEnum(@NonNull final String id, @NonNull final Class<? extends Talent> talent) {
        this.id = id;
        this.talent = talent;
    }

    @NonNull
    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getMax(@NonNull final Map<Characteristic, CharacteristicValue> characteristics){
        return getCertainTalent(characteristics).getMax(characteristics);
    }

    @NonNull
    @Override
    public String getDescription(@Nullable final Map<Characteristic, CharacteristicValue> characteristics) {
        return getCertainTalent(characteristics).getDescription(characteristics);
    }

    @NonNull
    public Talent pay(@NonNull final Map<Characteristic, CharacteristicValue> characteristics,
                      @NonNull final Experience experience) {
        final  Talent talent = getCertainTalent(characteristics);

        // todo Block exp

        return talent;
    }

    public Talent getCertainTalent(@NonNull final Map<Characteristic, CharacteristicValue> characteristics){
        try {
            return talent.getDeclaredConstructor(this.getId().getClass(), characteristics.getClass())
                    .newInstance(getId(), characteristics);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
package com.yukitey.spring.whfrp.data.talents;

import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import com.yukitey.spring.whfrp.data.skills.Skill;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.List;
import java.util.Map;

/**
 * Detect Artefact
 * <p>
 * Распознание артефакта
 *
 * @author Andrey Sadovinskiy
 */
public class DetectArtefactTalent extends TestedTalent {

    public DetectArtefactTalent(@NonNull final String id, @NonNull final Map<Characteristic, CharacteristicValue> characteristics) {
        super(id, characteristics);
    }

    @Override
    public int getMax(@NonNull final Map<Characteristic, CharacteristicValue> characteristics) {
        return characteristics.get(Characteristic.I).getBonus();
    }

    @Override
    public String getDescription(@Nullable final Map<Characteristic, CharacteristicValue> characteristics) {
        return """
                You are able to sense when magic lies within an artefact. You
                may attempt an Intuition Test for any magical artefact touched.
                If successful, you sense the item is magical; further, each SL also
                provides a specific special rule the item uses, if it has any. Normally,
                you may only attempt this Test once per artefact touched.""";

    }

    @Override
    public List<Skill> getTests() {
        return null;
    }
}
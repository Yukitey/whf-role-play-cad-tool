package com.yukitey.spring.whfrp.data.talents;

import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import com.yukitey.spring.whfrp.data.spells.Spell;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class MagicTalent extends SimpleTalent {

    private final int initialSpellCount;

    private final Characteristic xpCostInfluencingCharacteristic;

    private final List<Spell> knownSpells;

    public MagicTalent(@NonNull final String id,
                       @NonNull final Map<Characteristic, CharacteristicValue> characteristics,
                       final int initialSpellCount,
                       @NonNull final Characteristic xpCostInfluencingCharacteristic) {
        super(id, characteristics);
        this.initialSpellCount = initialSpellCount;
        this.xpCostInfluencingCharacteristic = xpCostInfluencingCharacteristic;
        this.knownSpells = new ArrayList<>();
    }

    protected final int getInitialSpellCount(){
        return initialSpellCount;
    }

    protected abstract int getSpellXpCost();

    public final Characteristic getXpCostInfluencingCharacteristic() {
        return xpCostInfluencingCharacteristic;
    }

    public final List<Spell> getKnownSpells() {
        return knownSpells;
    }

    public final int getNextSpellXpCost(@NonNull final Map<Characteristic, CharacteristicValue> characteristics){
      final int costCoefficient = (int) Math.floor((getKnownSpells().size() + 1) / characteristics.get(getXpCostInfluencingCharacteristic()).getBonus());
      return costCoefficient > initialSpellCount ? costCoefficient * getSpellXpCost() : 0;
    }
}
package com.yukitey.spring.whfrp.data.property.outfitting;

import com.yukitey.spring.whfrp.data.property.Trapping;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;

public abstract class OutfittingTrapping extends Trapping {

    private final List<Advantage> advantages;

    private final List<Disadvantage> disadvantages;


    protected OutfittingTrapping() {
        this(new ArrayList<>(), new ArrayList<>());
    }

    protected OutfittingTrapping(@NonNull final List<Advantage> advantages, @NonNull final List<Disadvantage> disadvantages) {
        this.advantages = advantages;
        this.disadvantages = disadvantages;
    }

    @NonNull
    public List<Advantage> getAdvantages() {
        return advantages;
    }

    @NonNull
    public List<Disadvantage> getDisadvantages() {
        return disadvantages;
    }
}

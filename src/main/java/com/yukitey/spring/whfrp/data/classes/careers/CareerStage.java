package com.yukitey.spring.whfrp.data.classes.careers;

import com.yukitey.spring.whfrp.data.UniqueNamed;
import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.property.Trapping;
import com.yukitey.spring.whfrp.data.skills.Skill;
import com.yukitey.spring.whfrp.data.talents.Talent;
import org.springframework.lang.NonNull;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class CareerStage implements UniqueNamed {

    @NonNull
    private final Estate estate;

    @NonNull
    private final List<Trapping> trappings;

    protected CareerStage(@NonNull final Estate estate, @NonNull final Trapping... trappings) {
        this.estate = estate;
        this.trappings = Arrays.asList(trappings);
    }

    @NonNull
    public Estate getEstate() {
        return estate;
    }

    @NonNull
    public List<Trapping> getProperty() {
        return trappings;
    }

    @NonNull
    public abstract List<Characteristic> getAvailableElevationCharacteristics();

    @NonNull
    public abstract List<Skill> getAvailableElevationSkills();

    @NonNull
    public abstract List<Talent> getAvailableTalents();

    @NonNull
    @Override
    public String toString() {
        return "Career stage " + getName() + " (" + getEstate()  + ") \n \n"
                + "Characteristics: " + getAvailableElevationCharacteristics().stream()
                .map(Characteristic::getName)
                .collect(Collectors.joining(", ")) + ".\n \n"
                + "Skills: " + getAvailableElevationSkills().stream()
                .map(Skill::getName)
                .collect(Collectors.joining(", ")) + ".\n \n"
                + "Talents: " + getAvailableTalents().stream()
                .map(Talent::getName)
                .collect(Collectors.joining(", ")) + ".\n \n";
    }
}

package com.yukitey.spring.whfrp.data.classes.careers;

import com.yukitey.spring.whfrp.data.UniqueNamed;
import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.classes.CharacterClass;
import com.yukitey.spring.whfrp.data.skills.Skill;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public abstract class Career implements UniqueNamed {

    private final CharacterClass characterClass;

    private final List<CareerStage> careerStages;

    private int level;

    public Career(@NonNull final CharacterClass characterClass) {
        this(characterClass, 1);
    }

    public Career(@NonNull final CharacterClass characterClass, final int level) {
        this.characterClass = characterClass;
        this.careerStages = new ArrayList<>(4);
        this.careerStages.add(0, getFirstStage());
        this.careerStages.add(1, getSecondStage());
        this.careerStages.add(2, getThirdStage());
        this.careerStages.add(3, getFourthStage());

        this.level = level;
    }

    @NonNull
    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public List<CareerStage> getCareerStages() {
        return careerStages;
    }

    @NonNull
    public CareerStage getCurrentStage() {
        return careerStages.get(level - 1);
    }

    @NonNull
    public List<Skill> getAvailableElevationSkills() {
        final List<Skill> availableElevationSkills = new ArrayList<>();
        for (int i = 0; i < level; i++) {
            availableElevationSkills.addAll(careerStages.get(i).getAvailableElevationSkills());
        }
        return availableElevationSkills;
    }

    public void levelUp() {
        if (level != 4) {
            level++;
        }
    }

    @Nullable
    public Integer findLevelForCharacteristic(@NonNull final Characteristic characteristic){

        final ListIterator<CareerStage> iterator = getCareerStages().listIterator();
        while (iterator.hasNext()){
            if (iterator.next()
              .getAvailableElevationCharacteristics()
              .contains(characteristic)) {
            return iterator.nextIndex() - 1;
            }
        }

        return null;
    }

    @NonNull
    protected abstract CareerStage getFirstStage();

    @NonNull
    protected abstract CareerStage getSecondStage();

    @NonNull
    protected abstract CareerStage getThirdStage();

    @NonNull
    protected abstract CareerStage getFourthStage();

    @Override
    public String toString() {
        return "Career " + getName() + " (" + getCharacterClass() + ")" + "\n" +
                getCareerStages().stream()
                        .map(CareerStage::toString)
                        .collect(Collectors.joining("\n"));
    }
}
package com.yukitey.spring.whfrp.data.classes.careers.academics;

import com.yukitey.spring.whfrp.data.classes.careers.Career;
import com.yukitey.spring.whfrp.data.classes.careers.CharacterClassCareer;
import org.springframework.lang.NonNull;

import java.lang.reflect.InvocationTargetException;

/**
 * Careers available to academics class.
 * @author Andrey Sadovinskiy
 */
public enum AcademicsCareer implements CharacterClassCareer{

    /**
     * Apothecary
     * <p>
     * Аптекарь
     */
    Apothecary(ApothecaryCareer.PREFIX, ApothecaryCareer.class),

    /**
     * Engineer
     * <p>
     * Инженер
     */
    Engineer(EngineerCareer.PREFIX, EngineerCareer.class),

    /**
     * Lawyer
     * <p>
     * Законник
     */
    Lawyer(LawyerCareer.PREFIX, LawyerCareer.class),

    /**
     * Nun
     * <p>
     * Монах
     */
    Nun(NunCareer.PREFIX, NunCareer.class),

    /**
     * Physician
     * <p>
     * Врач
     */
    Physician(PhysicianCareer.PREFIX, PhysicianCareer.class),

    /**
     * Priest
     * <p>
     * Жрец
     */
    Priest(PriestCareer.PREFIX, PriestCareer.class),

    /**
     * Scholar
     * <p>
     * Ученый
     */
    Scholar(ScholarCareer.PREFIX, ScholarCareer.class),

    /**
     * Wizard
     * <p>
     * Маг
     */
    Wizard(WizardCareer.PREFIX, WizardCareer.class);

    @NonNull
    private final String id;

    @NonNull
    private final Class<? extends Career> career;

    AcademicsCareer(@NonNull final String id, @NonNull final Class<? extends Career> career) {
        this.id = id;
        this.career = career;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Career create() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return  career.getDeclaredConstructor().newInstance();
    }
}
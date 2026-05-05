package com.yukitey.spring.whfrp.data.classes;

import com.yukitey.spring.whfrp.data.UniqueNamed;
import com.yukitey.spring.whfrp.data.classes.careers.CharacterClassCareer;
import com.yukitey.spring.whfrp.data.classes.careers.burghers.BurghersCareer;
import com.yukitey.spring.whfrp.data.classes.careers.courtiers.CourtiersCareer;
import com.yukitey.spring.whfrp.data.classes.careers.peasants.PeasantsCareer;
import com.yukitey.spring.whfrp.data.classes.careers.rangers.RangersCareer;
import com.yukitey.spring.whfrp.data.classes.careers.riverfolk.RiverfolkCareer;
import com.yukitey.spring.whfrp.data.classes.careers.rogues.RoguesCareer;
import com.yukitey.spring.whfrp.data.classes.careers.academics.AcademicsCareer;
import com.yukitey.spring.whfrp.data.classes.careers.warriors.WarriorsCareer;
import org.springframework.lang.NonNull;

import java.util.Arrays;

/**
 * @author Andrey Sadovinskiy
 */
public enum CharacterClass implements UniqueNamed {

    /**
     * Academics
     * <p>
     * Книгочеи
     */
    Academics("academics", AcademicsCareer.class),
    
    /**
     * Burghers
     * <p>
     * Бюргеры
     */
    Burghers("burghers", BurghersCareer.class),

    /**
     * Courtiers
     * <p>
     * Придворные
     */
    Courtiers("courtiers", CourtiersCareer.class),

    /**
     * Peasants
     * <p>
     * Крестьяне
     */
    Peasants("peasants", PeasantsCareer.class),

    /**
     * Rangers
     * <p>
     * Странники
     */
    Rangers("rangers", RangersCareer.class),

    /**
     * Riverfolk
     * <p>
     * Речники
     */
    Riverfolk("riverfolk", RiverfolkCareer.class),

    /**
     * Rogues
     * <p>
     * Шельмы
     */
    Rogues("rogues", RoguesCareer.class),

    /**
     * Warriors
     * <p>
     * Войны
     */
    Warriors("warriors", WarriorsCareer.class);

    private final String id;

    @NonNull
    private final Class<? extends CharacterClassCareer> career;

    CharacterClass(@NonNull final String id, @NonNull final Class<? extends CharacterClassCareer> career) {
        this.id = id;
        this.career = career;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return id;
    }

    @NonNull
    public CharacterClassCareer[] getAvailableCareers() {
        return career.getEnumConstants();
    }

    @NonNull
    public static CharacterClass of(@NonNull final String id){
       return Arrays.stream(CharacterClass.values())
               .filter(cc -> id.equals(cc.getId()))
               .findAny()
               .orElseThrow();
    }
}
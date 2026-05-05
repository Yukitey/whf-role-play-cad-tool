package com.yukitey.spring.whfrp.data.classes.careers.warriors;

import com.yukitey.spring.whfrp.data.classes.careers.Career;
import com.yukitey.spring.whfrp.data.classes.careers.CharacterClassCareer;
import org.springframework.lang.NonNull;

import java.lang.reflect.InvocationTargetException;

/**
 * Careers available to warriors class.
 * @author Andrey Sadovinskiy
 */
public enum WarriorsCareer implements CharacterClassCareer {

    ;

    @NonNull
    private final String id;

    @NonNull
    private final Class<? extends Career> career;

    WarriorsCareer(@NonNull final String id, @NonNull final Class<? extends Career> career) {
        this.id = id;
        this.career = career;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Career create() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return career.getDeclaredConstructor().newInstance();
    }
}
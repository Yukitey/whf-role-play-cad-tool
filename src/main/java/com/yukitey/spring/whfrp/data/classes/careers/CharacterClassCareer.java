package com.yukitey.spring.whfrp.data.classes.careers;

import com.yukitey.spring.whfrp.data.Identifiable;
import com.yukitey.spring.whfrp.data.UniqueNamed;
import com.yukitey.spring.whfrp.data.skills.specializations.SkillSpecialization;

import java.lang.reflect.InvocationTargetException;

public interface CharacterClassCareer extends UniqueNamed {

    @Override
    default String getName(){
        return getId().replace(".", " ");
    }

    Career create() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;
}

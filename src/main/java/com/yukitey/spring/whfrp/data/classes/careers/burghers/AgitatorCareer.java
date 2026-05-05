package com.yukitey.spring.whfrp.data.classes.careers.burghers;

import com.yukitey.spring.whfrp.data.classes.CharacterClass;
import com.yukitey.spring.whfrp.data.classes.careers.Career;
import com.yukitey.spring.whfrp.data.classes.careers.CareerStage;

public class AgitatorCareer extends Career {

    protected static final String PREFIX = "agitator";

    public AgitatorCareer() {
        super(CharacterClass.Burghers);
    }

    @Override
    protected CareerStage getFirstStage() {
        return null;
    }

    @Override
    protected CareerStage getSecondStage() {
        return null;
    }

    @Override
    protected CareerStage getThirdStage() {
        return null;
    }

    @Override
    protected CareerStage getFourthStage() {
        return null;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getId() {
        return "";
    }
}

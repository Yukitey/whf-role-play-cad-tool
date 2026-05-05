package com.yukitey.spring.whfrp.data.classes.careers.academics;

import com.yukitey.spring.whfrp.data.classes.CharacterClass;
import com.yukitey.spring.whfrp.data.classes.careers.Career;
import com.yukitey.spring.whfrp.data.classes.careers.CareerStage;

public class PriestCareer extends Career {

    protected static final String PREFIX = "priest";

    protected PriestCareer() {
        super(CharacterClass.Academics);
    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getName() {
        return PREFIX;
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
}
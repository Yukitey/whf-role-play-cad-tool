package com.yukitey.spring.whfrp.data.classes.careers.burghers;

import com.yukitey.spring.whfrp.data.classes.CharacterClass;
import com.yukitey.spring.whfrp.data.classes.careers.Career;
import com.yukitey.spring.whfrp.data.classes.careers.CareerStage;

public class InvestigatorCareer extends Career {

    protected static final String PREFIX = "investigator";

    public InvestigatorCareer() {
        super(CharacterClass.Burghers);
    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getName() {
        return "";
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
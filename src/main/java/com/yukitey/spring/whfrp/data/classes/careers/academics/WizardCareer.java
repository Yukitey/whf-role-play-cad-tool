package com.yukitey.spring.whfrp.data.classes.careers.academics;

import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.classes.CharacterClass;
import com.yukitey.spring.whfrp.data.classes.careers.Career;
import com.yukitey.spring.whfrp.data.classes.careers.CareerStage;
import com.yukitey.spring.whfrp.data.classes.careers.Estate;
import com.yukitey.spring.whfrp.data.skills.AdvancedSkill;
import com.yukitey.spring.whfrp.data.skills.BasicSkill;
import com.yukitey.spring.whfrp.data.skills.Skill;
import com.yukitey.spring.whfrp.data.skills.specializations.LanguageSpecialization;
import com.yukitey.spring.whfrp.data.skills.specializations.LoreSpecialization;
import com.yukitey.spring.whfrp.data.skills.specializations.MeleeSpecialization;
import com.yukitey.spring.whfrp.data.skills.specializations.RideSpecialization;
import com.yukitey.spring.whfrp.data.talents.ReadWriteTalent;
import com.yukitey.spring.whfrp.data.talents.Talent;
import com.yukitey.spring.whfrp.data.talents.TalentEnum;
import org.springframework.lang.NonNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WizardCareer extends Career {

    protected static final String PREFIX = "wizard";

    protected WizardCareer() {
        super(CharacterClass.Academics);
    }

    @NonNull
    @Override
    public String getId() {
        return "";
    }

    @NonNull
    @Override
    public String getName() {
        return PREFIX;
    }

    @NonNull
    @Override
    protected CareerStage getFirstStage() {
        return new ApprenticeWizard();
    }

    @NonNull
    @Override
    protected CareerStage getSecondStage() {
        return new Wizard();
    }

    @NonNull
    @Override
    protected CareerStage getThirdStage() {
        return new MasterWizard();
    }

    @NonNull
    @Override
    protected CareerStage getFourthStage() {
        return new Archmage();
    }

    private static class ApprenticeWizard extends CareerStage {

        private static final String PREFIX = "apprentice.wizard";

        public ApprenticeWizard() {
            super(Estate.EstateType.Copper.create(3));
        }

        @NonNull
        @Override
        public String getId() {
            return "";
        }

        @NonNull
        @Override
        public String getName() {
            return PREFIX.replace(".", " ");
        }

        @NonNull
        @Override
        public List<Characteristic> getAvailableElevationCharacteristics() {
            return Arrays.asList(
                    Characteristic.WS,
                    Characteristic.Int,
                    Characteristic.WP
            );
        }

        @NonNull
        @Override
        public List<Skill> getAvailableElevationSkills() {
            return Arrays.asList(
                    AdvancedSkill.Lore.selectingSpecialization(LoreSpecialization.Magick),
                    BasicSkill.Intuition,
                    AdvancedSkill.Channelling,
                    BasicSkill.Perception,
                    BasicSkill.Melee.selectingSpecialization(MeleeSpecialization.PoleArm),
                    BasicSkill.Melee.selectingSpecialization(MeleeSpecialization.Basic),
                    BasicSkill.Dodge,
                    AdvancedSkill.Language.selectingSpecialization(LanguageSpecialization.Magick)
            );
        }

        @NonNull
        @Override
        public List<Talent> getAvailableTalents() {
            return Arrays.asList(
                    TalentEnum.AethyricAttunement,
                    TalentEnum.PettyMagic,
                    TalentEnum.ReadWrite,
                    TalentEnum.SecondSight
            );
        }
    }

    private static class Wizard extends CareerStage {

        private static final String PREFIX = "wizard";

        protected Wizard() {
            super(Estate.EstateType.Silver.create(3));
        }

        @NonNull
        @Override
        public String getId() {
            return "";
        }

        @NonNull
        @Override
        public String getName() {
            return PREFIX.replace(".", " ");
        }

        @NonNull
        @Override
        public List<Characteristic> getAvailableElevationCharacteristics() {
            return List.of(
                    Characteristic.Ag
            );
        }

        @NonNull
        @Override
        public List<Skill> getAvailableElevationSkills() {
            return List.of(
                    BasicSkill.Intimidate,
                    BasicSkill.Charm,
                    BasicSkill.Gossip,
                    BasicSkill.Cool,
                    AdvancedSkill.Language.selectingSpecialization(LanguageSpecialization.BattleTongue),
                    AdvancedSkill.Language
            );
        }

        @NonNull
        @Override
        public List<Talent> getAvailableTalents() {
            return List.of(
                    TalentEnum.ArcaneMagic,
                    TalentEnum.DetectArtefact,
                    TalentEnum.FastHands,
                    TalentEnum.SixthSense
            );
        }
    }

    private static class MasterWizard extends CareerStage {

        private static final String PREFIX = "master.wizard";

        protected MasterWizard() {
            super(Estate.EstateType.Golden.create(1));
        }

        @NonNull
        @Override
        public String getId() {
            return "";
        }

        @NonNull
        @Override
        public String getName() {
            return PREFIX.replace(".", " ");
        }


        @NonNull
        @Override
        public List<Characteristic> getAvailableElevationCharacteristics() {
            return List.of(
                    Characteristic.I
            );
        }

        @NonNull
        @Override
        public List<Skill> getAvailableElevationSkills() {
            return List.of(
                    BasicSkill.Ride.selectingSpecialization(RideSpecialization.Horse),
                    AdvancedSkill.Lore.selectingSpecialization(LoreSpecialization.MilitaryScience),
                    AdvancedSkill.AnimalCare,
                    AdvancedSkill.Evaluate
            );
        }

        @NonNull
        @Override
        public List<Talent> getAvailableTalents() {
            return Collections.emptyList();
        }
    }

    private static class Archmage extends CareerStage {

        private static final String PREFIX = "archmage";

        protected Archmage() {
            super(Estate.EstateType.Golden.create(2));
        }

        @NonNull
        @Override
        public String getId() {
            return "";
        }

        @NonNull
        @Override
        public String getName() {
            return PREFIX.replace(".", " ");
        }

        @NonNull
        @Override
        public List<Characteristic> getAvailableElevationCharacteristics() {
            return List.of(
                    Characteristic.Fel
            );
        }

        @NonNull
        @Override
        public List<Skill> getAvailableElevationSkills() {
            return List.of(
                    AdvancedSkill.Lore,
                    AdvancedSkill.Language
            );
        }

        @NonNull
        @Override
        public List<Talent> getAvailableTalents() {
            return Collections.emptyList();
        }
    }
}

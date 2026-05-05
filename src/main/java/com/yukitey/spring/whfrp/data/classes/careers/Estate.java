package com.yukitey.spring.whfrp.data.classes.careers;

import com.yukitey.spring.whfrp.data.Dice;
import com.yukitey.spring.whfrp.data.currency.Currency;
import org.springframework.lang.NonNull;

import static com.yukitey.spring.whfrp.data.currency.Currency.*;

public abstract class Estate {

    @NonNull
    private EstateType type;

    private int level;

    private Estate(@NonNull final EstateType type, final int level) {
        this.type = type;
        this.level = level;
    }

    @NonNull
    public EstateType getType() {
        return type;
    }

    public void setType(@NonNull final EstateType type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(final int level) {
        this.level = level;
    }

    @NonNull
    abstract public Currency income();

    @Override
    public String toString() {
        return String.format("%s %s", getType(), getLevel());
    }

    public enum EstateType {

        Copper("copper"),
        Silver("silver"),
        Golden("golden");

        @NonNull
        private final String id;

        EstateType(final String id) {
            this.id = id;
        }

        @NonNull
        public String getId() {
            return id;
        }

        @NonNull
        public Estate create(final int level) {
            final Estate estate;
            switch (this) {
                case Copper:
                    estate = new CopperEstate(level);
                    break;
                case Silver:
                    estate = new SilverEstate(level);
                    break;
                case Golden:
                default:
                    estate = new GoldenEstate(level);
                    break;
            }
            return estate;
        }
    }

    protected static class CopperEstate extends Estate {

        public CopperEstate(final int level) {
            super(EstateType.Copper, level);
        }

        @Override
        public Currency income() {
            return CurrencyType.Penny.create(Dice.D10.roll(2));
        }
    }

    protected static class SilverEstate extends Estate {

        public SilverEstate(final int level) {
            super(EstateType.Silver, level);
        }

        @Override
        public Currency income() {
            return CurrencyType.Shilling.create(Dice.D10.roll());
        }
    }

    protected static class GoldenEstate extends Estate {

        public GoldenEstate(final int level) {
            super(EstateType.Golden, level);
        }

        @Override
        public Currency income() {
            return CurrencyType.Crown.create(getLevel());
        }
    }
}

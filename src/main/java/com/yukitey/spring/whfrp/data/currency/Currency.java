package com.yukitey.spring.whfrp.data.currency;

import org.springframework.lang.NonNull;

public class Currency {

    private int count;

    private Currency(final int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public Currency setCount(final int count) {
        this.count = count;
        return this;
    }

    public enum CurrencyType {

        Penny("penny"),
        Shilling("shilling"),
        Crown("crown");

        private final String id;

        CurrencyType(@NonNull final String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        @NonNull
        public Currency create(final int count) {
            final Currency currency;
            switch (this) {
                case Penny:
                    currency = new Penny(count);
                    break;
                case Shilling:
                    currency = new Shilling(count);
                    break;
                case Crown:
                default:
                    currency = new Crown(count);
                    break;
            }
            return currency;
        }
    }

    private static class Penny extends Currency {
        private Penny(final int count) {
            super(count);
        }
    }

    private static class Shilling extends Currency {
        private Shilling(final int count) {
            super(count);
        }
    }

    private static class Crown extends Currency {
        private Crown(final int count) {
            super(count);
        }
    }
}

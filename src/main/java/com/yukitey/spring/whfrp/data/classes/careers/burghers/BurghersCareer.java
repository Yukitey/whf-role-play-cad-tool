package com.yukitey.spring.whfrp.data.classes.careers.burghers;

import com.yukitey.spring.whfrp.data.classes.CharacterClass;
import com.yukitey.spring.whfrp.data.classes.careers.Career;
import com.yukitey.spring.whfrp.data.classes.careers.CharacterClassCareer;
import org.springframework.lang.NonNull;

import java.lang.reflect.InvocationTargetException;

/**
 * Careers available to burghers class.
 * @author Andrey Sadovinskiy
 */
public enum BurghersCareer implements CharacterClassCareer {

    /**
     * Agitator
     * <p>
     * Агитатор
     */
    Agitator(AgitatorCareer.PREFIX, AgitatorCareer.class),

    /**
     * Artisan
     * <p>
     * Ремесленник
     */
    Artisan(ArtisanCareer.PREFIX, ArtisanCareer.class),

    /**
     * Beggar
     * <p>
     * Попрошайка
     */
    Beggar(BeggarCareer.PREFIX, BeggarCareer.class ),

    /**
     * Investigator
     * <p>
     * Следователь
     */
    Investigator(InvestigatorCareer.PREFIX, InvestigatorCareer.class),

    /**
     * Merchant
     * <p>
     * Купец
     */
    Merchant(MerchantCareer.PREFIX, MerchantCareer.class),

    /**
     * RatCatcher
     * <p>
     * Крысолов
     *
     */
    RatCatcher(RatCatcherCareer.PREFIX, RatCatcherCareer.class),

    /**
     * Townsman
     * <p>
     * Горожанин
     */
    Townsman(TownsmanCareer.PREFIX, TownsmanCareer.class),

    /**
     * Watchman
     * <p>
     * Городской стражник
     */
    Watchman(WatchmanCareer.PREFIX, WatchmanCareer.class);

    @NonNull
    private final String id;

    @NonNull
    private final Class<? extends Career> career;

    BurghersCareer(@NonNull final String id, @NonNull final Class<? extends Career> career) {
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
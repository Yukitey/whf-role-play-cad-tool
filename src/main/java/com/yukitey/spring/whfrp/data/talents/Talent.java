package com.yukitey.spring.whfrp.data.talents;

import com.yukitey.spring.whfrp.data.UniqueNamed;
import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.characteristics.CharacteristicValue;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public interface Talent extends UniqueNamed {
    @Override
    default String getName(){
        return getId().replace(".", " ");
    }

    int getMax(@NonNull final Map<Characteristic, CharacteristicValue> characteristics);

    @NonNull
    default String getDescription(){
       return getDescription(null);
    }

    @NonNull
    String getDescription(@Nullable final Map<Characteristic, CharacteristicValue> characteristics);
}
package com.yukitey.spring.whfrp.data;

import org.springframework.lang.NonNull;

/**
 * Interface representing an object with unique identifier.
 *
 * @author Andrey Sadovinskiy
 */
public interface Identifiable {

    @NonNull
    String getId();
}

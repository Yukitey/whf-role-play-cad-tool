package com.yukitey.spring.whfrp.data;

import com.yukitey.spring.whfrp.data.Identifiable;

/**
 * Interface representing an object with unique named.
 *
 * @author Andrey Sadovinskiy
 */
public interface UniqueNamed extends Identifiable {
    String getName();
}

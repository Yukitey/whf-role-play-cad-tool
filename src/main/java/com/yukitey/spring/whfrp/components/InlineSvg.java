package com.yukitey.spring.whfrp.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class InlineSvg {
    private final String src;

    public InlineSvg(@Autowired @NonNull final String src) {
        this.src = src;
    }
}

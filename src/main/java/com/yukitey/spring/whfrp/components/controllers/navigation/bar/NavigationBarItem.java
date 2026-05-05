package com.yukitey.spring.whfrp.components.controllers.navigation.bar;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NavigationBarItem {

    @NonNull
    private final String name;
    @NonNull
    private final String link;
    @Nullable
    private List<NavigationBarItem> items;

    public NavigationBarItem(@NonNull final String name, @NonNull final String link) {
        this(name, link, null);
    }

    public NavigationBarItem(@NonNull final String name, @NonNull final String link, @Nullable final List<NavigationBarItem> items) {
        this.name = name;
        this.link = link;
        this.items = items;
    }

    @NonNull
    public String getName() {
        return name;
    }

    @NonNull
    public String getLink() {
        return link;
    }

    public boolean hasSubItems() {
        return !CollectionUtils.isEmpty(items);
    }

    @Nullable
    public List<NavigationBarItem> getSubItems() {
        return items;
    }

    @NonNull
    public NavigationBarItem addSubItem(@NonNull final String name, @NonNull final String subLink) {
        return addSubItem(name, subLink, null);
    }

    @NonNull
    public NavigationBarItem addSubItem(@NonNull final String name, @NonNull final String subLink, @Nullable final List<NavigationBarItem> subItems) {
        final NavigationBarItem newItem = new NavigationBarItem(name, link + '/' + subLink);
        if (!CollectionUtils.isEmpty(subItems)){
            subItems.forEach(subItem -> newItem.addSubItem(subItem.getName(), subItem.getLink()));
        }
        if (CollectionUtils.isEmpty(items)){
            this.items = new ArrayList<>();
        }
        items.add(newItem);
        return newItem;
    }
}

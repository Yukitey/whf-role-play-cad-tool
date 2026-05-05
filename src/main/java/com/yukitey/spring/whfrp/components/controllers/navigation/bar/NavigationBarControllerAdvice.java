package com.yukitey.spring.whfrp.components.controllers.navigation.bar;

import com.yukitey.spring.whfrp.data.classes.CharacterClass;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class NavigationBarControllerAdvice {

    @ModelAttribute("navigationBar")
    public List<NavigationBarItem> navigationBar() {

        NavigationBarItem classes = new NavigationBarItem(
                "Классы",
                "classes");
        for (CharacterClass cl:CharacterClass.values()) {
            classes.addSubItem(
                    cl.getName(),
                    cl.getId(),
                    Arrays.stream(cl.getAvailableCareers())
                            .map(career -> new NavigationBarItem(career.getId(), career.getId()))
                            .collect(Collectors.toList())
            );
        }

        return List.of(classes);
    }
}

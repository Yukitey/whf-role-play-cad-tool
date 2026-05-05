package com.yukitey.spring.whfrp.components.controllers;

import com.yukitey.spring.whfrp.data.characteristics.Characteristic;
import com.yukitey.spring.whfrp.data.classes.CharacterClass;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/classes")
public class ClassesController {

    @GetMapping("/")
    public String index(@NonNull final Model model) {
        model.addAttribute("characterClasses", CharacterClass.values());
        return "classes/index";
    }

    @GetMapping("/{classId}")
    public String show(@PathVariable("classId") @NonNull final String id, @NonNull final Model model) {
        model.addAttribute("characterClass", CharacterClass.of(id));
        return "classes/show";
    }

    @GetMapping("/{classId}/{careerId}")
    public String career(@PathVariable("classId") @NonNull final String classId, @PathVariable("careerId") @NonNull final String careerId, @NonNull final Model model) {
        try {
            model.addAttribute(
                    "characteristics",
                   Characteristic.values()
                    );
            model.addAttribute("career", Arrays.stream(CharacterClass.of(classId).getAvailableCareers())
                    .filter(career -> careerId.equals(career.getId()))
                    .findAny()
                    .get()
                    .create());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return "classes/careers/index";
    }
}
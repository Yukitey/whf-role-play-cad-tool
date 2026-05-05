package com.yukitey.spring.whfrp.components.controllers;

import com.yukitey.spring.whfrp.data.classes.CharacterClass;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class PageController {

    @GetMapping("/")
    public String homePage(@NonNull final HttpServletRequest request, @NonNull final Model model) {
        model.addAttribute("characterClasses", CharacterClass.values());
        model.addAttribute("view", new ModelAndView("classes/index", model.asMap()));
        return "index";
    }
}
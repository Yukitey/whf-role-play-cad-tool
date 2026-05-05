package com.yukitey.spring.whfrp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.lang.NonNull;

@SpringBootApplication
public class WHFRolePlayCadToolApplication {
    public static void main(@NonNull final String[] args) {

        SpringApplication.run(WHFRolePlayCadToolApplication.class, args);

//        for (BasicSkill skill : BasicSkill.values()) {
//            System.out.println(
//                    "BasicSkill - " + skill + (skill.specialize().isPresent()
//                            ? " (Specializations: " + Arrays.stream(skill.specialize().get())
//                            .map(Object::toString)
//                            .collect(Collectors.joining(", ")) + ")"
//                            : "")
//
//            );
//        }
//
//        for (AdvancedSkill skill : AdvancedSkill.values()) {
//            System.out.println(
//                   "AdvancedSkill - " + skill + (skill.specialize().isPresent()
//                            ? " (Specializations: " + Arrays.stream(skill.specialize().get())
//                            .map(Object::toString)
//                            .collect(Collectors.joining(", ")) + ")"
//                            : "")
//            );
//        }


//        try {
//            System.out.println(AcademicsCareer.Wizard.create());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        System.out.println(CharacterClass.values());


    }
}

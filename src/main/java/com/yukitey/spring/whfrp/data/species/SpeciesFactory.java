package com.yukitey.spring.whfrp.data.species;

import org.springframework.lang.NonNull;

public enum SpeciesFactory {

    Dwarf(DwarfSpecies.FACTORY),
    Human(HumanSpecies.FACTORY);

    SpeciesFactory(@NonNull final Species species) {
    }
}

package com.crud.pokemon.controller;


import com.crud.pokemon.model.Pokemon;
import com.crud.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/pokemon")
    private List<Pokemon> verPokemon(){
        return pokemonService.verPokemon();
    }

    @DeleteMapping("/pokemon/{id}")
    private void eliminarPokemon(@PathVariable("id") long id){
        pokemonService.eliminarPokemon(id);
    }


    @PostMapping("/pokemon")
    private void crearPokemon(@RequestBody Pokemon pokemon){
        pokemonService.crearPokemon(pokemon);

    }

}

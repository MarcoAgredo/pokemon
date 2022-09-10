package com.crud.pokemon.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Entrenador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre;

//    @OneToMany(mappedBy = "entrenador")
//    private List<Pokemon> pokemons;

    @ManyToMany(mappedBy = "entrenadors")
    private List<Pokemon> pokemons;
}

package org.example.rosiangienicolortiz_dwes_proyecto.Controladores;

import jakarta.validation.Valid;
import org.example.rosiangienicolortiz_dwes_proyecto.Modelo.Entrenador;
import org.example.rosiangienicolortiz_dwes_proyecto.Modelo.Pokemon;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Controlador {
    List<Pokemon> pokemones= new ArrayList<>();

    public Controlador() {
         pokemones = cargarPokemons();
    }

    public List<Pokemon> cargarPokemons() {
        ClassPathResource json = new ClassPathResource("data/pokemon.json");
        ObjectMapper mapper = new ObjectMapper();

        try (InputStream entrada = json.getInputStream()){
            List<Pokemon> pokemons = mapper.readValue(entrada, new TypeReference<List<Pokemon>>() {
            });
            return pokemons;

        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("entrenador", new Entrenador());
        return "index";
    }
    @PostMapping("/pokemons")
    public String lista(@Valid @ModelAttribute("entrenador") Entrenador entrenador, BindingResult errores){
    if(errores.hasErrors()){
        return "index";
    }
        return "redirect:/pokemons";
    }



    @GetMapping("/pokemons")
    public String todos(Model model){
       model.addAttribute("lista", pokemones);
        return "pokemons";
    }

    @GetMapping("/pokemons/{id}")
    public String detalle(@PathVariable("id") Integer id, Model model){
    model.addAttribute("pokemon", buscarPokemon(id, pokemones));
    return "detalle";
    }

    private Pokemon buscarPokemon(Integer id, List<Pokemon> lista) {
        Pokemon elemento = null;

        for (Pokemon pokemon : lista) {
            if (pokemon.getId() == id) {
                elemento = pokemon;
            }
        }return elemento;
    }

}

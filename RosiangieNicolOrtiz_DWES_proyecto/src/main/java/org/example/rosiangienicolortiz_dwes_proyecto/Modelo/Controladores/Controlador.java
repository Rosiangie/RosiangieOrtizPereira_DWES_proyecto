package org.example.rosiangienicolortiz_dwes_proyecto.Modelo.Controladores;

import org.example.rosiangienicolortiz_dwes_proyecto.Modelo.Pokemon;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Controlador {

    public List<Pokemon> cargarPokemons() {
        ClassPathResource json = new ClassPathResource("pokemon.json");
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
    public String index(){
        return "index";
    }
}

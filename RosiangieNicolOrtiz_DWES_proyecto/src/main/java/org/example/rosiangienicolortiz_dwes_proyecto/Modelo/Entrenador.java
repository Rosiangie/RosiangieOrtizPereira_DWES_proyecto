package org.example.rosiangienicolortiz_dwes_proyecto.Modelo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Entrenador {
    @NotBlank(message = "El nombre no puede estar vacía")
    @Size(min = 3, max = 15, message = "El nombre debe tener entre 3 y 15 caracteres")
    private String nombre;

    public Entrenador() {
    }

    public Entrenador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

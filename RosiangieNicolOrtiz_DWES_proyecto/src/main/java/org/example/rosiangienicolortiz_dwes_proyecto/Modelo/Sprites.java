package org.example.rosiangienicolortiz_dwes_proyecto.Modelo;

import java.util.Objects;

public class Sprites {
    private String front_default;
    private String back_defaul;
    private String front_shiny;
    private String back_shiny;

    public String getFront_default() {
        return front_default;
    }

    public String getBack_defaul() {
        return back_defaul;
    }

    public String getFront_shiny() {
        return front_shiny;
    }

    public String getBack_shiny() {
        return back_shiny;
    }

    public void setFront_default(String front_default) {
        this.front_default = front_default;
    }

    public void setBack_defaul(String back_defaul) {
        this.back_defaul = back_defaul;
    }

    public void setFront_shiny(String front_shiny) {
        this.front_shiny = front_shiny;
    }

    public void setBack_shiny(String back_shiny) {
        this.back_shiny = back_shiny;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Sprites sprites = (Sprites) o;
        return Objects.equals(front_default, sprites.front_default) && Objects.equals(back_defaul, sprites.back_defaul) && Objects.equals(front_shiny, sprites.front_shiny) && Objects.equals(back_shiny, sprites.back_shiny);
    }

    @Override
    public int hashCode() {
        return Objects.hash(front_default, back_defaul, front_shiny, back_shiny);
    }

    @Override
    public String toString() {
        return "Sprites{" +
                "front_default='" + front_default + '\'' +
                ", back_defaul='" + back_defaul + '\'' +
                ", front_shiny='" + front_shiny + '\'' +
                ", back_shiny='" + back_shiny + '\'' +
                '}';
    }
}

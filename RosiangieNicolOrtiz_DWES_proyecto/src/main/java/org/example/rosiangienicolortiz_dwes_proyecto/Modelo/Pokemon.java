package org.example.rosiangienicolortiz_dwes_proyecto.Modelo;

import java.util.List;
import java.util.Objects;

public class Pokemon {
    private int height;
    private int id;
    private String name;
    private List<Stats> stats;
    private Sprites sprites;
    private List<String> types;
    private int weight;
    private List<Moves> moves;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public List<Stats> getStats() {
        return stats;
    }

    public void setStats(List<Stats> stats) {
        this.stats = stats;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<Moves> getMoves() {
        return moves;
    }

    public void setMoves(List<Moves> moves) {
        this.moves = moves;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return height == pokemon.height && id == pokemon.id && weight == pokemon.weight && Objects.equals(name, pokemon.name) && Objects.equals(stats, pokemon.stats) && Objects.equals(sprites, pokemon.sprites) && Objects.equals(types, pokemon.types) && Objects.equals(moves, pokemon.moves);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, id, name, stats, sprites, types, weight, moves);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "height=" + height +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", stats=" + stats +
                ", sprites=" + sprites +
                ", types=" + types +
                ", weight=" + weight +
                ", moves=" + moves +
                '}';
    }
}

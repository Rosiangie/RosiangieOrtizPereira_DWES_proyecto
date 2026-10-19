package org.example.rosiangienicolortiz_dwes_proyecto.Modelo;

import java.util.Objects;

public class Stats {
    private String name;
    private int value;

    public Stats(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stats stats = (Stats) o;
        return value == stats.value && Objects.equals(name, stats.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "Stats{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}

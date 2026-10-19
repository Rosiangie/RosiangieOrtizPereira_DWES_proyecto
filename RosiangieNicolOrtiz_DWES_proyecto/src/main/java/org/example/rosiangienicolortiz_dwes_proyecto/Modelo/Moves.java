package org.example.rosiangienicolortiz_dwes_proyecto.Modelo;

import java.util.Objects;

public class Moves {
    private String name;
    private String url;
    private String accuracy;
    private String power;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Moves(String name, String url, String accuracy, String power, String type) {
        this.name = name;
        this.url = url;
        this.accuracy = accuracy;
        this.power = power;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moves moves = (Moves) o;
        return Objects.equals(name, moves.name) && Objects.equals(url, moves.url) && Objects.equals(accuracy, moves.accuracy) && Objects.equals(power, moves.power) && Objects.equals(type, moves.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, url, accuracy, power, type);
    }

    @Override
    public String toString() {
        return "Moves{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", accuracy='" + accuracy + '\'' +
                ", power='" + power + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

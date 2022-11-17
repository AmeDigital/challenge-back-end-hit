package com.example.challenge.model;

public class Planeta {
    private String nome;
    private String clima;
    private String terreno;

    public Planeta() {}

    public Planeta(String nome, String clima, String terreno) {
        this.nome = nome;
        this.clima = clima;
        this.terreno = terreno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    @Override
    public String toString() {
        return "Nome do planta: " + getNome() + "\nClima: " + getClima() + "\nTerreno: " + getTerreno();
    }
}

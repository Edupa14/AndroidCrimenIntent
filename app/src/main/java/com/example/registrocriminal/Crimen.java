package com.example.registrocriminal;

import java.util.Date;
import java.util.UUID;

public class Crimen {
    private UUID mId;
    private String Titulo;
    private Date date;
    private boolean Resuelto;

    public Crimen() {
        this.mId = UUID.randomUUID();
        this.date = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitulo() {
        return Titulo;
    }

    public Date getDate() {
        return date;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public void setResuelto(boolean resuelto) {
        Resuelto = resuelto;
    }
}

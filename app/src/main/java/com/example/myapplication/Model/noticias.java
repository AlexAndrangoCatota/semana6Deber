package com.example.myapplication.Model;

public class noticias {
    String Titulo;
    String Subtitulo;

    public noticias ( String titulo, String subtitulo) {
        Titulo = titulo;
        Subtitulo = subtitulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getSubtitulo() {
        return Subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        Subtitulo = subtitulo;
    }
}

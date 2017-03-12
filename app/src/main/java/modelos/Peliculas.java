package modelos;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Marcos on 08/02/2017.
 */

public class Peliculas {
    @SerializedName("id_peli")
    private int id_peli;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("categoria")
    private String categoria;
    @SerializedName("duracion")
    private int duracion;
    @SerializedName("director")
    private String director;

    public Peliculas(int id_peli, String nombre, String categoria, int duracion, String director) {
        this.id_peli = id_peli;
        this.nombre = nombre;
        this.categoria = categoria;
        this.duracion = duracion;
        this.director = director;
    }

    public int getId_peli() {
        return id_peli;
    }

    public void setId_peli(int id_peli) {
        this.id_peli = id_peli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "id_peli=" + id_peli +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", duracion='" + duracion + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}


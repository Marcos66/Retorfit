package modelos;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Marcos on 08/02/2017.
 */

public class Cines {
    @SerializedName("id")
    private int id ;
    @SerializedName("localizacion")
    private String localizacion;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("ciudad")
    private String ciudad;

    public Cines(int id, String localizacion, String nombre, String ciudad){
        this.id=id;
        this.localizacion=localizacion;
        this.nombre=nombre;
        this.ciudad=ciudad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    //devuelve los datos de los campos de la base de datos
    @Override
    public String toString() {
        return "cine{" +
                "id='" + id + '\'' +
                ", localizacion='" + localizacion + '\'' +
                ", nombre='" + ciudad + '\'' +
                ", ciudad=" + ciudad +
                '}';
    }

}

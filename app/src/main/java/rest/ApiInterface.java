package rest;

import java.util.List;

import modelos.Cines;
import modelos.Peliculas;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;


/**
 * Created by Marcos on 08/02/2017.
 */

public interface ApiInterface {
    @GET("Cines")
    //esto lo que nos va a mostrar es una lista de cines
    Call<List<Cines>> getCines();

    @GET("Cines/{id}")
    Call<Cines> getCines2(@Path("id") int id);

    @POST("Cines")
    Call<Cines> createCines(@Body Cines cine);

    @PUT("Cines/{id}")
    Call<Cines> actualizarCines(@Path("id") int id, @Body Cines cine);

    @DELETE("Cines/{id}")
    Call<Cines> borrarCines(@Path("id") int id);

    @GET("Peliculas")
    Call<List<Peliculas>> getPeliculas();

    @GET("Peliculas/{id_peli}")
    Call<Peliculas> getPelicula(@Path("id_peli") int id_peli);

    @POST("Peliculas")
    Call<Peliculas> createPelis(@Body Peliculas pelis);

    @PUT("Peliculas/{id_peli}")
    Call<Peliculas> actualizarPelicula(@Path("id_peli") int id_peli, @Body Peliculas pelis);

    @DELETE("Peliculas/{id_peli}")
    Call<Peliculas> borrarPelicula(@Path("id_peli") int id_peli);


}

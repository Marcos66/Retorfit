package com.example.marcos.retorfit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

import modelos.Cines;
import modelos.Peliculas;
import rest.ApiClient;
import rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Retrofit extends AppCompatActivity {
    TextView texto;
    TextView texto2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        texto = (TextView) findViewById(R.id.textoCines);
        texto2 = (TextView) findViewById(R.id.textoPelis);

        final ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        //AÑADIMOS UN NUEVO CINE
        //METODO POST
        Cines cines = new Cines(56,"title", "authosdr", "cdc");
        Call<Cines> call1 = apiService.createCines(cines);
        call1.enqueue(new Callback<Cines>() {
            @Override
            public void onResponse(Call<Cines> call, Response<Cines> response) {
                Log.d("Cines", "cine creado con exito");
            }

            @Override
            public void onFailure(Call<Cines> call, Throwable t) {
                Log.e("Cine ERROR:", t.toString());
            }
        });


        //BORRAMOS UN CINE
        //METODO DELETE
        Call<Cines> call3 = apiService.borrarCines(55);
        call3.enqueue(new Callback<Cines>() {
            @Override
            public void onResponse(Call<Cines> call, Response<Cines> response) {
                Log.d("Cines: ","cine borrado con exito");
            }

            @Override
            public void onFailure(Call<Cines> call, Throwable t) {
                Log.e("Cines Error:", t.toString());
            }


        });
        //ACTUALIZAMOS EL CINE
        //METODO PUT
        Cines cine = new Cines(6,"Jaen sity", "Cines Peinado", "Jaen");
        Call<Cines> call4 = apiService.actualizarCines(6,cine);
        call4.enqueue(new Callback<Cines>() {
            @Override
            public void onResponse(Call<Cines> call, Response<Cines> response) {
                Log.d("Cines: ","cine actualizado con exito");
            }

            @Override
            public void onFailure(Call<Cines> call, Throwable t) {
                Log.e("Cines Error:", t.toString());
            }


        });

        //LISTAMOS LOS CINES
        //METODO GET
        Call <List<Cines>> call2 = apiService.getCines();
        call2.enqueue(new Callback<List<Cines>>() {
            @Override
            public void onResponse(Call<List<Cines>> call, Response<List<Cines>> response) {
                List<Cines> lista = response.body();
                texto.setText("prueba "+lista.toString());
                for (Cines c : lista){
                    Log.d("Cines: ", ""+c);
                }
            }

            @Override
            public void onFailure(Call<List<Cines>> call, Throwable t) {
                Log.e("Cines Error:", t.toString());
            }
        });
        //AÑADIMOS UNA NUEVA PELICULA
        //METODO POST
        Peliculas pelis = new Peliculas(20,"Pelicula 1", "accion", 120 ,"Sergio");
        Call<Peliculas> call6 = apiService.createPelis(pelis);
        call6.enqueue(new Callback<Peliculas>() {
            @Override
            public void onResponse(Call<Peliculas> call, Response<Peliculas> response) {
                Log.d("Peliculas", "Pelicula creada con exito");
            }

            @Override
            public void onFailure(Call<Peliculas> call, Throwable t) {
                Log.e("Pelicula ERROR:", t.toString());
            }
        });
        //BORRAMOS UNA PELICULA
        //METODO DELETE
        Call<Peliculas> call7 = apiService.borrarPelicula(28);
        call7.enqueue(new Callback<Peliculas>() {
            @Override
            public void onResponse(Call<Peliculas> call, Response<Peliculas> response) {
                Log.d("Pelicula: ","pelicula borrada con exito");
            }

            @Override
            public void onFailure(Call<Peliculas> call, Throwable t) {
                Log.e("Pelicula Error:", t.toString());
            }


        });
        //ACTUALIZAMOS LA PELICULA
        //METODO PUT
        Peliculas peli = new Peliculas(9,"Star wars 8", "accion", 125,"Lucas");
        Call<Peliculas> call8 = apiService.actualizarPelicula(9,peli);
        call8.enqueue(new Callback<Peliculas>() {
            @Override
            public void onResponse(Call<Peliculas> call, Response<Peliculas> response) {
                Log.d("Peliculas: ","pelicula actualizada con exito");
            }

            @Override
            public void onFailure(Call<Peliculas> call, Throwable t) {
                Log.e("Peliculas Error:", t.toString());
            }


        });
        //LISTAMOS LAS PELICULAS
        //METODO GET
        Call <List<Peliculas>> call5 = apiService.getPeliculas();
        call5.enqueue(new Callback<List<Peliculas>>() {
            @Override
            public void onResponse(Call<List<Peliculas>> call, Response<List<Peliculas>> response) {
                List<Peliculas> lista = response.body();
                texto2.setText("prueba "+lista.toString());
                for (Peliculas p : lista){
                    Log.d("Peliculas: ", ""+p);
                }
            }

            @Override
            public void onFailure(Call<List<Peliculas>> call, Throwable t) {
                Log.e("Pelis Error:", t.toString());
            }
        });

    }
}

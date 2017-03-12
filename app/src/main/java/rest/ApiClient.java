package rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Created by Marcos on 08/02/2017.
 */

public class ApiClient {
    //cambiar la url, en nuestro caso seria la de la maquina virtual
    public static final String BASE_URL = "http://192.168.1.14:3000/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

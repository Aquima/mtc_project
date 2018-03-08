package api.service;

import java.util.List;

import api.model.Repository;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by raulquispe on 3/7/18.
 */

public interface ApiClient {
    @GET("/users/{user}/repos")
    Call<List<Repository>> reposForUser(@Path("user") String user);

}

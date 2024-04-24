package com.example.retrofit_get;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TodoService {
    @GET("todos")
    Call<List<Todo>> getTodos();

    @GET("todos")
    Call<List<Todo>> getTodoByUserId(@Query("userId") int userId);
}


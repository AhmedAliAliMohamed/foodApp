package com.example.foodapp.ui.viewmodels;

import com.example.foodapp.models.HomeCategoriesModel;
import com.example.foodapp.models.LatestMealModel;
import com.example.foodapp.models.ModelForDetailItem;
import com.example.foodapp.models.ModelSearch;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiCallInterface {

    @GET("/recipes/top25random?api_key=vo5lh4MaziwanrC49T3YS2uL2SM8trFx")
    Call<LatestMealModel> getLatestMeal();

    @GET("/recipe/categories?api_key=vo5lh4MaziwanrC49T3YS2uL2SM8trFx")
    Call<List<HomeCategoriesModel>> getHomeCategories();

    @GET("/recipes?api_key=vo5lh4MaziwanrC49T3YS2uL2SM8trFx")
    Call<ModelSearch> getItemFromSearch(@Query("any_kw") String anyKeyWord);

    @GET("/recipe/steps/?api_key=vo5lh4MaziwanrC49T3YS2uL2SM8trFx")
    Call<ModelForDetailItem> getDetailItem(@Query("id") int itemId);


}

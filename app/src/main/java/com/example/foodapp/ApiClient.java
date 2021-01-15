package com.example.foodapp;

import com.example.foodapp.models.HomeCategoriesModel;
import com.example.foodapp.models.LatestMealModel;
import com.example.foodapp.models.ModelForDetailItem;
import com.example.foodapp.models.ModelSearch;
import com.example.foodapp.ui.viewmodels.ApiCallInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static final String BASE_URL = "https://api2.bigoven.com";
    private final ApiCallInterface apiCallInterface;
    private static ApiClient APICLIENT;

    public ApiClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiCallInterface = retrofit.create(ApiCallInterface.class);
    }

    public static ApiClient getInstance(){
        if(APICLIENT == null){
            APICLIENT = new ApiClient();
        }

            return APICLIENT;
    }

    public Call<LatestMealModel> latestMealModelCall(){
        return apiCallInterface.getLatestMeal();
    }

    public  Call<List<HomeCategoriesModel>> homeCategoriesModelCall(){
        return apiCallInterface.getHomeCategories();
    }
    public Call<ModelSearch> getItemFromSearch(String  anyKeyWord){
        return apiCallInterface.getItemFromSearch(anyKeyWord);
    }

    public Call<ModelForDetailItem> getDetailItem(int itemid){
        return apiCallInterface.getDetailItem(itemid);
    }
}
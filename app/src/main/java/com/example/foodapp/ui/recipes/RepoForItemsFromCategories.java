package com.example.foodapp.ui.recipes;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.example.foodapp.models.ItemsFromCategoryModel;
import com.example.foodapp.services.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepoForItemsFromCategories {
    private Application application;
    private MutableLiveData<ItemsFromCategoryModel> fromCategoryModelMutableLiveData;

    public RepoForItemsFromCategories(Application application) {
        this.application = application;
        this.fromCategoryModelMutableLiveData = new MutableLiveData<>();
    }

    public void setKeyWordItemCategories(String anyKey){
        ApiClient.getInstance().getItemsFromCategory(anyKey).enqueue(new Callback<ItemsFromCategoryModel>() {
            @Override
            public void onResponse(Call<ItemsFromCategoryModel> call, Response<ItemsFromCategoryModel> response) {
                fromCategoryModelMutableLiveData.postValue(response.body());
            }
            @Override
            public void onFailure(Call<ItemsFromCategoryModel> call, Throwable t) {

            }
        });
    }

    public MutableLiveData<ItemsFromCategoryModel> getFromCategoryModelMutableLiveData(){
        return fromCategoryModelMutableLiveData;
    }
}

package com.example.foodapp.ui.recipes;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import com.example.foodapp.models.ItemsFromCategoryModel;
import com.example.foodapp.services.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

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
//                Toast.makeText(application, ""+response.body().getResults().get(1)
//                        .getTitle(), Toast.LENGTH_SHORT).show();
                fromCategoryModelMutableLiveData.postValue(response.body());
                Log.d(TAG, "onResponse: "+response.body());
            }

            @Override
            public void onFailure(Call<ItemsFromCategoryModel> call, Throwable t) {
                Log.d(TAG,"onResponse:  "+t.getMessage());
            }
        });
    }

    public MutableLiveData<ItemsFromCategoryModel> getFromCategoryModelMutableLiveData(){
        return fromCategoryModelMutableLiveData;
    }
}

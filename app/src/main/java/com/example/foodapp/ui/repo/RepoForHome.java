package com.example.foodapp.ui.repo;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.foodapp.ApiClient;
import com.example.foodapp.models.HomeCategoriesModel;
import com.example.foodapp.models.LatestMealModel;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepoForHome {
    private Application application;
    private MutableLiveData<LatestMealModel> latestMutableiveData;
    private MutableLiveData<List<HomeCategoriesModel>> homeCategoriesModelMutableLiveData;

    public RepoForHome(Application application) {
        this.application = application;
        this.latestMutableiveData = new MutableLiveData<>();
        this.homeCategoriesModelMutableLiveData = new MutableLiveData<>();
    }

    public void latestMealing (){
        ApiClient.getInstance().latestMealModelCall().enqueue(new Callback<LatestMealModel>() {
            @Override
            public void onResponse(Call<LatestMealModel> call, Response<LatestMealModel> response) {
               latestMutableiveData.postValue(response.body());
            }

            @Override
            public void onFailure(Call<LatestMealModel> call, Throwable t) {

            }
        });
    }

    public void homeCategories(){
        ApiClient.getInstance().homeCategoriesModelCall().enqueue(new Callback<List<HomeCategoriesModel>>() {
            @Override
            public void onResponse(Call<List<HomeCategoriesModel>> call, Response<List<HomeCategoriesModel>> response) {
                homeCategoriesModelMutableLiveData.postValue(response.body());
            }

            @Override
            public void onFailure(Call<List<HomeCategoriesModel>> call, Throwable t) {
                Log.i("Ahmed","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAQQQQQQ"+t.getMessage());

            }
        });
    }

    public  MutableLiveData<LatestMealModel> getLatestMutableiveData(){
        return latestMutableiveData;
    }

    public MutableLiveData<List<HomeCategoriesModel>> getHomeCategoriesModelMutableLiveData(){
        return homeCategoriesModelMutableLiveData;
    }
}

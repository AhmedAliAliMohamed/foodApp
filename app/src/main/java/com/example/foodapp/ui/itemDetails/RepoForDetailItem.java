package com.example.foodapp.ui.itemDetails;

import android.app.Application;


import androidx.lifecycle.MutableLiveData;

import com.example.foodapp.services.ApiClient;
import com.example.foodapp.models.ModelForDetailItem;



import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepoForDetailItem {

    private Application application;
    private MutableLiveData<ModelForDetailItem> getDetailItem;


    public RepoForDetailItem(Application application) {
        this.application = application;
        this.getDetailItem = new MutableLiveData<>();

    }

    public void setGetDetailItem(int id){
       ApiClient.getInstance().getDetailItem(id).enqueue(new Callback<ModelForDetailItem>() {
           @Override
           public void onResponse(Call<ModelForDetailItem> call, Response<ModelForDetailItem> response) {

               getDetailItem.postValue(response.body());

           }

           @Override
           public void onFailure(Call<ModelForDetailItem> call, Throwable t) {

           }
       });
    }

    public MutableLiveData<ModelForDetailItem> getGetDetailItem(){
        return getDetailItem;
    }
}

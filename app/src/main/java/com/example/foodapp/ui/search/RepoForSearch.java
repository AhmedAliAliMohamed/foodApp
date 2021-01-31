package com.example.foodapp.ui.search;

import android.app.Application;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import com.example.foodapp.services.ApiClient;

import com.example.foodapp.models.ModelSearch;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepoForSearch {
    private Application application;
    private MutableLiveData<ModelSearch> searchMutableLiveData;


    public RepoForSearch(Application application) {
        this.application = application;
        this.searchMutableLiveData = new MutableLiveData<>();
    }

    public void getItem(String anyKeyWord){
        if (anyKeyWord.isEmpty()){
            Toast.makeText(application, "Write any key word for food", Toast.LENGTH_SHORT).show();
        }else {
            ApiClient.getInstance().getItemFromSearch(anyKeyWord).enqueue(new Callback<ModelSearch>() {
                @Override
                public void onResponse(Call<ModelSearch> call, Response<ModelSearch> response) {
                    searchMutableLiveData.postValue(response.body());
                }

                @Override
                public void onFailure(Call<ModelSearch> call, Throwable t) {
                    Toast.makeText(application, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }

    }

    public MutableLiveData<ModelSearch> getSearchMutableLiveData(){
        return searchMutableLiveData;
    }
}

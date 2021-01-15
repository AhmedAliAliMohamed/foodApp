package com.example.foodapp.ui.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.foodapp.models.ModelForDetailItem;
import com.example.foodapp.ui.repo.RepoForDetailItem;

import java.util.List;

public class ViewModelForDetailItem extends AndroidViewModel {
    private RepoForDetailItem repoForDetailItem;
    private MutableLiveData<ModelForDetailItem> modelForDetailItemMutableLiveData;

    public ViewModelForDetailItem(@NonNull Application application) {
        super(application);
        this.repoForDetailItem = new RepoForDetailItem(application);
        modelForDetailItemMutableLiveData = repoForDetailItem.getGetDetailItem();
    }

    public void setItemId(int id){
        repoForDetailItem.setGetDetailItem(id);
    }

    public MutableLiveData<ModelForDetailItem> getModelForDetailItemMutableLiveData(){
        return modelForDetailItemMutableLiveData;
    }
}

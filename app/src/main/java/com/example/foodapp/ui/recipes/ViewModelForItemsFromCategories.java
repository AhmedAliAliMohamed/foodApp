package com.example.foodapp.ui.recipes;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.foodapp.models.ItemsFromCategoryModel;

public class ViewModelForItemsFromCategories extends AndroidViewModel {
    private MutableLiveData<ItemsFromCategoryModel> fromCategoryModelMutableLiveData;
    private RepoForItemsFromCategories repoForItemsFromCategories;

    public ViewModelForItemsFromCategories(@NonNull Application application) {
        super(application);
        this.repoForItemsFromCategories = new RepoForItemsFromCategories(application);
        this.fromCategoryModelMutableLiveData = repoForItemsFromCategories.getFromCategoryModelMutableLiveData();
    }

    public void  setRepoForItemsFromCategories(String anyKeyWord){
        repoForItemsFromCategories.setKeyWordItemCategories(anyKeyWord);
    }
    public MutableLiveData<ItemsFromCategoryModel> getFromCategoryModelMutableLiveData(){
        return repoForItemsFromCategories.getFromCategoryModelMutableLiveData();
    }


}

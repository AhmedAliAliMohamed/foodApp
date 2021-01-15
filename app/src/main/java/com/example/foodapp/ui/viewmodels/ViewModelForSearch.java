package com.example.foodapp.ui.viewmodels;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.foodapp.models.ModelSearch;
import com.example.foodapp.ui.repo.RepoForSearch;

public class ViewModelForSearch  extends AndroidViewModel {
  private   MutableLiveData<ModelSearch> modelSearchMutableLiveData;
  private RepoForSearch repoForSearch ;

    public ViewModelForSearch(Application application) {
        super(application);
        repoForSearch = new RepoForSearch(application);
        modelSearchMutableLiveData = repoForSearch.getSearchMutableLiveData();
    }

    public void getSearchItem(String anyKeyWord){
        repoForSearch.getItem(anyKeyWord);
    }

    public MutableLiveData<ModelSearch> getModelSearchMutableLiveData(){
        return modelSearchMutableLiveData;
    }
}

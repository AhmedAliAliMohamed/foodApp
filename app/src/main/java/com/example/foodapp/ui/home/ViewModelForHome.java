package com.example.foodapp.ui.home;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;


import com.example.foodapp.models.HomeCategoriesModel;
import com.example.foodapp.models.LatestMealModel;

import java.util.List;


public class ViewModelForHome  extends AndroidViewModel {
    private RepoForHome repoForHome;
    private MutableLiveData<LatestMealModel> mealMutableLiveData ;
    private MutableLiveData<List<HomeCategoriesModel>> homeCategoriesModelMutableLiveData;

    public ViewModelForHome(Application application) {
        super(application);
        repoForHome = new RepoForHome(application);
        mealMutableLiveData = repoForHome.getLatestMutableiveData();
        homeCategoriesModelMutableLiveData = repoForHome.getHomeCategoriesModelMutableLiveData();
    }

    public void  latest(){
        repoForHome.latestMealing();
    }
    public void categories(){repoForHome.homeCategories();}

    public MutableLiveData<LatestMealModel> getMealMutableLiveData (){
        return mealMutableLiveData;
    }
    public MutableLiveData<List<HomeCategoriesModel>> getHomeCategoriesModelMutableLiveData(){
        return homeCategoriesModelMutableLiveData;
    }
}

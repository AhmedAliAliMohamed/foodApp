package com.example.foodapp.ui.recipes;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.example.foodapp.R;
import com.example.foodapp.adapters.AdapterForItemFromCategory;
import com.example.foodapp.databinding.ActivityRecipesFromCategoriesBinding;
import com.example.foodapp.models.ItemsFromCategoryModel;

import java.util.Objects;

public class RecipesFromCategories extends AppCompatActivity {

    private ActivityRecipesFromCategoriesBinding activityRecipesFromCategoriesBinding;
    private AdapterForItemFromCategory adapterForItemFromCategory;
    private ViewModelForItemsFromCategories viewModelForItemsFromCategories;
    private String  keyWord;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       activityRecipesFromCategoriesBinding = DataBindingUtil.setContentView(this,R.layout.activity_recipes_from_categories);
        Bundle bundleGetItemKeyWord = getIntent().getExtras();
        keyWord = bundleGetItemKeyWord.getString("keyWord");
        viewModelForItemsFromCategories = ViewModelProviders.of(this).get(ViewModelForItemsFromCategories.class);
        setSupportActionBar(activityRecipesFromCategoriesBinding.toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
                activityRecipesFromCategoriesBinding.drawerLayout,activityRecipesFromCategoriesBinding.toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        toggle.syncState();
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
        activityRecipesFromCategoriesBinding.toolbar.setTitle(keyWord);

       itemFromCategory();



    }


    private void itemFromCategory(){
        adapterForItemFromCategory = new AdapterForItemFromCategory(this);
        activityRecipesFromCategoriesBinding.recyclerViewContainerCatRecipes
                .setLayoutManager(new GridLayoutManager(this,2));
        activityRecipesFromCategoriesBinding.recyclerViewContainerCatRecipes.setAdapter(adapterForItemFromCategory);
        viewModelForItemsFromCategories.setRepoForItemsFromCategories(keyWord);
        viewModelForItemsFromCategories.getFromCategoryModelMutableLiveData().observe(this, new Observer<ItemsFromCategoryModel>() {
            @Override
            public void onChanged(ItemsFromCategoryModel itemsFromCategoryModel) {
                if (itemsFromCategoryModel.getResults() != null){
                    adapterForItemFromCategory.setItemsFromCategoryModels(itemsFromCategoryModel.getResults());
                    activityRecipesFromCategoriesBinding.incCatRecipes.setVisibility(View.GONE);
                }else {
                    Log.d("AHmed","SSSSSSSSSSSSSSSSSSSSSSSSSSSS>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                };
            }
        });


    }
}
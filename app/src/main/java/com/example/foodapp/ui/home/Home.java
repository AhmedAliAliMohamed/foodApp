package com.example.foodapp.ui.home;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import com.example.foodapp.R;
import com.example.foodapp.adapters.AdapterForHomeCategories;
import com.example.foodapp.adapters.AdapterForViewagerHome;
import com.example.foodapp.databinding.ActivityHomeBinding;
import com.example.foodapp.models.HomeCategoriesModel;
import com.example.foodapp.models.LatestMealModel;
import com.example.foodapp.ui.search.SearchPage;
import com.example.foodapp.ui.signInUp.FacebookLoginController;
import com.example.foodapp.ui.signInUp.GoogleLoginController;
import com.google.android.gms.auth.api.Auth;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.List;
import java.util.Objects;

public class Home extends AppCompatActivity {

    private ActivityHomeBinding activityHomeBinding;
    private ViewModelForHome viewModelForHome;
    private AdapterForViewagerHome adapterForViewagerHome;
    private AdapterForHomeCategories adapterForHomeCategories;
    private FirebaseUser firebaseUser;
    private FirebaseAuth auth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityHomeBinding = DataBindingUtil.setContentView(this,R.layout.activity_home);
        viewModelForHome = ViewModelProviders.of(this).get(ViewModelForHome.class);
        setSupportActionBar(activityHomeBinding.toolbarHome);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
                activityHomeBinding.drawerLayout,activityHomeBinding.toolbarHome,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        toggle.syncState();
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
        showRandomRecipes();
        showHomeCategories();
        toSearchPage();
    }

    @Override
    public void onBackPressed() {
        if (activityHomeBinding.drawerLayout.isDrawerOpen(GravityCompat.START)){
            activityHomeBinding.drawerLayout.closeDrawer(GravityCompat.START);
        }else {super.onBackPressed();}
    }

    private void showRandomRecipes(){
        adapterForViewagerHome = new AdapterForViewagerHome(this);
        activityHomeBinding.viewPagerContainer.setAdapter(adapterForViewagerHome);
        viewModelForHome.latest();
        viewModelForHome.getMealMutableLiveData().observe(this, new Observer<LatestMealModel>() {
            @Override
            public void onChanged(LatestMealModel latestMealModel) {
                if (latestMealModel !=null){
                    activityHomeBinding.shimmerViewPagerContainer.setVisibility(View.GONE);
                adapterForViewagerHome.setLatestMealModels(latestMealModel.getResults());
                }
            }
        });
    }

    private void showHomeCategories (){
        adapterForHomeCategories = new AdapterForHomeCategories(this);
        activityHomeBinding.recyclerViewContainer.setLayoutManager(new GridLayoutManager(this,3));
        activityHomeBinding.recyclerViewContainer.setAdapter(adapterForHomeCategories);
        viewModelForHome.categories();
        viewModelForHome.getHomeCategoriesModelMutableLiveData().observe(this, new Observer<List<HomeCategoriesModel>>() {
            @Override
            public void onChanged(List<HomeCategoriesModel> homeCategoriesModels) {
                if (homeCategoriesModels != null){
                    activityHomeBinding.recyclerViewShimmer.setVisibility(View.GONE);
                       adapterForHomeCategories.setHomeCategoriesModels(homeCategoriesModels);
                        adapterForHomeCategories.setOnClickListener(new AdapterForHomeCategories.setOnClickListener() {
                            @Override
                            public void OnClickListener(int position) {

                            }
                        });
                }
            }
        });

    }

    private void toSearchPage(){
        activityHomeBinding.txtSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToSearchPage = new Intent(Home.this, SearchPage.class);
                startActivity(intentToSearchPage);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        GoogleLoginController.getInstance(this).onStart();
    }
}
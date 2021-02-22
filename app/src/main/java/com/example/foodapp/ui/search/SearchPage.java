package com.example.foodapp.ui.search;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;

import com.example.foodapp.R;
import com.example.foodapp.adapters.AdapterForSearchItem;
import com.example.foodapp.databinding.ActivitySearchPageBinding;
import com.example.foodapp.models.ModelSearch;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends AppCompatActivity {

    private ActivitySearchPageBinding activitySearchPageBinding;
    private ViewModelForSearch viewModelForSearch;
    private AdapterForSearchItem adapterForSearchItem;
    private String anyKeyWord;
    private List<ModelSearch.ResultsBean> resultsBeans = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySearchPageBinding = DataBindingUtil.setContentView(this,R.layout.activity_search_page);
        viewModelForSearch = ViewModelProviders.of(this).get(ViewModelForSearch.class);
        activitySearchPageBinding.searchShimmerItemInclude.setVisibility(View.GONE);


        setSupportActionBar(activitySearchPageBinding.toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,activitySearchPageBinding.drawerSearch,activitySearchPageBinding.toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        toggle.syncState();
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        clickOnText();
        getItem();



    }


    private void getItem(){
        adapterForSearchItem = new AdapterForSearchItem(SearchPage.this);
        activitySearchPageBinding.recyclerViewForSearch.setLayoutManager(new GridLayoutManager(SearchPage.this,2));
        activitySearchPageBinding.recyclerViewForSearch.setAdapter(adapterForSearchItem);
        resultsBeans.clear();
        activitySearchPageBinding.btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anyKeyWord =activitySearchPageBinding.txtSearch.getText().toString();
                viewModelForSearch.getSearchItem(anyKeyWord);
                viewModelForSearch.getModelSearchMutableLiveData().observe(SearchPage.this, new Observer<ModelSearch>() {
                    @Override
                    public void onChanged(ModelSearch modelSearch) {
                        if (modelSearch != null){
                        activitySearchPageBinding.searchShimmerItemInclude.setVisibility(View.GONE);
                        adapterForSearchItem.setResultsBeans(modelSearch.getResults());
                        adapterForSearchItem.setSetOnClickListener(new AdapterForSearchItem.setOnClickListener() {
                            @Override
                            public void setOnClickListener(int position) {

                            }
                        });
                        }

                    }
                });
            }
        });


    }
    private void clickOnText(){
        activitySearchPageBinding.txtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                activitySearchPageBinding.searchShimmerItemInclude.setVisibility(View.GONE);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable != null){
                    activitySearchPageBinding.searchShimmerItemInclude.setVisibility(View.VISIBLE);
                }else {
                    activitySearchPageBinding.searchShimmerItemInclude.setVisibility(View.GONE);

                }
            }
        });
    }
}
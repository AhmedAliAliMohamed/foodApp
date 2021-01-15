package com.example.foodapp.ui;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import android.view.View;

import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


import com.example.foodapp.R;
import com.example.foodapp.adapters.AdapterForIngredientsItem;
import com.example.foodapp.adapters.AdapterForStepsItem;
import com.example.foodapp.databinding.ActivityItemDetailBinding;
import com.example.foodapp.models.ModelForDetailItem;
import com.example.foodapp.ui.viewmodels.ViewModelForDetailItem;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.squareup.picasso.Picasso;

public class ItemDetail extends AppCompatActivity {
    private ActivityItemDetailBinding activityItemDetailBinding;
    private AdapterForIngredientsItem adapterForIngredientsItem;
    private AdapterForStepsItem adapterForStepsItem;
    private ViewModelForDetailItem modelForDetailItem;

    private View linearLayout;
    private BottomSheetBehavior bottomSheetBehavior;

    private int itemId;
    private float ratingBar;


    private TextView textViewTitleDetail;
    private RatingBar ratingBarDetails;
    private TextView textViewDescription;
    private RecyclerView recyclerViewAll;


    private ProgressBar progressBarCalories;
    private ProgressBar progressBarFat;
    private ProgressBar progressBarCarb;
    private ProgressBar progressBarSugar;
    private ProgressBar progressBarPortein;
    private TextView textViewCalories;
    private TextView textViewFat;
    private TextView textViewCarb;
    private TextView textViewSugar;
    private TextView textViewProtein;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityItemDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_item_detail);

        getValueIntent();
        bottomSheetOnClick();
        getDetailItem();
    }

    private void bottomSheetOnClick() {
        linearLayout = findViewById(R.id.design_bottom_sheet);
        bottomSheetBehavior = BottomSheetBehavior.from(linearLayout);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bottomSheetBehavior.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);


                } else {
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                }
            }
        });
        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                switch (newState) {
                    case BottomSheetBehavior.STATE_EXPANDED:
                        activityItemDetailBinding.imageViewDetailsItem.setAlpha(0.3f);
                        break;
                    case BottomSheetBehavior.STATE_COLLAPSED:
                        activityItemDetailBinding.imageViewDetailsItem.setAlpha(1.0f);
                    default:
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });

    }

    private void getDetailItem() {
        modelForDetailItem = ViewModelProviders.of(this).get(ViewModelForDetailItem.class);
        modelForDetailItem.setItemId(itemId);
        modelForDetailItem.getModelForDetailItemMutableLiveData().observe(this, new Observer<ModelForDetailItem>() {
            @Override
            public void onChanged(ModelForDetailItem modelForDetailItem) {

                textViewTitleDetail = findViewById(R.id.text_title_details_recipes);
                ratingBarDetails = findViewById(R.id.rate_view_recommend_detail);
                textViewDescription = findViewById(R.id.text_Description_view);

                textViewTitleDetail.setText(modelForDetailItem.getTitle());
                ratingBar = modelForDetailItem.getStarRating();
                ratingBarDetails.setRating(ratingBar);
                textViewDescription.setText(modelForDetailItem.getDescription());
                Picasso.get().load(modelForDetailItem.getImageURL()).into(activityItemDetailBinding.imageViewDetailsItem);

                showIngredient(modelForDetailItem);
                showSteps(modelForDetailItem);

                textViewCalories = findViewById(R.id.text_percentage_TotalCalories);
                textViewFat = findViewById(R.id.text_percentage_total_fat);
                textViewCarb = findViewById(R.id.text_percentage_total_carb);
                textViewSugar = findViewById(R.id.text_percentage_sugar);
                textViewProtein = findViewById(R.id.text_percentage_protein);


                progressBarCalories = findViewById(R.id.progress_circular_TotalCalories);
                progressBarFat = findViewById(R.id.progress_circular_total_fat);
                progressBarCarb = findViewById(R.id.progress_circular_total_carb);
                progressBarSugar = findViewById(R.id.progress_circular_sugar);
                progressBarPortein = findViewById(R.id.progress_circular_protein);

                textViewCalories.setText(modelForDetailItem.getNutritionInfo().getTotalCalories() + "%");
                textViewFat.setText((int) modelForDetailItem.getNutritionInfo().getTotalFat() + "%");
                textViewCarb.setText((int) modelForDetailItem.getNutritionInfo().getTotalCarbs() + "%");
                textViewSugar.setText((int) modelForDetailItem.getNutritionInfo().getSugar() + "%");
                textViewProtein.setText((int) modelForDetailItem.getNutritionInfo().getProtein() + "%");

                progressBarCalories.setProgress(modelForDetailItem.getNutritionInfo().getCaloriesFromFat());
                progressBarFat.setProgress((int) modelForDetailItem.getNutritionInfo().getTotalFat());
                progressBarCarb.setProgress((int) modelForDetailItem.getNutritionInfo().getTotalCarbs());
                progressBarSugar.setProgress((int) modelForDetailItem.getNutritionInfo().getSugar());
                progressBarPortein.setProgress((int) modelForDetailItem.getNutritionInfo().getProtein());


            }
        });
    }

    private void showIngredient(ModelForDetailItem modelForDetailItem) {
        recyclerViewAll = findViewById(R.id.recycler_view_container_ingredients);
        adapterForIngredientsItem = new AdapterForIngredientsItem(this);
        recyclerViewAll.setLayoutManager(new LinearLayoutManager(ItemDetail.this));
        recyclerViewAll.setAdapter(adapterForIngredientsItem);
        adapterForIngredientsItem.setIngredientsBeans(modelForDetailItem.getIngredients());

    }

    private void showSteps(ModelForDetailItem modelForDetailItem) {
        recyclerViewAll = findViewById(R.id.recycler_view_container_steps);
        adapterForStepsItem = new AdapterForStepsItem(this);
        recyclerViewAll.setLayoutManager(new LinearLayoutManager(ItemDetail.this));
        recyclerViewAll.setAdapter(adapterForIngredientsItem);
        adapterForStepsItem.setStepsBeans(modelForDetailItem.getSteps());

    }

    private void getValueIntent(){
        Bundle bundleGetItemId = getIntent().getExtras();
        if (bundleGetItemId.containsKey("item_id")) {
            itemId = bundleGetItemId.getInt("item_id");
        } else if (bundleGetItemId.containsKey("SearchItem")) {
            itemId = bundleGetItemId.getInt("SearchItem");
        }

    }


}
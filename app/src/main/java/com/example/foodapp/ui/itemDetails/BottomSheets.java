package com.example.foodapp.ui.itemDetails;


import android.content.Context;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;


import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;

import com.example.foodapp.adapters.AdapterForIngredientsItem;
import com.example.foodapp.adapters.AdapterForStepsItem;
import com.example.foodapp.models.ModelForDetailItem;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.squareup.picasso.Picasso;

public class BottomSheets extends BottomSheetDialogFragment {
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
    private TextView textViewTitleDetail;
    private RatingBar ratingBarDetails;
    private TextView textViewDescription;
    private static BottomSheets BOTTOM_SHEET;
    private View v;
    private RecyclerView recyclerViewAll;
    private AdapterForIngredientsItem adapterForIngredientsItem;
    private AdapterForStepsItem adapterForStepsItem;
    private ViewModelForDetailItem modelForDetailItem;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.bottom_sheet_design, null);
        return v;
    }

    public static BottomSheets getBottomSheet(){
        if (BOTTOM_SHEET == null){
            BOTTOM_SHEET = new BottomSheets();
        }
        return BOTTOM_SHEET;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        CardView cardView = v.findViewById(R.id.card_bottom_sheet_item);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
    }
    public void bottomSheetItemsView(ModelForDetailItem modelForDetailItem) {


        float ratingBar = modelForDetailItem.getStarRating();
        textViewTitleDetail = v.findViewById(R.id.text_title_details_recipes);
        ratingBarDetails = v.findViewById(R.id.rate_view_recommend_detail);
        textViewDescription = v.findViewById(R.id.text_Description_view);

        textViewCalories = v.findViewById(R.id.text_percentage_TotalCalories);
        textViewFat = v.findViewById(R.id.text_percentage_total_fat);
        textViewCarb = v.findViewById(R.id.text_percentage_total_carb);
        textViewSugar = v.findViewById(R.id.text_percentage_sugar);
        textViewProtein = v.findViewById(R.id.text_percentage_protein);

        progressBarCalories = v.findViewById(R.id.progress_circular_TotalCalories);
        progressBarFat = v.findViewById(R.id.progress_circular_total_fat);
        progressBarCarb = v.findViewById(R.id.progress_circular_total_carb);
        progressBarSugar = v.findViewById(R.id.progress_circular_sugar);
        progressBarPortein = v.findViewById(R.id.progress_circular_protein);

        textViewTitleDetail.setText(modelForDetailItem.getTitle());
        ratingBarDetails.setRating(ratingBar);
        textViewDescription.setText(modelForDetailItem.getDescription());

        textViewCalories.setText(modelForDetailItem.getNutritionInfo().getTotalCalories() + "%");
        textViewFat.setText((int) modelForDetailItem.getNutritionInfo().getTotalFat() + "%");
        textViewCarb.setText((int) modelForDetailItem.getNutritionInfo().getTotalCarbs() + "%");
        textViewSugar.setText((int) modelForDetailItem.getNutritionInfo().getSugar() + "%");
        textViewProtein.setText((int) modelForDetailItem.getNutritionInfo().getProtein() + "%");

        progressBarCalories.setProgress(modelForDetailItem.getNutritionInfo().getTotalCalories());
        progressBarFat.setProgress((int) modelForDetailItem.getNutritionInfo().getTotalFat());
        progressBarCarb.setProgress((int) modelForDetailItem.getNutritionInfo().getTotalCarbs());
        progressBarSugar.setProgress((int) modelForDetailItem.getNutritionInfo().getSugar());
        progressBarPortein.setProgress((int) modelForDetailItem.getNutritionInfo().getProtein());
    }

    public void showSteps(ModelForDetailItem modelForDetailItem, Context context) {
        recyclerViewAll = v.findViewById(R.id.recycler_view_container_steps);
        adapterForStepsItem = new AdapterForStepsItem(context.getApplicationContext());
        recyclerViewAll.setLayoutManager(new LinearLayoutManager(context.getApplicationContext()));
        recyclerViewAll.setAdapter(adapterForStepsItem);
        adapterForStepsItem.setStepsBeans(modelForDetailItem.getSteps());
    }

    public void showIngredient(ModelForDetailItem modelForDetailItem, Context context) {
        recyclerViewAll = v.findViewById(R.id.recycler_view_container_ingredients);
        adapterForIngredientsItem = new AdapterForIngredientsItem(context.getApplicationContext());
        recyclerViewAll.setLayoutManager(new LinearLayoutManager(context.getApplicationContext()));
        recyclerViewAll.setAdapter(adapterForIngredientsItem);
        adapterForIngredientsItem.setIngredientsBeans(modelForDetailItem.getIngredients());
    }





}

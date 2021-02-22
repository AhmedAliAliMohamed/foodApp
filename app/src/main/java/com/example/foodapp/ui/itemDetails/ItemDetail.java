package com.example.foodapp.ui.itemDetails;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import com.example.foodapp.R;
import com.example.foodapp.adapters.AdapterForIngredientsItem;
import com.example.foodapp.adapters.AdapterForStepsItem;
import com.example.foodapp.databinding.ActivityItemDetailBinding;
import com.example.foodapp.models.ModelForDetailItem;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.squareup.picasso.Picasso;

public class ItemDetail extends AppCompatActivity {
    private ActivityItemDetailBinding activityItemDetailBinding;
    private int itemId;
    private ViewModelForDetailItem modelForDetailItem;
    private View linearLayout;
    private BottomSheetBehavior bottomSheetBehavior;
    private BottomSheets getBottomSheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityItemDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_item_detail);
        modelForDetailItem = ViewModelProviders.of(this).get(ViewModelForDetailItem.class);
        getValueIntent();
        getBottomSheet = new BottomSheets();
       getBottomSheet.show(getSupportFragmentManager(),"TAG");
        bottomSheetOnClick();
        getDetailItem();
        Log.d("Ahmed","SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS"+itemId);
    }

    private void bottomSheetOnClick() {
        linearLayout = findViewById(R.id.design_bottom_sheet);
        bottomSheetBehavior = BottomSheetBehavior.from(linearLayout);
       activityItemDetailBinding.cardBottomSheetOpen.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (bottomSheetBehavior.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                   bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
               } else {
                   getBottomSheet.show(getSupportFragmentManager(),"TAG");
                   getDetailItem();
               }
           }
       });
        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                switch (newState) {
                    case BottomSheetBehavior.STATE_EXPANDED:
                        break;
                    case BottomSheetBehavior.STATE_COLLAPSED:
                    default:
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
            }
        });
    }

    private void getDetailItem() {
        modelForDetailItem.setItemId(itemId);
        modelForDetailItem.getModelForDetailItemMutableLiveData().observe(this, new Observer<ModelForDetailItem>() {
            @Override
            public void onChanged(ModelForDetailItem modelForDetailItem) {
                Picasso.get().load(modelForDetailItem.getPhotoUrl()).into(activityItemDetailBinding.imageViewDetailsItem);
                activityItemDetailBinding.spinKitProgress.setVisibility(View.GONE);
                activityItemDetailBinding.imageViewDetailsItem.setVisibility(View.VISIBLE);
                    getBottomSheet.showIngredient(modelForDetailItem,ItemDetail.this);
                    getBottomSheet.showSteps(modelForDetailItem,ItemDetail.this);
                    getBottomSheet.bottomSheetItemsView(modelForDetailItem);
            }
        });
    }

    private void getValueIntent() {
        Bundle bundleGetItemId = getIntent().getExtras();
        if (bundleGetItemId.containsKey("item_id")) {
            itemId = bundleGetItemId.getInt("item_id");
        } else if (bundleGetItemId.containsKey("SearchItem")) {
            itemId = bundleGetItemId.getInt("SearchItem");
        }
    }

}
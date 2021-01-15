package com.example.foodapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.foodapp.R;
import com.example.foodapp.models.LatestMealModel;
import com.example.foodapp.ui.ItemDetail;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AdapterForViewagerHome  extends PagerAdapter {
    private Context context;
    private List<LatestMealModel.ResultsBean> latestMealModels = new ArrayList<>();


    public AdapterForViewagerHome(Context context) {
        this.context = context;
    }

    public void setLatestMealModels(List<LatestMealModel.ResultsBean> latestMealModels1) {
        this.latestMealModels = latestMealModels1;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return latestMealModels.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view_pager_header,container,false);
        ImageView latestImage = view.findViewById(R.id.mealThumb);
        TextView titleLatestMeal = view.findViewById(R.id.mealName);
        LatestMealModel.ResultsBean latestMealModel = latestMealModels.get(position);
        Picasso.get().load(latestMealModel.getPhotoUrl()).into(latestImage);
        titleLatestMeal.setText(latestMealModel.getTitle());
        container.addView(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intentToItemDetail = new Intent(context.getApplicationContext(), ItemDetail.class);
               intentToItemDetail.putExtra("item_id",latestMealModel.getRecipeID());
               context.startActivity(intentToItemDetail);
            
            }
        });

        return view;
    }

}

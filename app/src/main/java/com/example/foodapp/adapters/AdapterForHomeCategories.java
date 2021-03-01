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
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.models.HomeCategoriesModel;
import com.example.foodapp.ui.recipes.RecipesFromCategories;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import com.squareup.picasso.Picasso;


import java.util.ArrayList;
import java.util.List;

public class AdapterForHomeCategories extends RecyclerView.Adapter<AdapterForHomeCategories.Holder> {
    Context context ;
    List<HomeCategoriesModel> homeCategoriesModels = new ArrayList<>();
    private setOnClickListener onClickListener;
    private int position;
    View view;

    public interface  setOnClickListener{
        void  OnClickListener(int position);
    }

    public void setOnClickListener(setOnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    public AdapterForHomeCategories(Context context) {
        this.context = context;
    }

    public void setHomeCategoriesModels(List<HomeCategoriesModel> homeCategoriesModels1) {
        this.homeCategoriesModels = homeCategoriesModels1;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AdapterForHomeCategories.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_categories,parent,false);
        return new Holder(view, onClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterForHomeCategories.Holder holder, int position) {
        HomeCategoriesModel  categoriesModel = homeCategoriesModels.get(position);
        holder.titleCategories.setText(categoriesModel.getCategory());
        try {
            if (categoriesModel.getPrimaryImage() != null ) {
                Picasso.get().load(categoriesModel.getPrimaryImage()).into(holder.imageHomeCategories);
            }
        }catch (Exception e){ }


    }


    @Override
    public int getItemCount() {
        return homeCategoriesModels.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        ImageView imageHomeCategories ;
        TextView titleCategories ;

        public Holder(@NonNull View itemView, final setOnClickListener setOnClickListener) {
            super(itemView);
            imageHomeCategories = (ImageView) itemView.findViewById(R.id.mealThumb);
            titleCategories = itemView.findViewById(R.id.categoryName);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(onClickListener != null){
                        position = getAdapterPosition();
                            if (position != RecyclerView.NO_POSITION){
                                setOnClickListener.OnClickListener(position);
                                Intent intentToItems = new Intent(context.getApplicationContext(), RecipesFromCategories.class);
                                intentToItems.putExtra("keyWord",homeCategoriesModels.get(position).getCategory());
                                context.startActivity(intentToItems);
                                notifyDataSetChanged();
                            }
                    }

                }
            });

        }
    }
}

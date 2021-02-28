package com.example.foodapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.models.ItemsFromCategoryModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AdapterForItemFromCategory extends RecyclerView.Adapter<AdapterForItemFromCategory.MyHolder> {
    private Context context;
    private List<ItemsFromCategoryModel.ResultsBean> itemsFromCategoryModels = new ArrayList<>();

    public AdapterForItemFromCategory(Context context) {
        this.context = context;
    }

    public void setItemsFromCategoryModels(List<ItemsFromCategoryModel.ResultsBean> itemsFromCategoryModels) {
        this.itemsFromCategoryModels = itemsFromCategoryModels;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_for_recipes_from_category, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        ItemsFromCategoryModel.ResultsBean items = itemsFromCategoryModels.get(position);
        Picasso.get().load(items.getPhotoUrl()).into(holder.imageViewItem);
        holder.textViewItem.setText(items.getTitle());


    }

    @Override
    public int getItemCount() {
        return itemsFromCategoryModels.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewItem;
        private TextView textViewItem;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            imageViewItem = itemView.findViewById(R.id.image_recipes_category);
            textViewItem = itemView.findViewById(R.id.txt_recipes_category);
        }
    }
}

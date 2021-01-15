package com.example.foodapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.models.ModelForDetailItem;



import java.util.ArrayList;
import java.util.List;

public class AdapterForIngredientsItem extends RecyclerView.Adapter<AdapterForIngredientsItem.MyHolder> {
    private Context context;
    private List<ModelForDetailItem.IngredientsBean> ingredientsBeans = new ArrayList<>();

    public AdapterForIngredientsItem(Context context) {
        this.context = context;
    }

    public void setIngredientsBeans(List<ModelForDetailItem.IngredientsBean> ingredientsBeans) {
        this.ingredientsBeans = ingredientsBeans;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_ingredients_item,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        ModelForDetailItem.IngredientsBean ingredientsBean = ingredientsBeans.get(position);
        holder.textViewIngredientTitle.setText(ingredientsBean.getName());
        holder.textViewQuantity.setText(ingredientsBean.getDisplayQuantity());
        holder.textViewMetricUnit.setText(ingredientsBean.getMetricUnit());

    }

    @Override
    public int getItemCount() {
        return ingredientsBeans.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView textViewIngredientTitle;
        TextView textViewQuantity;
        TextView textViewMetricUnit;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            textViewIngredientTitle = itemView.findViewById(R.id.text_ingredient_title);
            textViewQuantity = itemView.findViewById(R.id.text_ingredients_displayQuantity);
            textViewMetricUnit = itemView.findViewById(R.id.text_metricUnit);
        }
    }
}

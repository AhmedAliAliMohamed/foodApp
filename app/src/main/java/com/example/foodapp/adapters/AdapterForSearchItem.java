package com.example.foodapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.models.ModelSearch;
import com.example.foodapp.ui.ItemDetail;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AdapterForSearchItem extends RecyclerView.Adapter<AdapterForSearchItem.Holder> {
    private Context context;
    private List<ModelSearch.ResultsBean> resultsBeans = new ArrayList<>();
    private setOnClickListener setOnClickListener;
    private int position;

    public interface setOnClickListener {
        void setOnClickListener(int position);
    }

    public void setSetOnClickListener(AdapterForSearchItem.setOnClickListener setOnClickListener) {
        this.setOnClickListener = setOnClickListener;
    }

    public AdapterForSearchItem(Context context) {
        this.context = context;
    }

    public void setResultsBeans(List<ModelSearch.ResultsBean> resultsBeans) {
        this.resultsBeans = resultsBeans;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_search_recycler_view, parent, false);
        return new Holder(view, setOnClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        ModelSearch.ResultsBean modelSearch = resultsBeans.get(position);
        Picasso.get().load(modelSearch.getPhotoUrl()).into(holder.searchImageView);
        holder.searchTextView.setText(modelSearch.getTitle());


    }

    @Override
    public int getItemCount() {
        return resultsBeans.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView searchImageView;
        TextView searchTextView;
        ImageButton favoriteImageButton;

        public Holder(@NonNull View itemView, final setOnClickListener onClickListener) {
            super(itemView);
            searchImageView = itemView.findViewById(R.id.image_search_item);
            searchTextView = itemView.findViewById(R.id.mealName_search);
            favoriteImageButton = itemView.findViewById(R.id.image_btn_favorite_fill);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (onClickListener != null) {
                        position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            setOnClickListener.setOnClickListener(position);
                            Intent intentToItemDetail = new Intent(context.getApplicationContext()
                            , ItemDetail.class);
                            intentToItemDetail.putExtra("SearchItem" , resultsBeans.get(position).getRecipeID());
                            context.startActivity(intentToItemDetail);
                        }
                    }

                }
            });


        }
    }
}

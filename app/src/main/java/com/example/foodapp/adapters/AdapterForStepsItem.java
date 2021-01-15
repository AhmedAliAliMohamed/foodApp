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

public class AdapterForStepsItem extends RecyclerView.Adapter<AdapterForStepsItem.MyHolder> {
    private Context context;
    private List<ModelForDetailItem.StepsBean> stepsBeans = new ArrayList<>();

    public AdapterForStepsItem(Context context) {
        this.context = context;
    }

    public void setStepsBeans(List<ModelForDetailItem.StepsBean> stepsBeans) {
        this.stepsBeans = stepsBeans;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_steps,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        ModelForDetailItem.StepsBean stepsBean = stepsBeans.get(position);
        holder.textViewStep.setText(stepsBean.getText());


    }

    @Override
    public int getItemCount() {
        return stepsBeans.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView textViewStep;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            textViewStep = itemView.findViewById(R.id.text_steps);

        }
    }
}

package fr.oupsi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder>  {

    EpsiActivity activity;
    ArrayList<Category> categories;
    private static final String TAG = "MyActivity";

    public CategoryAdapter(EpsiActivity activity, ArrayList<Category> categories){
        this.activity=activity;
        this.categories=categories;
    }

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textViewTitle;
        private final View layoutCellCategory;


        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            textViewTitle = view.findViewById(R.id.textViewTitle);
            layoutCellCategory = view.findViewById(R.id.layoutCellCategory);

        }

        public TextView getTextViewTitle() {
            return textViewTitle;
        }
        public View getLayoutCellCategory() {
            return layoutCellCategory;
        }

    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cell_category, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {
        final Category category=categories.get(position);
        holder.getTextViewTitle().setText(category.getTitle());
        holder.getLayoutCellCategory().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProductsWSActivity.displayActivity(activity, category.getUrl());
            }
        });
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}

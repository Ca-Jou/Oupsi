package fr.oupsi;

import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class CategoriesActivity extends EpsiActivity {
    public static void displayActivity(EpsiActivity activity){
        Intent intent=new Intent(activity,CategoriesActivity.class);
        activity.startActivity(intent);
    }
    private ArrayList<Category> categories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        setTitle("Categories");
        showBack();
        categories=new ArrayList<>();
        RecyclerView recyclerView=findViewById(R.id.recyclerViewCategories);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CategoryAdapter categoryAdapter=new CategoryAdapter(this,categories);
        recyclerView.setAdapter(categoryAdapter);

        try {

            JSONObject jsonObject= new JSONObject(Data.allData);
            JSONArray jsonArray = jsonObject.getJSONArray("items");
            for(int i=0;i<jsonArray.length();i++){
                Category category=new Category(jsonArray.getJSONObject(i));
                categories.add(category);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

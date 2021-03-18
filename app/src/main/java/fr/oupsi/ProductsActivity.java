package fr.oupsi;

import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class ProductsActivity extends EpsiActivity {
    public static void displayActivity(EpsiActivity activity){
        Intent intent=new Intent(activity,ProductsActivity.class);
        activity.startActivity(intent);
    }
    private ArrayList<Product> products;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        setTitle("Products");
        showBack();
        products=new ArrayList<>();
        RecyclerView recyclerView=findViewById(R.id.recyclerViewProducts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ProductAdapter productAdapter=new ProductAdapter(this,products);
        recyclerView.setAdapter(productAdapter);

        try {
            JSONObject jsonObject= new JSONObject(Data.allData);
            JSONArray jsonArray = jsonObject.getJSONArray("items");
            for(int i=0;i<jsonArray.length();i++){
                Product product=new Product(jsonArray.getJSONObject(i));
                products.add(product);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

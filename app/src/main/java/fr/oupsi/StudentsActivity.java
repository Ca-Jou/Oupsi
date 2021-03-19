package fr.oupsi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class StudentsActivity extends EpsiActivity {

    public static void displayActivity(EpsiActivity activity){
        Intent intent=new Intent(activity,StudentsActivity.class);
        activity.startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        setTitle("student.getFirstName()");
        showBack();

//        RecyclerView recyclerView=findViewById(R.id.recyclerViewProducts);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        StudentAdapter studentAdapter=new StudentAdapter(this,);
        recyclerView.setAdapter(productAdapter);
    }

}
package fr.oupsi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends EpsiActivity implements View.OnClickListener {

    public static void displayActivity(EpsiActivity activity){
        Intent intent = new Intent(activity,HomeActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.buttonProduct).setOnClickListener(this);
        findViewById(R.id.buttonStudents).setOnClickListener(this);

        setTitle("Home");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonProduct:
<<<<<<< HEAD
                CategoriesWSActivity.displayActivity(this);
                break;
            case R.id.buttonStudents:
                StudentsActivity.displayActivity(this);
=======
                StudentsActivity.displayActivity(this);
                break;
            case R.id.buttonStudents:
                GroupActivity.displayActivity(this);
>>>>>>> 2d1ccc516daf91d9e0a509824c0a1ff72be6150d
                break;
        }
    }
}
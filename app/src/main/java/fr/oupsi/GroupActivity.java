package fr.oupsi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class GroupActivity extends EpsiActivity implements View.OnClickListener {

    public static void displayActivity(EpsiActivity activity){
        Intent intent=new Intent(activity, GroupActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        setTitle("Infos");
        showBack();

        findViewById(R.id.buttonJohanna).setOnClickListener(this);
        findViewById(R.id.buttonCamille).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonJohanna:
                StudentsActivity.displayActivity(this);
                break;
            case R.id.buttonCamille:
                StudentsActivity.displayActivity(this);
                break;
        }
    }
}
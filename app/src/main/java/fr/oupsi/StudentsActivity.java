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

public class StudentsActivity extends EpsiActivity implements View.OnClickListener {

    public static void displayActivity(EpsiActivity activity){
        Intent intent=new Intent(activity,StudentsActivity.class);
        activity.startActivity(intent);
    }
    private ArrayList<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        setTitle("Infos");
        showBack();
        students=new ArrayList<>();

        Student johanna = new Student("johanna.png", "Jato", "Johanna", "johanna.jato@epsi.fr", "DevOps Groupe 1", "https://github.com/Johanna1506");
        students.add(johanna);
        Student camille = new Student("camille.png", "Jouan", "Camille", "camille.jouan@epsi.fr", "DevOps Groupe 1", "https://github.com/Ca-Jou");
        students.add(camille);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonJohanna:
                HomeActivity.displayActivity(this);
                break;
            case R.id.buttonCamille:
                HomeActivity.displayActivity(this);
                break;
        }
    }
}
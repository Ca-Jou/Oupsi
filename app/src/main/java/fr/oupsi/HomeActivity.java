package fr.oupsi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends EpsiActivity implements View.OnClickListener {

    String urlNature= "https://www.slate.fr/sites/default/files/styles/1060x523/public/lukasz-szmigiel-jfcviyfycus-unsplash.jpg";
    String urlEspace= "https://www.entreprendre.fr/wp-content/uploads/AdobeStock_2015532431.jpg";

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
                ImageActivity.displayActivity(this,urlNature,"Produit");
                break;
            case R.id.buttonStudents:
                ImageActivity.displayActivity(this,urlEspace,"Student");
                break;
        }
    }
}
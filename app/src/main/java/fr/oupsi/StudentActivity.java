package fr.oupsi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class StudentActivity extends EpsiActivity {
    public static void displayActivity(EpsiActivity activity,String firstName){
        Intent intent = new Intent(activity,StudentActivity.class);
        intent.putExtra("firstName",firstName);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        showBack();

        String firstName = getIntent().getExtras().getString("firstName","");

        setTitle(firstName);

        TextView textView = findViewById(R.id.textViewName);
        textView.setText(firstName);

    }
}

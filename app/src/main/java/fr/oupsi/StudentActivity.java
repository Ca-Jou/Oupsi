package fr.oupsi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class StudentActivity extends EpsiActivity {
    public static void displayActivity(EpsiActivity activity,String firstName, String lastName, String group, String email, String url, String avatar){
        Intent intent = new Intent(activity,StudentActivity.class);
        intent.putExtra("firstName",firstName);
        intent.putExtra("lastName",lastName);
        intent.putExtra("group",group);
        intent.putExtra("email",email);
        intent.putExtra("url",url);
        intent.putExtra("avatar",avatar);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        showBack();

        String avatar = getIntent().getExtras().getString("avatar","");
        ImageView imageViewAvatar = findViewById(R.id.imageViewAvatar);
//        imageViewAvatar.setImageResource(R.drawable.johanna);
        Picasso.get().load(avatar).into(imageViewAvatar);

        String firstName = getIntent().getExtras().getString("firstName","");
        String lastName = getIntent().getExtras().getString("lastName","");
        String fullName = firstName + " " + lastName;

        TextView textViewName = findViewById(R.id.textViewName);
        textViewName.setText(fullName);

        String group = getIntent().getExtras().getString("group","");
        TextView textViewGroup = findViewById(R.id.textViewGroup);
        textViewGroup.setText(group);

        String email = getIntent().getExtras().getString("email","");
        TextView textViewEmail = findViewById(R.id.textViewEmail);
        textViewEmail.setText(email);

        String url = getIntent().getExtras().getString("url","");
        TextView textViewUrl = findViewById(R.id.textViewUrl);
        textViewUrl.setText(url);

        setTitle(firstName);
    }
}

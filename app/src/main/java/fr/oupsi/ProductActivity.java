package fr.oupsi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class ProductActivity extends EpsiActivity {
    public static void displayActivity(EpsiActivity activity,String url,String name, String description){
        Intent intent = new Intent(activity,ProductActivity.class);
        intent.putExtra("url",url);
        intent.putExtra("name",name);
        intent.putExtra("description",description);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        showBack();

        String url = getIntent().getExtras().getString("url","");
        String name = getIntent().getExtras().getString("name","");
        String description = getIntent().getExtras().getString("description","");

        setTitle(name);

        TextView textView = findViewById(R.id.textViewDescription);
        textView.setText(description);
        ImageView imageView = findViewById(R.id.image);
        Picasso.get().load(url).into(imageView);

    }
}

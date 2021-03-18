package fr.oupsi;

import android.content.Intent;

public class HomeActivity {

    public static void displayActivity(EpsiActivity activity){
        Intent intent = new Intent(activity,HomeActivity.class);
        activity.startActivity(intent);
    }
}

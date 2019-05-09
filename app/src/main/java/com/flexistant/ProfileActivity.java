package com.flexistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void changePassword() {
        // direct user to change login activity
    }

    public void goToOverview() {
        // direct the person to his personal overview
    }
}

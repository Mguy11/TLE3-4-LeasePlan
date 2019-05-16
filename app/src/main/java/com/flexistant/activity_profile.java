package com.flexistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button button_changePassword = findViewById(R.id.button_changePassword);
        button_changePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChangeLoginActivity();
            }
        });

        Button button_goToOverview = findViewById(R.id.button_goToOverview);
        button_goToOverview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOverviewActivity();
            }
        });
    }

    public void openChangeLoginActivity() {
        Intent intent = new Intent(this, activity_change_login.class);
        startActivity(intent);
    }

    public void openOverviewActivity() {
        Intent intent = new Intent(this, overzicht_auto.class);
        startActivity(intent);
    }
}


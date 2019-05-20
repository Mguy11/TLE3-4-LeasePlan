package com.flexistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_login extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = findViewById(R.id.button_signIn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        button = findViewById(R.id.button_forgotten);
        button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openChangeLoginActivity();
           }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openChangeLoginActivity() {
        Intent intent = new Intent(this, activity_change_login.class);
        startActivity(intent);
    }
}

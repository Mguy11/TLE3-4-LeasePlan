package com.flexistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void logIn() {
        // login knop wordt geklikt, en wanneer de log in succesvol is, stuurt de gebruiker
        // naar mainactivity
    }

    public void forgotPassword() {
        // forgot password knop wodt geklikt, en stuurt de gebruiker naar change login activity
        // waar de gebruiker zijn wachtwoord aan kan passen
    }
}

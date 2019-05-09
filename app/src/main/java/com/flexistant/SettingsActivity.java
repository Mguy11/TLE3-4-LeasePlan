package com.flexistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void settingsSyncAgenda() {
        // boolean to toggle wether the app is allowed to access user's google calendar
    }

    public void settingsSyncEmail() {
        // boolean to toggle weather the appp is allowed to access user's email
    }

    public void settingsSyncGoogleActivity() {
        // boolean to toggle weather the appp is allowed to access user's google activities
    }

    public void settingsConnentGoogleHome() {
        // boolean to toggle weather the appp is allowed to access user's google home
    }

    public void settingsNightmode() {
        // boolean to toggle nightmode (true = nightmode is active)
    }

    public void settingsCarSettings() {
        // links user to car settings overview
    }

    public void settingsAccessabilitySettings() {
        // links user to accessability
    }

    public void settingsDeleteProfile() {
        // deletes user's profile
    }

    public void settingsShareApp() {
        // prompts user to an inferface with a selection of saved contacts
    }
}

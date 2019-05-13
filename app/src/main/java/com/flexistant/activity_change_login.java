package com.flexistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activity_change_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_login);
    }


    public void passwordChanged() {
        // wanneer de gebruiker de save knop indrukt, en beide wachtwoorden overeen komen, dan wordt
        // de het wachtwoord van de gebruiker aangepast, en wordt hij naar of de login activity
        // gestuurt waar hij opnieuw moet inloggen, of meteen, ingelogd, naar main activity
    }
}

package com.flexistant;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,GoogleApiClient.OnConnectionFailedListener {

    private  SignInButton btnGoogleLogin;
    private  GoogleApiClient googleApiClient;
    private static final int REQ_CODE = 9001;
    private TextView tvLoginSuccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGoogleLogin = (SignInButton) findViewById(R.id.btnGoogleLogin);
        //Replace for textfield Login succeed
       // tvLoginSuccess = (TextView) findViewById(R.id.tvLoginSuccess);

        btnGoogleLogin.setOnClickListener(this);

        tvLoginSuccess.setVisibility(View.GONE);

        GoogleSignInOptions signInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        googleApiClient = new GoogleApiClient.Builder(this).enableAutoManage(this,this).addApi(Auth.GOOGLE_SIGN_IN_API,signInOptions).build();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnGoogleLogin:
                signIn();
                break;
        }


    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    private void signIn(){
        Intent intent = Auth.GoogleSignInApi.getSignInIntent(googleApiClient);
        startActivityForResult(intent,REQ_CODE);
    }

    private void signOut(){

    }

    private void handleResult(GoogleSignInResult result){

        if(result.isSuccess()){
            GoogleSignInAccount account = result.getSignInAccount();
            //String name = account.getDisplayName();
            String email = account.getEmail();
            //String imgUrl = account.getPhotoUrl().toString();
            tvLoginSuccess.setText(email);
            updateUI(true);
        }
        else{
            updateUI(false);
        }

    }

    private void updateUI(boolean isLogin){
        if(isLogin){
            tvLoginSuccess.setVisibility(View.VISIBLE);
            btnGoogleLogin.setVisibility(View.GONE);
        }
        else{
            tvLoginSuccess.setVisibility(View.GONE);
            btnGoogleLogin.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQ_CODE){
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            handleResult(result);
        }
    }
}


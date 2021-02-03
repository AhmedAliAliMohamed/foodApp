package com.example.foodapp.ui.signInUp;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodapp.R;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

public class GoogleLoginController implements GoogleApiClient.OnConnectionFailedListener,GoogleApiClient.ConnectionCallbacks{

    private static GoogleLoginController GOOGLE_SIGN_IN;
    private static final String TAG = "GoogleActivity";
    private Context context;
    private GoogleSignInOptions gso;
    public static final int RC_SIGN_IN = 1;
    private GoogleApiClient mGoogleApiClient;



    public GoogleLoginController(Context context) {
        this.context = context;
    }

    public static GoogleLoginController getInstance(Context context) {
        if (GOOGLE_SIGN_IN == null) {
            GOOGLE_SIGN_IN = new GoogleLoginController(context);
        }

        return GOOGLE_SIGN_IN;
    }

    public void initializeApiClient() {
         gso = new GoogleSignInOptions
                 .Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                 .build();
        mGoogleApiClient = new GoogleApiClient.Builder(context).enableAutoManage((AppCompatActivity)context
                ,this::onConnectionFailed)
                .addApi(Auth.GOOGLE_SIGN_IN_API,gso).build();
    }

    public void makeGoogleLoggeedIn()
    {
        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
        ((AppCompatActivity)context).startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Toast.makeText(context, "Google Play Services error.", Toast.LENGTH_SHORT).show();
    }

    public void signOut() {
        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
            mGoogleApiClient.stopAutoManage((AppCompatActivity)context);
            mGoogleApiClient.disconnect();
        }
    }


    @Override
    public void onConnected(@Nullable Bundle bundle) {
        Toast.makeText(context, "Gplus connected", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onConnectionSuspended(int i) {
        Toast.makeText(context, "Gplus connection suspended", Toast.LENGTH_SHORT).show();
    }
}

package com.example.foodapp.ui.signInUp;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.foodapp.R;
import com.example.foodapp.services.SharedPrefManager;
import com.example.foodapp.ui.home.Home;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class GoogleLoginController{

    private static GoogleLoginController GOOGLE_SIGN_IN;
    private Context context;
    private GoogleSignInClient mGoogleSignInClient;
    private FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
    private GoogleSignInOptions gso;
    private static final String TAG = "GoogleActivity";
    public static final int RC_SIGN_IN = 9001;
    private static final String STATUS_GOOGLE ="GOOGLE";



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
         gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(context.getString(R.string.default_web_client_id))
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient((AppCompatActivity) context,gso);
    }

    protected void makeGoogleLoggeedIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        ((AppCompatActivity) context).startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    public void checkLogin(Intent data) {
        Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
        try {
            GoogleSignInAccount account = task.getResult(ApiException.class);
            Log.d("Ahmed Ali Mohamed", "firebaseAuthWithGoogle:" + account.getId());
            String image = String.valueOf(account.getPhotoUrl());
            createShared(account.getId(),account.getIdToken(),account.getDisplayName(),account.getEmail(),image);
            firebaseAuthWithGoogle(account.getIdToken());

        } catch (ApiException e) {
            Toast.makeText(context, "Google sign in failed", Toast.LENGTH_SHORT).show();
            updateUI(null);
        }
    }

    public void firebaseAuthWithGoogle(String idToken) {
        AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener((AppCompatActivity) context, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Log.d("Ahmed Ali Mohamed", "signInWithCredential:success");
                            FirebaseUser user = firebaseAuth.getCurrentUser();
                            updateUI(user);
                            context.startActivity(new Intent(context.getApplicationContext(),Home.class));
                            ((AppCompatActivity) context).finish();
                        } else {
                            Log.w("Ahmed Ali Mohamed", "signInWithCredential:failure", task.getException());
                            updateUI(null);

                        }
                    }
                });
    }

    public void signOut() {
        firebaseAuth.signOut();
        mGoogleSignInClient.signOut().addOnCompleteListener((AppCompatActivity) context
                , new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {

                    }
                });
    }

    public void revokeAccess(){
        firebaseAuth.signOut();
        mGoogleSignInClient.revokeAccess().addOnCompleteListener((AppCompatActivity) context
                , new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {


            }
        });
    }

    public void onStart(){
        FirebaseUser user = firebaseAuth.getCurrentUser();
        updateUI(user);
    }

    public void updateUI(FirebaseUser user){
        if (user != null){
            Toast.makeText(context, ""+user.getEmail(), Toast.LENGTH_SHORT).show();
            Toast.makeText(context, ""+user.getDisplayName(), Toast.LENGTH_SHORT).show();
            Toast.makeText(context, ""+user.getPhotoUrl(), Toast.LENGTH_SHORT).show();
        }
    }

    public void createShared(String userId ,String tokenId ,String userName ,String userEmail,String userImage){
        if (userId != null || tokenId !=null || userName !=null || userImage !=null){
            SharedPrefManager.getInstance().getSharedPref(context);
            SharedPrefManager.getInstance().setUserIdVal(context,userId);
            SharedPrefManager.getInstance().setUserToken(context,tokenId);
            SharedPrefManager.getInstance().setUserName(context,userName);
            SharedPrefManager.getInstance().setUserImage(context,userImage);
            SharedPrefManager.getInstance().setUserEmail(context,userEmail);
            SharedPrefManager.getInstance().setStatus(context,STATUS_GOOGLE);
        }else {
            SharedPrefManager.getInstance().getSharedPref(context);
            SharedPrefManager.getInstance().setUserIdVal(context,null);
            SharedPrefManager.getInstance().setUserToken(context,null);
            SharedPrefManager.getInstance().setUserName(context,null);
            SharedPrefManager.getInstance().setUserImage(context,null);
            SharedPrefManager.getInstance().setUserEmail(context,null);
            SharedPrefManager.getInstance().setStatus(context,null);
        }

    }




}
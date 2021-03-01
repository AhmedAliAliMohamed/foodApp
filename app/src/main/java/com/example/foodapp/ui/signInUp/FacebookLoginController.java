package com.example.foodapp.ui.signInUp;


import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodapp.R;
import com.example.foodapp.services.SharedPrefManager;


import com.example.foodapp.ui.home.Home;
import com.facebook.CallbackManager;

import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.Collections;


public class FacebookLoginController {
    private Context context;
    private CallbackManager callbackManager;
    private static FacebookLoginController FACEBOOK_SIGN_IN;
    private FirebaseAuth firebaseAuth ;
    private static final String EMAIL = "email";
    private static final String STATUS_FACEBOOK ="FACE_BOOK";
    private View v;

    public FacebookLoginController(Context context) {
        this.context = context;
    }

    public static FacebookLoginController getInstance(Context mcontext){

        if (FACEBOOK_SIGN_IN == null){
            FACEBOOK_SIGN_IN = new FacebookLoginController(mcontext);
        }
        return FACEBOOK_SIGN_IN;
    }

    public void getCallbackManager() {
        callbackManager = CallbackManager.Factory.create();
    }

    public void callManagerOnActivityResult(int requestCode , int resultCode , Intent data){
        callbackManager.onActivityResult(requestCode,resultCode,data);
    }

    protected void getTokenId(){
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         v = inflater.inflate(R.layout.activity_sign_in, null);
        LoginButton facebookButton = v.findViewById(R.id.login_button_facebook);
        facebookButton.setReadPermissions(Collections.singletonList(EMAIL));
        facebookButton.performClick();
        facebookButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                String token = loginResult.getAccessToken().getToken();
                firebaseAuthWithFacebook(token);
            }
            @Override
            public void onCancel() {
            }
            @Override
            public void onError(FacebookException error) {
                Snackbar snackbar = Snackbar
                        .make(v, ""+error.getMessage(), Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });

    }
    public void firebaseAuthWithFacebook(String token){
        firebaseAuth = FirebaseAuth.getInstance();
        AuthCredential credential = FacebookAuthProvider.getCredential(token);
        firebaseAuth.signInWithCredential(credential).addOnCompleteListener((AppCompatActivity) context
                , new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            FirebaseUser user = firebaseAuth.getCurrentUser();
                            updateUI(user);
                            String image = String.valueOf(user.getPhotoUrl());
                            createShared(user.getUid(),token,user.getDisplayName(),user.getEmail(), image);
                            context.startActivity(new Intent(context.getApplicationContext(), Home.class));
                             ((AppCompatActivity) context).finish();

                        }else {
                            Snackbar snackbar = Snackbar
                                    .make(v, ""+task.getException(), Snackbar.LENGTH_LONG);
                            snackbar.show();
                            updateUI(null);
                        }

                    }
                });
    }

    public void updateUI(FirebaseUser user) {
        if (user !=null){
        }
    }

    public void onStart(){
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        updateUI(currentUser);

    }

    public void createShared(String userId, String tokenId, String userName, String userEmail, String userImage){
        if (userId != null || tokenId !=null || userName !=null || userImage !=null){
            SharedPrefManager.getInstance().getSharedPref(context);
            SharedPrefManager.getInstance().setUserIdVal(context,userId);
            SharedPrefManager.getInstance().setUserToken(context,tokenId);
            SharedPrefManager.getInstance().setUserName(context,userName);
            SharedPrefManager.getInstance().setUserImage(context,userImage);
            SharedPrefManager.getInstance().setUserEmail(context,userEmail);
            SharedPrefManager.getInstance().setStatus(context,STATUS_FACEBOOK);
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

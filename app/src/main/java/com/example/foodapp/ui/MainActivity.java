package com.example.foodapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


import com.example.foodapp.R;
import com.example.foodapp.databinding.ActivityMainBinding;
import com.example.foodapp.services.SharedPrefManager;
import com.example.foodapp.ui.home.Home;
import com.example.foodapp.ui.signInUp.FacebookLoginController;
import com.example.foodapp.ui.signInUp.GoogleLoginController;
import com.example.foodapp.ui.signInUp.SignIn;
import com.example.foodapp.ui.signInUp.ViewModelForSign;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private Animation animation;
    private ViewModelForSign viewModelForSign;
    private String status;
    private String tokenId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        status = SharedPrefManager.getInstance().getSharedPref(this).getString(SharedPrefManager.getStatus(),"");
        tokenId =SharedPrefManager.getInstance().getSharedPref(this).getString(SharedPrefManager.getUserTokenId(),"");


        animation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        activityMainBinding.iamgeSvgLogo.startAnimation(animation);
        animation = AnimationUtils.loadAnimation(this, R.anim.side_down);
        activityMainBinding.textLogoMain.startAnimation(animation);
        progressBarHandel();

    }

    private void progressBarHandel() {
        activityMainBinding.textLogoMain.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (status == null || status.isEmpty()){
                Intent intent = new Intent(MainActivity.this, SignIn.class);
                    startActivity(intent);
                    finish();
                }else {
                    signIn();
                }
            }
        },6000);

    }

    private void signIn() {
        if (status.equals("FACE_BOOK")) {
            FacebookLoginController.getInstance(this).firebaseAuthWithFacebook(tokenId);
        }else if (status.equals("GOOGLE")){
            GoogleLoginController.getInstance(this).firebaseAuthWithGoogle(tokenId);
        }else if (status.equals("NORMAL")){
            String email = SharedPrefManager.getInstance().getSharedPref(this).getString(SharedPrefManager.getUserEmail(),"");
            String password = SharedPrefManager.getInstance().getSharedPref(this).getString(SharedPrefManager.getPassword(),"");
            viewModelForSign = ViewModelProviders.of(this).get(ViewModelForSign.class);
            viewModelForSign.signIn(email,password);
            viewModelForSign.getUserLiveData().observe(this, new Observer<FirebaseUser>() {
                @Override
                public void onChanged(FirebaseUser firebaseUser) {
                    if (firebaseUser == null){
                        startActivity(new Intent(MainActivity.this , SignIn.class));
                        finish();
                    }else if (firebaseUser != null){
                    startActivity(new Intent(MainActivity.this , Home.class));
                    finish();
                    }
                }
            });
        }

    }
}
package com.example.foodapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.foodapp.R;
import com.example.foodapp.databinding.ActivityMainBinding;
import com.example.foodapp.ui.signInUp.SignIn;
import com.example.foodapp.ui.signInUp.ViewModelForSign;

import static com.daimajia.androidanimations.library.Techniques.FadeIn;
import static com.daimajia.androidanimations.library.Techniques.StandUp;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private Animation animation;
    private ViewModelForSign viewModelForSign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);


        animation = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        activityMainBinding.iamgeSvgLogo.startAnimation(animation);

        animation = AnimationUtils .loadAnimation(this,R.anim.side_down);
        activityMainBinding.textLogoMain.startAnimation(animation);




    }

    private void signIn(){


    }
}
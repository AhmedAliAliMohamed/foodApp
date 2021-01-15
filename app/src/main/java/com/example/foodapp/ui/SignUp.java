package com.example.foodapp.ui;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.foodapp.R;
import com.example.foodapp.databinding.ActivitySignUpBinding;
import com.example.foodapp.ui.viewmodels.ViewModelForSign;
import com.google.firebase.auth.FirebaseUser;

import java.io.FileNotFoundException;
import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {
    private ActivitySignUpBinding activitySignUpBinding ;
    private ViewModelForSign viewModelForSign;
    private int PICK_IMAGE_REQUEST =22;
    private Uri filePath;
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" + ".{8,20}");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       activitySignUpBinding = DataBindingUtil.setContentView(this,R.layout.activity_sign_up);
        viewModelForSign = ViewModelProviders.of(this).get(ViewModelForSign.class);
       intentForgetImage();
       clickToSingUp();
    }

    // Go to Gallery
    private void intentForgetImage() {
      activitySignUpBinding.fab.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if (Build.VERSION.SDK_INT < 19) {
                  Intent uploadImage = new Intent();
                  uploadImage.setType("image/*");
                  uploadImage.setAction(Intent.ACTION_GET_CONTENT);
                  startActivityForResult(Intent.createChooser(uploadImage, "Select Image from here..."), PICK_IMAGE_REQUEST);
              } else {
                  Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
                  intent.addCategory(Intent.CATEGORY_OPENABLE);
                  intent.setType("image/*");
                  startActivityForResult(intent, PICK_IMAGE_REQUEST);
              }
          }
      });
    }

    //  Show Photo
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null){
            filePath = data.getData();
            try {
                Bitmap bitmap = MediaStore
                        .Images
                        .Media
                        .getBitmap(getContentResolver(),filePath);
                activitySignUpBinding.iamgeUserRegistration.setImageBitmap(bitmap);
            }catch (FileNotFoundException e){
                Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();

            }catch (Exception e){
                Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();

            }
        }
    }

    //signUp Click
    private void clickToSingUp(){
            activitySignUpBinding.btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email = activitySignUpBinding.textUsernameInputRegistration.getEditText().getText().toString();
                String password = activitySignUpBinding.textConfirmPasswordInputRegistration.getEditText().getText().toString();
                String configPassword = activitySignUpBinding.textConfirmPasswordInputRegistration.getEditText().getText().toString();
            if (email.isEmpty() || password.isEmpty() || configPassword.isEmpty() ){
                activitySignUpBinding.textUsernameEditText.setError("This field is required");
                activitySignUpBinding.textPasswordEditTextRegistration.setError("This field is required");
                activitySignUpBinding.textConfirmPasswordEditTextRegistration.setError("This field is required");
            }
            else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches() || !PASSWORD_PATTERN.matcher(password).matches() ){
                    activitySignUpBinding.textUsernameEditText.setError("Please enter the email correctly");
                    activitySignUpBinding.textPasswordEditTextRegistration.setError("The total password you entered is less than 8");
            }else if (!configPassword.matches(password)){
                activitySignUpBinding.textConfirmPasswordEditTextRegistration.setError("This password not match ");
            }
            else if(filePath == null){
                Toast.makeText(SignUp.this, "chose photo please", Toast.LENGTH_SHORT).show();
            }
            else {
                activitySignUpBinding.textUsernameEditText.setError(null);
                activitySignUpBinding.textPasswordEditTextRegistration.setError(null);
                activitySignUpBinding.textConfirmPasswordEditTextRegistration.setError(null);
                activitySignUpBinding.progressCircularRegistration.setVisibility(View.VISIBLE);
                activitySignUpBinding.btnRegistration.setVisibility(View.GONE);
                viewModelForSign.signUp(email,password);
                viewModelForSign.getUserLiveData().observe(SignUp.this, new Observer<FirebaseUser>() {
                    @Override
                    public void onChanged(FirebaseUser firebaseUser) {
                        String userId = firebaseUser.getUid();
                        Toast.makeText(SignUp.this, ""+userId , Toast.LENGTH_SHORT).show();
                        uploadImages(userId , filePath);
                    }
                });
                activitySignUpBinding.progressCircularRegistration.setVisibility(View.GONE);
                activitySignUpBinding.btnRegistration.setVisibility(View.VISIBLE);

            }

            }
        });
    }


    public void  uploadImages(String userId ,Uri fileImage){
        viewModelForSign.setUploadImage(userId,fileImage);
        viewModelForSign.getUploadImage().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Toast.makeText(SignUp.this, ""+s, Toast.LENGTH_SHORT).show();

            }
        });
    }


}
package com.example.foodapp.ui.signInUp;

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
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.foodapp.R;
import com.example.foodapp.databinding.ActivitySignUpBinding;
import com.google.firebase.auth.FirebaseUser;

import java.io.FileNotFoundException;
import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {
    private ActivitySignUpBinding activitySignUpBinding;
    private ViewModelForSign viewModelForSign;
    private int PICK_IMAGE_REQUEST = 22;
    private Uri filePath;
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" + ".{8,20}");
    private String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySignUpBinding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up);
        viewModelForSign = ViewModelProviders.of(this).get(ViewModelForSign.class);
        intentForgetImage();
        clickToSingUp();
    }

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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null) {
            filePath = data.getData();
            try {
                Bitmap bitmap = MediaStore
                        .Images
                        .Media
                        .getBitmap(getContentResolver(), filePath);
                activitySignUpBinding.iamgeUserRegistration.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                Toast.makeText(this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();

            } catch (Exception e) {
                Toast.makeText(this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void clickToSingUp() {
        activitySignUpBinding.btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPhoto();
            }
        });
    }

    private void checkPhoto() {
        if (filePath == null) {
            Toast.makeText(SignUp.this, "First chose photo please", Toast.LENGTH_SHORT).show();
        } else {
            checkEmailAndPassword();
        }
    }

    private void checkEmailAndPassword() {
        String email = activitySignUpBinding.textUsernameInputRegistration.getEditText().getText().toString();
        String password = activitySignUpBinding.textPasswordInputRegistration.getEditText().getText().toString();
        String configPassword = activitySignUpBinding.textConfirmPasswordInputRegistration.getEditText().getText().toString();
        activitySignUpBinding.progressCircularRegistration.setVisibility(View.VISIBLE);
        activitySignUpBinding.btnRegistration.setVisibility(View.GONE);
        if (email.isEmpty() || password.isEmpty() || configPassword.isEmpty()) {
            activitySignUpBinding.textUsernameInputRegistration.setHelperText("This field is required");
            activitySignUpBinding.textPasswordInputRegistration.setHelperText("This field is required");
            activitySignUpBinding.textConfirmPasswordInputRegistration.setHelperText("This field is required");
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            activitySignUpBinding.textUsernameInputRegistration.setHelperText("Please enter the email correctly");
        } else if (!PASSWORD_PATTERN.matcher(password).matches()) {
            activitySignUpBinding.textConfirmPasswordInputRegistration.setHelperText("The total password you entered is less than 8");
        } else if (!configPassword.matches(password)) {
            activitySignUpBinding.textConfirmPasswordInputRegistration.setHelperText("This password not match");
        } else {
            activitySignUpBinding.textUsernameInputRegistration.setHelperText(null);
            activitySignUpBinding.textPasswordInputRegistration.setHelperText(null);
            activitySignUpBinding.textConfirmPasswordInputRegistration.setHelperText(null);
            viewModelForSign.signUp(email, password);
            viewModelForSign.getUserLiveData().observe(SignUp.this, new Observer<FirebaseUser>() {
                @Override
                public void onChanged(FirebaseUser firebaseUser) {
                    if (firebaseUser != null){
                        userId = firebaseUser.getUid();
                        uploadImages(userId, filePath);
                       startActivity(new Intent(SignUp.this,SignIn.class));
                       finish();
                    }else {
                        Toast.makeText(SignUp.this, "ahmed ali ali ali ali ali ali", Toast.LENGTH_SHORT).show();
                        activitySignUpBinding.progressCircularRegistration.setVisibility(View.GONE);
                        activitySignUpBinding.btnRegistration.setVisibility(View.VISIBLE);}
                }
            });

        }

    }

    public void uploadImages(String userId, Uri fileImage) {
        viewModelForSign.setUploadImage(userId, fileImage);
        viewModelForSign.getUploadImage().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Toast.makeText(SignUp.this, "Image is uploaded", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
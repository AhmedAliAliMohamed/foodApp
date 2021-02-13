package com.example.foodapp.ui.signInUp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.foodapp.R;
import com.example.foodapp.databinding.ActivitySignInBinding;
import com.example.foodapp.services.SharedPrefManager;
import com.example.foodapp.ui.home.Home;
import com.google.firebase.auth.FirebaseUser;

import java.util.regex.Pattern;

public class SignIn extends AppCompatActivity {

    private ActivitySignInBinding activitySignInBinding;
    private ViewModelForSign viewModelForSign;
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^" + ".{8,20}");
    private static final String STATUS_SIGN_IN = "NORMAL_SIGN_IN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySignInBinding = DataBindingUtil.setContentView(this, R.layout.activity_sign_in);
        viewModelForSign = ViewModelProviders.of(this).get(ViewModelForSign.class);
        clickToSingIn();
        goToSignUp();
        signInGoogle();
        signInFacebook();
        GoogleLoginController.getInstance(SignIn.this).initializeApiClient();
        FacebookLoginController.getInstance(this).getCallbackManager();
    }

    private void clickToSingIn() {
        activitySignInBinding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = activitySignInBinding.textUsernameInput.getEditText().getText().toString();
                String password = activitySignInBinding.textPasswordInput.getEditText().getText().toString();
                if (email.isEmpty() || password.isEmpty()) {
                    activitySignInBinding.textUsernameEditText.setError("This field is required");
                    activitySignInBinding.textPasswordEditText.setError("This field is required");
                } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    activitySignInBinding.textUsernameEditText.setError("Please enter the email correctly");
                } else if (!PASSWORD_PATTERN.matcher(password).matches()) {
                    activitySignInBinding.textPasswordEditText.setError("The total password you entered is less than 8");
                } else {
                    activitySignInBinding.textUsernameEditText.setError(null);
                    activitySignInBinding.textPasswordEditText.setError(null);
                    viewModelForSign.signIn(email, password);
                    viewModelForSign.getUserLiveData().observe(SignIn.this, new Observer<FirebaseUser>() {
                        @Override
                        public void onChanged(FirebaseUser firebaseUser) {
                            activitySignInBinding.progressCircularLogin.setVisibility(View.VISIBLE);
                            activitySignInBinding.btnLogin.setVisibility(View.GONE);
                            if (firebaseUser != null) {
                                startActivity(new Intent(SignIn.this, Home.class));
                                finish();
                                String image = String.valueOf(firebaseUser.getPhotoUrl());
                                rememberMe(firebaseUser.getUid(),email,password, image);
                            } else {
                                Log.d("Ahmed", "Login Login Failure:");
                                activitySignInBinding.progressCircularLogin.setVisibility(View.GONE);
                                activitySignInBinding.btnLogin.setVisibility(View.VISIBLE);
                            }
                        }
                    });
                }
            }
        });
    }

    private void goToSignUp() {
        activitySignInBinding.textCreateNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToSignUp = new Intent(SignIn.this, SignUp.class);
                startActivity(intentToSignUp);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        FacebookLoginController.getInstance(this).callManagerOnActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == GoogleLoginController.RC_SIGN_IN) {
            GoogleLoginController.getInstance(this).checkLogin(data);
        }
    }

    private void signInGoogle() {
        activitySignInBinding.signInGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoogleLoginController.getInstance(SignIn.this).makeGoogleLoggeedIn();
            }
        });
    }

    private void signInFacebook() {
        activitySignInBinding.fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FacebookLoginController.getInstance(SignIn.this).getTokenId();
            }
        });

    }

    private void rememberMe(String userId, String userEmail,String password, String userImage) {
        activitySignInBinding.checkboxRemember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    SharedPrefManager.getInstance().getSharedPref(SignIn.this);
                    SharedPrefManager.getInstance().setUserIdVal(SignIn.this, userId);
                    SharedPrefManager.getInstance().setUserImage(SignIn.this, userImage);
                    SharedPrefManager.getInstance().setUserEmail(SignIn.this,userEmail);
                    SharedPrefManager.getInstance().setPassword(SignIn.this,password);
                    SharedPrefManager.getInstance().setStatus(SignIn.this,STATUS_SIGN_IN);
                    Toast.makeText(SignIn.this, "احمد علي علي", Toast.LENGTH_SHORT).show();
                } else {
                    SharedPrefManager.getInstance().getSharedPref(SignIn.this);
                    SharedPrefManager.getInstance().setUserIdVal(SignIn.this, null);
                    SharedPrefManager.getInstance().setUserImage(SignIn.this, null);
                    SharedPrefManager.getInstance().setUserEmail(SignIn.this,null);
                    SharedPrefManager.getInstance().setPassword(SignIn.this,null);
                    SharedPrefManager.getInstance().setStatus(SignIn.this,null);
                    Toast.makeText(SignIn.this, "علي علي هلي", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
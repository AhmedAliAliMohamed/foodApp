package com.example.foodapp.ui.signInUp;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;

import android.util.Patterns;
import android.view.View;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.foodapp.R;
import com.example.foodapp.databinding.ActivitySignInBinding;
import com.example.foodapp.services.ConnectivityReceiver;
import com.example.foodapp.services.SharedPrefManager;
import com.example.foodapp.ui.home.Home;
import com.google.firebase.auth.FirebaseUser;

import java.util.regex.Pattern;

public class SignIn extends AppCompatActivity {

    private ActivitySignInBinding activitySignInBinding;
    private ViewModelForSign viewModelForSign;
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^" + ".{8,20}");
    private static final String STATUS_SIGN_IN = "NORMAL";
    private ConnectivityReceiver connectivityReceiver = new ConnectivityReceiver();

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

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter filter = new IntentFilter(WifiManager.SUPPLICANT_STATE_CHANGED_ACTION);
        this.registerReceiver(connectivityReceiver, filter);
    }

    @Override
    protected void onPause() {
        this.unregisterReceiver(connectivityReceiver);
        super.onPause();
    }

    private void clickToSingIn() {
        activitySignInBinding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onResume();
                String email = activitySignInBinding.textUsernameInput.getEditText().getText().toString();
                String password = activitySignInBinding.textPasswordInput.getEditText().getText().toString();
                rememberMe(email, password);
                if (email.isEmpty() || password.isEmpty()) {
                    activitySignInBinding.textUsernameInput.setHelperText("This field is required");
                    activitySignInBinding.textPasswordInput.setHelperText("This field is required");
                } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    activitySignInBinding.textUsernameInput.setHelperText("Please enter the email correctly");
                } else if (!PASSWORD_PATTERN.matcher(password).matches()) {
                    activitySignInBinding.textPasswordInput.setHelperText("The total password you entered is less than 8");
                } else {
                    activitySignInBinding.textUsernameInput.setHelperText(null);
                    activitySignInBinding.textPasswordInput.setHelperText(null);
                    viewModelForSign.signIn(email, password);
                    viewModelForSign.getUserLiveData().observe(SignIn.this, new Observer<FirebaseUser>() {
                        @Override
                        public void onChanged(FirebaseUser firebaseUser) {
                            activitySignInBinding.progressCircularLogin.setVisibility(View.VISIBLE);
                            activitySignInBinding.btnLogin.setVisibility(View.GONE);
                            if (firebaseUser != null) {
                                startActivity(new Intent(SignIn.this, Home.class));
                                finish();
                            } else {
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

    private void rememberMe(String userEmail, String password) {
        if (activitySignInBinding.checkboxRemember.isChecked()) {
            SharedPrefManager.getInstance().getSharedPref(SignIn.this);
            SharedPrefManager.getInstance().setUserEmail(SignIn.this, userEmail);
            SharedPrefManager.getInstance().setPassword(SignIn.this, password);
            SharedPrefManager.getInstance().setStatus(SignIn.this, STATUS_SIGN_IN);
            Toast.makeText(this, "" + SharedPrefManager.getInstance().getSharedPref(this).getString("STATUS", ""), Toast.LENGTH_SHORT).show();
        } else if (!activitySignInBinding.checkboxRemember.isChecked()) {
            SharedPrefManager.getInstance().getSharedPref(SignIn.this);
            SharedPrefManager.getInstance().setUserEmail(SignIn.this, null);
            SharedPrefManager.getInstance().setPassword(SignIn.this, null);
            SharedPrefManager.getInstance().setStatus(SignIn.this, null);
        }
    }


}
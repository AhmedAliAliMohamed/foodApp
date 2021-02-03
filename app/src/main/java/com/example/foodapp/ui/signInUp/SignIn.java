package com.example.foodapp.ui.signInUp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import com.example.foodapp.R;
import com.example.foodapp.databinding.ActivitySignInBinding;
import com.example.foodapp.ui.home.Home;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.auth.FirebaseUser;

import java.util.regex.Pattern;

public class SignIn extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener {

    private ActivitySignInBinding activitySignInBinding;
    private ViewModelForSign viewModelForSign;
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^" + ".{8,20}");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySignInBinding = DataBindingUtil.setContentView(this, R.layout.activity_sign_in);
        viewModelForSign = ViewModelProviders.of(this).get(ViewModelForSign.class);

        clickToSingIn();
        goToSignUp();
        signInGoogle();
        GoogleLoginController.getInstance(SignIn.this).initializeApiClient();



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
                } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches() || !PASSWORD_PATTERN.matcher(password).matches()) {
                    activitySignInBinding.textUsernameEditText.setError("Please enter the email correctly");
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
                            String userId = firebaseUser.getUid();
                            Toast.makeText(SignIn.this, "" + userId, Toast.LENGTH_SHORT).show();
                        }
                    });
                    activitySignInBinding.progressCircularLogin.setVisibility(View.GONE);
                    activitySignInBinding.btnLogin.setVisibility(View.VISIBLE);

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

    private void signInGoogle(){
        activitySignInBinding.signInGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               GoogleLoginController.getInstance(SignIn.this).makeGoogleLoggeedIn();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == GoogleLoginController.RC_SIGN_IN){
            GoogleSignInResult googleSignInResult = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            if (googleSignInResult.isSuccess()){
                startActivity(new Intent(SignIn.this, Home.class));
                finish();
            }else {
                Toast.makeText(this, "Login failed try again", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
    }

}
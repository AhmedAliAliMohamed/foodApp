package com.example.foodapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import com.example.foodapp.R;
import com.example.foodapp.databinding.ActivitySignInBinding;
import com.example.foodapp.ui.viewmodels.ViewModelForSign;
import com.google.firebase.auth.FirebaseUser;

import java.util.regex.Pattern;

public class SignIn extends AppCompatActivity {

    private ActivitySignInBinding activitySignInBinding ;
    private ViewModelForSign viewModelForSign;
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" + ".{8,20}");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       activitySignInBinding = DataBindingUtil.setContentView(this, R.layout.activity_sign_in);
       clickToSingIn();

    }

    //signUp Click
    private void clickToSingIn(){
        activitySignInBinding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email = activitySignInBinding.textUsernameInput.getEditText().getText().toString();
                String password = activitySignInBinding.textPasswordInput.getEditText().getText().toString();
                if (email.isEmpty() || password.isEmpty()  ){
                    activitySignInBinding.textUsernameEditText.setError("This field is required");
                    activitySignInBinding.textPasswordEditText.setError("This field is required");
                }
                else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches() || !PASSWORD_PATTERN.matcher(password).matches() ){
                    activitySignInBinding.textUsernameEditText.setError("Please enter the email correctly");
                    activitySignInBinding.textPasswordEditText.setError("The total password you entered is less than 8");}

                else {
                    activitySignInBinding.textUsernameEditText.setError(null);
                    activitySignInBinding.textPasswordEditText.setError(null);
                    viewModelForSign.signIn(email,password);
                    viewModelForSign.getUserLiveData().observe(SignIn.this, new Observer<FirebaseUser>() {
                        @Override
                        public void onChanged(FirebaseUser firebaseUser) {
                            activitySignInBinding.progressCircularLogin.setVisibility(View.VISIBLE);
                            activitySignInBinding.btnLogin.setVisibility(View.GONE);
                            String userId = firebaseUser.getUid();
                            Toast.makeText(SignIn.this, ""+userId, Toast.LENGTH_SHORT).show();

                        }
                    });
                    activitySignInBinding.progressCircularLogin.setVisibility(View.GONE);
                    activitySignInBinding.btnLogin.setVisibility(View.VISIBLE);

                }

            }
        });
    }
}
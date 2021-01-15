package com.example.foodapp.ui.viewmodels;

import android.app.Application;
import android.net.Uri;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;


import com.example.foodapp.ui.repo.RepoForSign;

import com.google.firebase.auth.FirebaseUser;

public class ViewModelForSign extends AndroidViewModel {
   private RepoForSign repoForSign;
   private MutableLiveData<FirebaseUser> userLiveData;
   private MutableLiveData<Boolean> loggedOutLiveData;
   private MutableLiveData<String> uploadImage;


    public ViewModelForSign(Application application) {
        super(application);
        repoForSign = new RepoForSign(application);
        userLiveData = repoForSign.getUserLiveData();
        loggedOutLiveData = repoForSign.getLoggedOutLiveData();
        uploadImage = repoForSign.getUploadImage();
    }

    public void signUp(String email, String password) {

        repoForSign.signUp(email,password);

    }

    public void signIn(String email, String password) {
        repoForSign.signIn(email, password);
    }

    public void  logOut(){
        repoForSign.logOut();
    }

    public void setUploadImage(String userId , Uri fileImage){
        repoForSign.uploadImage(userId,fileImage);
    }


    public MutableLiveData<FirebaseUser> getUserLiveData() {
        return userLiveData;
    }

    public MutableLiveData<Boolean> getLoggedOutLiveData() {
        return loggedOutLiveData;
    }

    public MutableLiveData<String> getUploadImage() {
        return uploadImage;
    }
}

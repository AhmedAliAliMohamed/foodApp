package com.example.foodapp.ui.signInUp;

import android.app.Application;
import android.net.Uri;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class RepoForSign {
    private Application application;
    private FirebaseAuth firebaseAuth;
    private FirebaseUser firebaseUser;
    private FirebaseStorage firebaseStorage = FirebaseStorage.getInstance();
    private StorageReference storageReference = firebaseStorage.getReference();
    private DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();

    private MutableLiveData<FirebaseUser> userLiveData;
    private MutableLiveData<Boolean> loggedOutLiveData;
    private MutableLiveData<String> uploadImage;


    public RepoForSign(Application application) {
        this.application = application;
        this.firebaseAuth = FirebaseAuth.getInstance();
        this.userLiveData = new MutableLiveData<>();
        this.loggedOutLiveData = new MutableLiveData<>();
        this.uploadImage = new MutableLiveData<>();

        if (firebaseAuth.getCurrentUser() !=null){
            userLiveData.postValue(firebaseAuth.getCurrentUser());
        }
    }

    public void signUp(String email , String password ){
        firebaseAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            userLiveData.postValue(task.getResult().getUser());
                            firebaseUser = firebaseAuth.getCurrentUser();
                            firebaseUser.sendEmailVerification()
                                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {


                                        }
                                    }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {

                                }
                            });
                        }

                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(application.getApplicationContext(), "SignUp Failure:"+e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void  signIn (String email , String password){
        firebaseAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            if (firebaseUser != null && firebaseAuth.getCurrentUser().isEmailVerified()){
                                userLiveData.postValue(firebaseAuth.getCurrentUser());
                            }
                        }
                        else {
                            Toast.makeText(application.getApplicationContext(), "Login Failure:"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }

                    }
                });
    }

    public void logOut() {
        firebaseAuth.signOut();
        loggedOutLiveData.postValue(true);
    }

    public void uploadImage(final String userId, Uri filePath){
            StorageReference reference = storageReference.child("Users");
            reference.child(userId).child(userId).putFile(filePath)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            downloadImage(userId);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(application.getApplicationContext(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

                }
            });
    }

    public void downloadImage(final String userId){
        storageReference.child("Users").child(userId).child(userId)
                .getDownloadUrl().addOnCompleteListener(new OnCompleteListener<Uri>() {
            @Override
            public void onComplete(@NonNull Task<Uri> task) {
                if (task.isSuccessful()){

                    uploadImage.postValue(task.getResult().toString());
                    String image = uploadImage.getValue();
                    uploadImageInRealtime(image,userId);
                }

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(application.getApplicationContext(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void uploadImageInRealtime(final String fileImage , String userId){
        databaseReference.child("Users").child(userId).child(userId).setValue(fileImage);
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

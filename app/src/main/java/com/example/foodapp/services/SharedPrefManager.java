package com.example.foodapp.services;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.SyncStateContract;

import com.google.firebase.database.core.Constants;

public class SharedPrefManager {

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private static SharedPrefManager SHARED_PREF_MANAGER;
    private static final String USER_ID = "USER_ID";
    private static final String USER_TOKEN_ID = "USER_TOKEN_ID";
    private static final String USER_NAME = "USER_NAME";
    private static final String USER_IMAGE = "USER_IMAGE";
    private static final String USER_EMAIL = "USER_EMAIL";
    private static final  String PASSWORD = "PASSWORD";
    private static final String STATUS ="STATUS";

    public static SharedPrefManager getInstance() {
        if (SHARED_PREF_MANAGER == null) {
            SHARED_PREF_MANAGER = new SharedPrefManager();
        }
        return SHARED_PREF_MANAGER;
    }

    public SharedPreferences getSharedPref(Context mContext){
        pref = mContext.getSharedPreferences(SyncStateContract.Constants.DATA,Context.MODE_PRIVATE);
        return pref;
    }

    public  void setUserIdVal(Context mContext,  String userIdNumber) {
        if (userIdNumber != null){
       editor = getSharedPref(mContext).edit();
       editor.putString(USER_ID,userIdNumber);
       editor.commit();

        }

    }
    
    public void setUserToken(Context mContext, String userTokenNumber){
        if (userTokenNumber != null){
            editor = getSharedPref(mContext).edit();
            editor.putString(USER_TOKEN_ID,userTokenNumber);
            editor.commit();
        }
    }
    
    public void setUserName(Context mContext, String userNameAccount){
        if (userNameAccount != null){
            editor = getSharedPref(mContext).edit();
            editor.putString(USER_NAME,userNameAccount);
            editor.commit();
        }
    }
    
    public void setUserImage(Context mContext , String userImageAccount){
        if (userImageAccount != null){
            editor = getSharedPref(mContext).edit();
            editor.putString(USER_IMAGE , userImageAccount);
            editor.commit();
        }
    }
    
    public void setUserEmail(Context mContext ,String userEmail){
        if (userEmail != null){
            editor = getSharedPref(mContext).edit();
            editor.putString(USER_EMAIL,userEmail);
            editor.commit();
        }
    }
    
    public void setPassword(Context mContext , String password){
        if (password != null){
            editor = getSharedPref(mContext).edit();
            editor.putString(PASSWORD,password);
            editor.commit();
        }
    }
    
    public  void setStatus(Context mContext, String status){
        if (status != null){
            editor = getSharedPref(mContext).edit();
            editor.putString(STATUS,status);
            editor.commit();
        }
    }

    public static String getUserId() {
        return USER_ID;
    }

    public static String getUserTokenId() {
        return USER_TOKEN_ID;
    }

    public static String getUserName() {
        return USER_NAME;
    }

    public static String getUserImage() {
        return USER_IMAGE;
    }
    
    public static String getStatus(){
        return STATUS;
    }

    public static String getUserEmail() {
        return USER_EMAIL;
    }

    public static String getPassword() {
        return PASSWORD;
    }
}

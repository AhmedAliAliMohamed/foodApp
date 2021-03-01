package com.example.foodapp.services;


import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.foodapp.R;

public class AnimationsItems {
    private static AnimationsItems ANIMATIONS;
    private Animation animation;
    private Context context;

    public AnimationsItems(Context context) {
        this.context = context;
    }
    public static AnimationsItems getANIMATIONS(Context context) {
        if (ANIMATIONS == null){
            ANIMATIONS = new AnimationsItems(context);
        }
        return ANIMATIONS;
    }


    public  Animation getAnimationFadeIn(){
        animation = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        return animation;
    }

    public Animation getAnimationSlideDown(){
             animation = AnimationUtils.loadAnimation(context, R.anim.side_down);
     return animation;
    }

    public Animation getAnimationBounce(){
        animation = AnimationUtils.loadAnimation(context, R.anim.bounce);
        return animation;
    }
}

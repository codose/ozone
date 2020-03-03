package com.codose.ozone.views.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.codose.ozone.R;
import com.codose.ozone.views.BaseActivity;
import com.codose.ozone.views.login_register.LoginRegisterActivity;
import com.codose.ozone.views.main.MainActivity;

public class SplashActivity extends BaseActivity {

    private boolean ignoreHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView logo = findViewById(R.id.logo_image);
        Animation heartBeatAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        logo.setAnimation(heartBeatAnim);
        navigateTo();
    }

    private void navigateTo() {
        if(ignoreHandler)
            return;
        new Handler().postDelayed(() ->{
            startActivity(new Intent(getApplicationContext(), LoginRegisterActivity.class));
            finish();
        },3000);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        ignoreHandler = true;
    }

}

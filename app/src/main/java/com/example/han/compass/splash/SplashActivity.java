package com.example.han.compass.splash;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.example.han.compass.MainActivity;
import com.example.han.compass.R;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

//import com.example.han.compass.library.GifImageView;

public class SplashActivity extends AppCompatActivity {
//    private GifImageView gifImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(imageView);
        Glide.with(this).load(R.mipmap.splash).crossFade().into(imageViewTarget);

        Handler hd = new Handler();
        hd.postDelayed(new splashhandler() , 17000);
    }

    private class splashhandler implements Runnable{
        public void run() {
            startActivity(new Intent(getApplication(), MainActivity.class));
            SplashActivity.this.finish();
        }
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        gifView.startAnimation();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        gifView.stopAnimation();
//    }

//    gifImageView.setOnFrameAvailable(new GifImageView.OnFrameAvailable() {
//        @Override
//        public Bitmap onFrameAvailable(Bitmap bitmap) {
//            return blurFilter.blur(bitmap);
//        }
//    });

}

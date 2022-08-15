package com.example.androidanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {
private Button btn;
private ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        im = (ImageView) findViewById(R.id.imageView2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                YoYo.with(Techniques.Tada).duration(1000).repeat(2).playOn(im);
//                YoYo.with(Techniques.Flash).duration(1000).repeat(2).playOn(im);
//                YoYo.with(Techniques.Bounce).duration(1000).repeat(5).playOn(im);
//                YoYo.with(Techniques.Shake).duration(1000).repeat(5).playOn(im);
//                YoYo.with(Techniques.BounceIn).duration(1000).repeat(5).playOn(im);
//                YoYo.with(Techniques.BounceInUp).duration(1000).repeat(5).playOn(im);
//                YoYo.with(Techniques.BounceInDown).duration(1000).repeat(2).playOn(im);
//                YoYo.with(Techniques.DropOut).duration(1000).repeat(2).playOn(im);
//                YoYo.with(Techniques.FadeIn).duration(1000).repeat(5).playOn(im);
//                YoYo.with(Techniques.FadeOut).duration(1000).repeat(5).playOn(im);
//                YoYo.with(Techniques.FlipInX).duration(1000).repeat(5).playOn(im);
//                YoYo.with(Techniques.Hinge).duration(1000).repeat(5).playOn(im);
//                YoYo.with(Techniques.Landing).duration(1000).repeat(2).playOn(im);
//                YoYo.with(Techniques.Pulse).duration(1000).repeat(2).playOn(im);
//                YoYo.with(Techniques.RollIn).duration(1000).repeat(5).playOn(im);
//                YoYo.with(Techniques.RotateOut).duration(1000).repeat(5).playOn(im);
//                YoYo.with(Techniques.SlideInUp).duration(1000).repeat(5).playOn(im);
//                YoYo.with(Techniques.StandUp).duration(1000).repeat(5).playOn(im);
//                YoYo.with(Techniques.TakingOff).duration(1000).repeat(2).playOn(im);
                YoYo.with(Techniques.Wave).duration(1000).repeat(2).playOn(im);
//                YoYo.with(Techniques.Wobble).duration(1000).repeat(5).playOn(im);
//                YoYo.with(Techniques.ZoomIn).duration(1000).repeat(5).playOn(im);
//                YoYo.with(Techniques.ZoomOut).duration(1000).repeat(5).playOn(im);
//                YoYo.with(Techniques.Hinge).duration(1000).repeat(5).playOn(im);




            }
        });
    }
}
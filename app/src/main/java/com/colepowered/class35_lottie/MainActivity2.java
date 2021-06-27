package com.colepowered.class35_lottie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;

public class MainActivity2 extends AppCompatActivity {

    LottieAnimationView animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        animation = findViewById(R.id.lottie_2);

        animation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openActivity1();
            }
        });
    }

    public void openActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
package com.colepowered.class35_lottie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;


public class MainActivity extends AppCompatActivity {

    LottieAnimationView animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animation = findViewById(R.id.lottie_1);

        animation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openActivity2();
            }
        });

    }

    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
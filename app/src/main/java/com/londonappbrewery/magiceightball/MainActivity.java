package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonobj;
        buttonobj =(Button) findViewById(R.id.ask);
        final ImageView imageViewobj;
        imageViewobj = (ImageView) findViewById(R.id.ball_image);


        final int[] drawable={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        buttonobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int num1;
                Random rand0m = new Random();
                num1 =rand0m.nextInt(5);
                imageViewobj.setImageResource(drawable[num1]);


            }
        });

//

    }
}

package com.example.resindriveway;

/**
 * Created by mustafaflexwala on 10/03/18.
 */


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;



public class MainActivity extends AppCompatActivity {


    private DrawingView drawView;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawView = (DrawingView) findViewById(R.id.drawing);

    }

    public void paintClicked(View view){
            //set pattern

        String pattern = view.getTag().toString();

        drawView.setPattern(pattern);

    }


}

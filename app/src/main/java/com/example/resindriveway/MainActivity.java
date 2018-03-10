package com.example.resindriveway;

/**
 * Created by mustafaflexwala on 10/03/18.
 */

import android.view.View;


public class MainActivity {


    private DrawingView drawView;


    protected void onCreate() {

//        drawView = (DrawingView)findViewById(R.id.drawing);

    }

    public void paintClicked(View view){
            //set pattern

        String pattern = view.getTag().toString();
    }

    public void setPattern(String newPattern){
            //set pattern
//        invalidate();
//        int patternID = getResources().getIdentifier(newPattern, "drawable", "com.example.resindriveway");
    }
}

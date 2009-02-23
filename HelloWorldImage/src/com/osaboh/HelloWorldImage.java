package com.osaboh;

import android.app.Activity;
import android.os.Bundle;
//import android.widget.ImageView;

public class HelloWorldImage extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//		画像表示をコードで行う｡
//        ImageView HelloWorldImageView = new ImageView(this);
//        HelloWorldImageView.setImageResource(R.drawable.tux);
//        setContentView(HelloWorldImageView);
//		画像表示を XML で行う｡
        setContentView(R.layout.main);
    }
}
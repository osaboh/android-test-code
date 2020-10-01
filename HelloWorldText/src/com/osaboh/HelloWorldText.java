package com.osaboh;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloWorldText extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TextView のインスタンスを生成。インスタンスには Context オブジェクトを渡す。
        // 以下の順で継承しているので HelloWorldText である this を渡す。
        // Context <- ApplicationContext <- Activity <- HelloWorldText
        // Create a TextView instance. In this instance, we pass a Context object.
        // Pass this, which is a HelloWorldText, since it inherits in the following order.
        // Context <- ApplicationContext <- Activity <- HelloWorldText
        TextView HelloWorldTextView = new TextView(this);
        // 文字列を渡す。
        //passing the string "HelloWorld" to the textview instance
        HelloWorldTextView.setText("HelloWorld");
        //　文字列を表示する。
        //displaying the string in the app 
        setContentView(HelloWorldTextView);
    }
}

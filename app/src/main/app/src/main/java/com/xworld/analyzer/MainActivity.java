package com.xworld.analyzer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("XWORLD BUILD ANALYZER\n\nUng dung da khoi dong!");
        text.setTextSize(22);
        text.setPadding(30, 50, 30, 30);

        setContentView(text);
    }
}

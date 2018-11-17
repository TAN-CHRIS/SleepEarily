package com.example.chris.sleepearily;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView =findViewById(R.id.textView);

        Typeface typeFace =Typeface.createFromAsset(getAssets(),"font/HanYiYanKaiW-2.ttf");
        textView.setTypeface(typeFace,typeFace.BOLD_ITALIC);

    }

    public void GoToMainNavi(View view){
        Intent intent = new Intent(this, MainNaviActivity.class);
        startActivity(intent);
    }
}

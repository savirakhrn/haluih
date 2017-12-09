package com.example.ranisavira.gayradar;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ranisavira.haluih.R;

public class sign extends AppCompatActivity {
    Button sign_in;
    Button sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        onClick();
    }

    private void onClick() {
        sign_in = (Button) findViewById(R.id.btn1);
        sign_up = (Button) findViewById(R.id.btn2);

        sign_in.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                Intent i = new Intent(sign.this, sign_in.class);
                startActivity(i);
            }
        });
        sign_up = (Button) findViewById(R.id.btn2);
        sign_up.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View view) {

                Intent v = new Intent(sign.this, sign_up.class);
                startActivity(v);
            }
        });
    }
}

package com.app.chaerrull.geraiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.app.chaerrull.geraiq.provider.indosat;
import com.app.chaerrull.geraiq.provider.smartfren;
import com.app.chaerrull.geraiq.provider.telkomsel;
import com.app.chaerrull.geraiq.provider.tri;
import com.app.chaerrull.geraiq.provider.xl;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "chaerrull";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void telkomsel(View view) {
        Intent telkom = new Intent(this, telkomsel.class);
        startActivity(telkom);
    }
    public void indosat(View view) {
        Intent isat = new Intent(this, indosat.class);
        startActivity(isat);
    }
    public void xl(View view) {
        Intent xl = new Intent(this, xl.class);
        startActivity(xl);
    }
    public void tri(View view) {
        Intent tri = new Intent(this, tri.class);
        startActivity(tri);
    }
    public void smartfren(View view) {
        Intent smart = new Intent(this, smartfren.class);
        startActivity(smart);
    }

}
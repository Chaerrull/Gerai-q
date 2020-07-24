package com.app.chaerrull.geraiq;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.app.chaerrull.geraiq.model.Requests;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class detail extends AppCompatActivity {
    private static final String TAG = "chaerul";
    private DatabaseReference database;

    private TextView etNama, etAlamat, etWeb;
    private ProgressDialog loading;
    private Button btn_cancel, btn_save;

    private String sPid, sPnama, sPalamat, sPweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setTitle("Detail Gerai");

        database = FirebaseDatabase.getInstance().getReference();

        sPid = getIntent().getStringExtra("id");
        sPnama = getIntent().getStringExtra("Nama");
        sPalamat = getIntent().getStringExtra("Alamat");
        sPweb = getIntent().getStringExtra("Web");

        etNama = findViewById(R.id.et_name);
        etAlamat = findViewById(R.id.et_alamat);
        etWeb = findViewById(R.id.et_web);

        etNama.setText(sPnama);
        etAlamat.setText(sPalamat);
        etWeb.setText(sPweb);





    }



}
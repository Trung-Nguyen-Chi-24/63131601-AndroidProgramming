package trung.edu.luyentap5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activitycau1 extends AppCompatActivity {

    EditText edtso1;
    EditText edtso2;
    EditText edtketqua;
    Button nutCong, nutTru, nutNhan, nutChia;

    void TimDieuKhien() {
        edtso1 = (EditText) findViewById(R.id.edtSo1);
        edtso2 = (EditText) findViewById(R.id.edtSo2);
        edtketqua = (EditText) findViewById(R.id.edtKQ);
        nutCong = (Button) findViewById(R.id.btntinhtong);
        nutTru = (Button) findViewById(R.id.btntru);
        nutNhan = (Button) findViewById(R.id.btnnhan);
        nutChia = (Button) findViewById(R.id.btnchia);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_activitycau1);
        TimDieuKhien();
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyCong();
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyTru();
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyNhan();
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyChia();
            }
        });
    }
        void XuLyCong () {
            String So1 = edtso1.getText().toString();
            String So2 = edtso2.getText().toString();
            float Sothu1 = Float.parseFloat(So1);
            float Sothu2 = Float.parseFloat(So2);
            float tong = Sothu1 + Sothu2;
            String ChuoiKQ = String.valueOf(tong);
            edtketqua.setText(ChuoiKQ);
        }
    void XuLyTru () {
        String So1 = edtso1.getText().toString();
        String So2 = edtso2.getText().toString();
        float Sothu1 = Float.parseFloat(So1);
        float Sothu2 = Float.parseFloat(So2);
        float tong = Sothu1 - Sothu2;
        String ChuoiKQ = String.valueOf(tong);
        edtketqua.setText(ChuoiKQ);
    }
    void XuLyNhan () {
        String So1 = edtso1.getText().toString();
        String So2 = edtso2.getText().toString();
        float Sothu1 = Float.parseFloat(So1);
        float Sothu2 = Float.parseFloat(So2);
        float tong = Sothu1 * Sothu2;
        String ChuoiKQ = String.valueOf(tong);
        edtketqua.setText(ChuoiKQ);
    }
    void XuLyChia () {
        String So1 = edtso1.getText().toString();
        String So2 = edtso2.getText().toString();
        float Sothu1 = Float.parseFloat(So1);
        float Sothu2 = Float.parseFloat(So2);
        float tong = Sothu1 / Sothu2;
        String ChuoiKQ = String.valueOf(tong);
        edtketqua.setText(ChuoiKQ);
    }
    }


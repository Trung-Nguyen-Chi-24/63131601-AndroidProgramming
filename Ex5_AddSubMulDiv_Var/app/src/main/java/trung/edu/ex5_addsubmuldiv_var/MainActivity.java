package trung.edu.ex5_addsubmuldiv_var;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // khai báo các đối tượng gắn với các điều khiển (view) cần thao tác
    EditText edtSoA, edtSoB;
    Button btnCong, btnTru, btnNhan, btnChia;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Tìm view
        TimView();
          // gắn các bộ lắng nghe
        btnCong.setOnClickListener(boLangNghe_XuLyCong);
        btnTru.setOnClickListener(boLangNghe_XuLyTru);
        btnNhan.setOnClickListener(boLangNghe_XuLyNhan);
        btnChia.setOnClickListener(boLangNghe_XuLyChia);
    }

    // code xử lý cộng ở đây
    View.OnClickListener boLangNghe_XuLyCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            double soA = Double.parseDouble(edtSoA.getText().toString());
            double soB = Double.parseDouble(edtSoB.getText().toString());
            double ketQua = soA + soB;
            tvKetQua.setText(String.valueOf(ketQua));
        }
    };

    //xử lý bộ lắng nghe trừ
    View.OnClickListener boLangNghe_XuLyTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            double soA = Double.parseDouble(edtSoA.getText().toString());
            double soB = Double.parseDouble(edtSoB.getText().toString());
            double ketQua = soA - soB;
            tvKetQua.setText(String.valueOf(ketQua));
        }
    };

    // Bộ lắng nghe nhân
    View.OnClickListener boLangNghe_XuLyNhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            double soA = Double.parseDouble(edtSoA.getText().toString());
            double soB = Double.parseDouble(edtSoB.getText().toString());
            double ketQua = soA * soB;
            tvKetQua.setText(String.valueOf(ketQua));
        }
    };

    // Bộ lắng nghe chia
    View.OnClickListener boLangNghe_XuLyChia = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            double soA = Double.parseDouble(edtSoA.getText().toString());
            double soB = Double.parseDouble(edtSoB.getText().toString());
            if (soB != 0) {
                double ketQua = soA / soB;
                tvKetQua.setText(String.valueOf(ketQua));
            } else {
                tvKetQua.setText("Lỗi");
            }
        }
    };

    // tìm view
    void TimView() {
        edtSoA = findViewById(R.id.edtSo1);
        edtSoB = findViewById(R.id.edtSo2);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        tvKetQua = findViewById(R.id.edtKetQua);
    }
}

package trung.edu.text;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvA, tvB;
    EditText edtKetQua;
    Button btnKiemTra;
    int a, b, kqDung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvA = findViewById(R.id.tvA);
        tvB = findViewById(R.id.tvB);
        edtKetQua = findViewById(R.id.edtKetQua);
        btnKiemTra = findViewById(R.id.btnKiemTra);
        taoSoNgauNhien();
        btnKiemTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kiemTraKetQua();
                taoSoNgauNhien();
            }
        });
    }
    public void taoSoNgauNhien() {
        a = (int) (Math.random()*5);
        b = (int) (Math.random()*5);
        kqDung = a + b;
        tvA.setText(String.valueOf(a));
        tvB.setText(String.valueOf(b));
        edtKetQua.setText("");
    }
    public void kiemTraKetQua() {
        String ketQuaNhap = edtKetQua.getText().toString();
        int kqNguoiDung = Integer.parseInt(ketQuaNhap);
        if (kqNguoiDung == kqDung) {
            Toast.makeText(this, "ket qua dung", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "ket qua sai", Toast.LENGTH_SHORT).show();
        }
    }
}

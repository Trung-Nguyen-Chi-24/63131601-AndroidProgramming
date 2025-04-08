package trung.edu.ontap;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activitychucnang2 extends AppCompatActivity {
    public EditText edtThang, edtNam, edtKetQua;
    public Button btnKT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitychucnang2);

        edtThang = findViewById(R.id.edtThang);
        edtNam = findViewById(R.id.edtNam);
        edtKetQua = findViewById(R.id.edtKQ);
        btnKT = findViewById(R.id.btnKT);

        btnKT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kiemTraThoiGian();
            }
        });
    }
    public void kiemTraThoiGian() {
        String thang = edtThang.getText().toString().trim();
        String nam = edtNam.getText().toString().trim();

        if (thang.isEmpty() || nam.isEmpty()) {
            Toast.makeText(this, "Hãy nhập tháng và năm", Toast.LENGTH_SHORT).show();
            return;
        }

        int thangSo = Integer.parseInt(thang);
        int namSo = Integer.parseInt(nam);

        if (thangSo == 4 && namSo == 1975) {
            edtKetQua.setText("Đúng! 30/4/1975 - Toàn thắng.");
        } else {
            edtKetQua.setText("Sai! Thử lại.");
        }
    }
}

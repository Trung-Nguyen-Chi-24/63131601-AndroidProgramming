package trung.edu.baibmi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edtChieuCao, edtCanNang;
    Button btnTinhBMI;
    TextView txtKetQua;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtChieuCao = findViewById(R.id.edtChieuCao);
        edtCanNang = findViewById(R.id.edtCanNang);
        btnTinhBMI = findViewById(R.id.btnTinhBMI);
        txtKetQua = findViewById(R.id.txtKetQua);

        btnTinhBMI.setOnClickListener(v -> {
            float chieuCao = Float.parseFloat(edtChieuCao.getText().toString());
            float canNang = Float.parseFloat(edtCanNang.getText().toString());
            float bmi = canNang / (chieuCao * chieuCao);

            String[] ketQuaArray = {
                    "Suy dinh dưỡng",
                    "Bình thường",
                    "Thừa cân",
                    "Béo phì cấp 1",
                    "Béo phì cấp 2",
                    "Béo phì cấp 3"
            };

            int index = (bmi < 18.5) ? 0 : (bmi < 25) ? 1 : (bmi < 30) ? 2 : (bmi < 35) ? 3 : (bmi < 40) ? 4 : 5;
            txtKetQua.setText("BMI: " + String.format("%.2f", bmi) + " - " + ketQuaArray[index]);
        });
    }
}

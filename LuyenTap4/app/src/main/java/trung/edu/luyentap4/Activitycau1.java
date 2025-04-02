package trung.edu.luyentap4;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activitycau1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_activitycau1);
    }

    public void XuLyCong(View view) {

        EditText edtso1 = findViewById(R.id.edtSo1);
        EditText edtso2 = findViewById(R.id.edtSo2);
        EditText edtketqua = findViewById(R.id.edtKQ);

        String Sothu1 = edtso1.getText().toString();
        String Sothu2 = edtso2.getText().toString();

        Float SoA = Float.parseFloat(Sothu1);
        Float SoB = Float.parseFloat(Sothu2);
        Float Tong = SoA + SoB;
        String ChuoiKQ = String.valueOf(Tong);
        edtketqua.setText(ChuoiKQ);
    }
}
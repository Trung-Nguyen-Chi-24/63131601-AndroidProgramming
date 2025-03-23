package trung.edu.appcong;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    // lang nghe va xu ly su kien
    public void XuLyCong(View view) {
            // Tìm, tham chiếu đến điều khiển trên tệp XML
      EditText editTextSoA = findViewById(R.id.edtA);
      EditText editTextSoB = findViewById(R.id.edtB);
      EditText editTextKetQua = findViewById(R.id.edtKQ);
      // Lấy dữ liệu về ở điều kiển số a
      String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        // Chuyển dữ liệu sang dạng số
      int soA= Integer.parseInt(strA);
      int soB= Integer.parseInt(strB);

      //Tính toán theo yêu cầu

      int   tong = soA + soB;
      String strTong = String.valueOf(tong);     // chuyển sang dạng chuỗi
      // Hiện ra màn hình
      editTextKetQua.setText(strTong);
    }
}
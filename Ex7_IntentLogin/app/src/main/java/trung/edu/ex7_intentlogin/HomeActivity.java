package trung.edu.ex7_intentlogin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        //  Lấy intent về
        Intent intentTuLoGin = getIntent();
        // Lọc ra dữ liệu chuỗi
        String tenDN_NhanDuoc = intentTuLoGin.getStringExtra("ten_dang_nhap");
        //Gán vào điều khiển
        TextView tvTenDN = (TextView) findViewById(R.id.tvUserName);
        tvTenDN.setText(tenDN_NhanDuoc);
    }
}
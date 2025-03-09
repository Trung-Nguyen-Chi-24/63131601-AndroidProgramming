package trung.edu.ex7_intentlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        Button btnXacNhan = (Button) findViewById(R.id.btnOK);

        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý đăng nhập
                // Lấy dữ liệu
                // B1. TÌm tham chiếu đến đk
                EditText edTenDN = (EditText) findViewById(R.id.edtUsername);
                EditText edPass = (EditText) findViewById(R.id.edtPass);
                // B2. Lấy dữ liệu
                String tenDangNhap = edTenDN.getText().toString();
                String mk = edPass.getText().toString();
                // Kiểm tra mk
                if (tenDangNhap.equals("nguyenchitrung") && mk.equals("123")) // mk đúng
                {
                    Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);
                    // Gói dữ liệu vào iQuiz, dạng key - value: key được dùng để bên kia lọc ra dữ liệu
                    iQuiz.putExtra("ten_dang_nhap",tenDangNhap);
                    iQuiz.putExtra("mk_dang_nhap",mk);
                    // Gửi đi
                    startActivity(iQuiz);
                } else {
                    Toast.makeText(LoginActivity.this, "BẠN NHẬP SAI THÔNG TIN", Toast.LENGTH_LONG);
                }
            }
        });


    }
}
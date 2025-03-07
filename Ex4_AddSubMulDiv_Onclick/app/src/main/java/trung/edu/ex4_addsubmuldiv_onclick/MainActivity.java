package trung.edu.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    // khai báo các đối tượng gắn với điều khiển tương ứng ở đây
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    void TimDieuKhien() {
        editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        editTextKQ = (EditText)findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }

    //Xu ly cong
    void XuLyCong(View v) {
        //Code xử lý cộng ở đây
        //b1. Lấy dữ liệu 2 số
        // b1.1 tìm editText số 1 và số 2
        // b1.2 lấy dữ liệu từ 2 đkhiển đó

    String soThu1= editTextSo1.getText().toString();
        String soThu2= editTextSo2.getText().toString();
        //b1.3 chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        // b2 Tính toán
        float Tong = soA + soB;
        //b3 hiện kết quả
        //b3.1
        // b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //b3.3 gán kết quả lên đk
        editTextKQ.setText(chuoiKQ);

    }
    //Xu ly tru
    void XuLyTru(View v) {
        //Code xử lý cộng ở đây
        //b1. Lấy dữ liệu 2 số
        // b1.1 tìm editText số 1 và số 2

        // b1.2 lấy dữ liệu từ 2 đkhiển đó

        String soThu1= editTextSo1.getText().toString();
        String soThu2= editTextSo2.getText().toString();
        //b1.3 chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        // b2 Tính toán
        float Tong = soA - soB;
        //b3 hiện kết quả
        //b3.1

        // b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //b3.3 gán kết quả lên đk
        editTextKQ.setText(chuoiKQ);

    }
    //Xu ly nhan
    void XuLyNhan(View v) {
        //Code xử lý cộng ở đây
        //b1. Lấy dữ liệu 2 số
        // b1.1 tìm editText số 1 và số 2

        // b1.2 lấy dữ liệu từ 2 đkhiển đó

        String soThu1= editTextSo1.getText().toString();
        String soThu2= editTextSo2.getText().toString();
        //b1.3 chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        // b2 Tính toán
        float Tong = soA * soB;
        //b3 hiện kết quả
        //b3.1

        // b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //b3.3 gán kết quả lên đk
        editTextKQ.setText(chuoiKQ);


    }
    //Xu ly chia
    void XuLyChia(View v) {
        //Code xử lý cộng ở đây
        //b1. Lấy dữ liệu 2 số
        // b1.1 tìm editText số 1 và số 2

        // b1.2 lấy dữ liệu từ 2 đkhiển đó

        String soThu1= editTextSo1.getText().toString();
        String soThu2= editTextSo2.getText().toString();
        //b1.3 chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        // b2 Tính toán
        float Tong = soA / soB;
        //b3 hiện kết quả
        //b3.1

        // b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //b3.3 gán kết quả lên đk
        editTextKQ.setText(chuoiKQ);


    }
}
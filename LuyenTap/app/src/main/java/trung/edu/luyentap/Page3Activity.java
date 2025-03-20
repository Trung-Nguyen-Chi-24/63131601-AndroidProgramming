package trung.edu.luyentap;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Page3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page3);

        Button boncongau = findViewById(R.id.btnbongau);
        Button haicongau = findViewById(R.id.btnhaigau);
        Button motcongau = findViewById(R.id.btnmotgau);
        Button saucongau = findViewById(R.id.btnsaugau);

        boncongau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Page3Activity.this, "Bạn chọn sai rồi, hãy chọn lại", Toast.LENGTH_SHORT).show();
            }
        });
        haicongau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Page3Activity.this, "Bạn chọn sai rồi, hãy chọn lại", Toast.LENGTH_SHORT).show();
            }
        });
        motcongau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Page3Activity.this, "Bạn chọn sai rồi, hãy chọn lại", Toast.LENGTH_SHORT).show();
            }
        });
        saucongau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Page3Activity.this, "Bạn chọn đúng rồi, xin chúc mừng", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
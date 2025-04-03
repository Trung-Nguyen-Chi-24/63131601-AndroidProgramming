package trung.edu.luyentap5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btncau1 = findViewById(R.id.btn1);
        Button btncau2 = findViewById(R.id.btn2);
        Button btncau4 = findViewById(R.id.btn4);

        btncau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Trang1 = new Intent(MainActivity.this, Activitycau1.class);
                startActivity(Trang1);
            }
        });
        btncau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Trang2 = new Intent(MainActivity.this, Activitycau2.class);
                startActivity(Trang2);
            }
        });
        btncau4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Trang4 = new Intent(MainActivity.this, Activitycau4.class);
                startActivity(Trang4);
            }
        });
    }
}
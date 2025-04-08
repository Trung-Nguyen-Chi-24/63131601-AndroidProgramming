package trung.edu.ontap;

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
        Button chucnang1 = findViewById(R.id.button2);
        Button chucnang2 = findViewById(R.id.button3);
        Button chucnang3 = findViewById(R.id.button4);
        Button aboutme = findViewById(R.id.button5);
        chucnang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Chuyenpage2 = new Intent(MainActivity.this, Activitychucnang2.class);
                startActivity(Chuyenpage2);
            }
        });
        chucnang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Chuyenpage3 = new Intent(MainActivity.this, Activitychucnang3.class);
                startActivity(Chuyenpage3);
            }
        });
        chucnang3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Chuyenpage4 = new Intent(MainActivity.this, Activitychucnang4.class);
                startActivity(Chuyenpage4);
            }
        });
        aboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pageaboutme = new Intent(MainActivity.this, Aboutme.class);
                startActivity(pageaboutme);
            }
        });
    }
}
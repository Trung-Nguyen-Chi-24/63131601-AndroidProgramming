package trung.edu.luyentap4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button nutso1 = findViewById(R.id.btncau1);
        Button nutso2 = findViewById(R.id.btncau2);
        Button nutso4 = findViewById(R.id.btncau4);

        nutso1.setOnClickListener(v -> {
            Intent page1 = new Intent(MainActivity.this, Activitycau1.class);
            startActivity(page1);
        });

        nutso2.setOnClickListener(v -> {
            Intent page2 = new Intent(MainActivity.this, Activitycau2.class);
            startActivity(page2);
        });
        nutso4.setOnClickListener(v -> {
            Intent page4 = new Intent(MainActivity.this, Activitycau4.class);
            startActivity(page4);
        });
    }
}
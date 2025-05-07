package trung.edu.doitientebtl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageButton btnUS, btnChina, btnKorea, btnUK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnUS = findViewById(R.id.btnUS);
        btnChina = findViewById(R.id.btnChina);
        btnKorea = findViewById(R.id.btnKorea);
        btnUK = findViewById(R.id.btnUK);

        btnUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCurrencyActivity("US");
            }
        });

        btnChina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCurrencyActivity("China");
            }
        });

        btnKorea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCurrencyActivity("Korea");
            }
        });

        btnUK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCurrencyActivity("UK");
            }
        });
    }

    private void openCurrencyActivity(String country) {
        Intent intent = new Intent(MainActivity.this, TienteActivity.class);
        intent.putExtra("country", country);
        startActivity(intent);
    }
}

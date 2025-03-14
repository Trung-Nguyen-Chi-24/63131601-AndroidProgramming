package trung.edu.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSayHi = findViewById(R.id.btnSayHi);
        Button btnXinChao = findViewById(R.id.btnXinChao);

        btnSayHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnXinChao.setVisibility(View.VISIBLE);
            }
        });
    }
}

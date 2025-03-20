package trung.edu.luyentap;

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

        Button btnenglish = findViewById(R.id.btn123);

        btnenglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sangpage2 = new Intent(MainActivity.this, Page2Activity.class);
                startActivity(sangpage2);
            }
        });
    }
}
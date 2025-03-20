package trung.edu.luyentap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Page2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page2);

        Button count123 = findViewById(R.id.btn123);
        Button match = findViewById(R.id.btnMatch);

        count123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sangPage3 = new Intent(Page2Activity.this, Page3Activity.class);
                startActivity(sangPage3);
            }
        });
        match.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sangPage4 = new Intent(Page2Activity.this, Page4Activity.class);
                startActivity(sangPage4);
            }
        });
    }
}
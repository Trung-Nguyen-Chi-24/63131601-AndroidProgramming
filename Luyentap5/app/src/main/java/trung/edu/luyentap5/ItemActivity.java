package trung.edu.luyentap5;

import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ItemActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_item);

        textView = findViewById(R.id.textView);
        String NhanItem = getIntent().getStringExtra("selectedItem");
        textView.setText(NhanItem);
    }
}

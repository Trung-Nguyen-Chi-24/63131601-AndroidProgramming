package trung.edu.bailistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewNNLT;
    ArrayList<String> dsNgonNguLT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listViewNNLT = (ListView) findViewById(R.id.lvNNLT);

        dsNgonNguLT = new ArrayList<>();
        dsNgonNguLT.add("Python");
        dsNgonNguLT.add("PHP");
        dsNgonNguLT.add("Java");
        dsNgonNguLT.add("C");
        dsNgonNguLT.add("C++");

        ArrayAdapter<String> adapterNNLT = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, // Sửa lại loại layout cho ListView
                dsNgonNguLT
        );

        listViewNNLT.setAdapter(adapterNNLT);

        listViewNNLT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String giaTriDuocChon = dsNgonNguLT.get(position);
                Toast.makeText(MainActivity.this, "giaTriDuocChon", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

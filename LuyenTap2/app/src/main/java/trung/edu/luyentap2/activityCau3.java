package trung.edu.luyentap2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class activityCau3 extends AppCompatActivity {

    ListView listviewNC;
    ArrayAdapter<String> adapter;
    ArrayList<String> itemlistnc = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau3);

        listviewNC = findViewById(R.id.listviewNC);
        themDuLieu();

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemlistnc);
        listviewNC.setAdapter(adapter);

        // Bắt sự kiện click vào từng item trong ListView
        listviewNC.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = itemlistnc.get(position);

                if (selectedItem.equals("Java")) {
                    Toast.makeText(activityCau3.this, "Java đang hoạt động", Toast.LENGTH_SHORT).show();
                } else if (selectedItem.equals("C")) {
                    Toast.makeText(activityCau3.this, "C đang hoạt động", Toast.LENGTH_SHORT).show();
                } else if (selectedItem.equals("C++")) {
                    Toast.makeText(activityCau3.this, "C++ đang hoạt động", Toast.LENGTH_SHORT).show();
                } else if (selectedItem.equals("Python")) {
                    Toast.makeText(activityCau3.this, "Python đang hoạt động", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void themDuLieu() {
        itemlistnc.add("Java");
        itemlistnc.add("C");
        itemlistnc.add("C++");
        itemlistnc.add("Python");
    }
}

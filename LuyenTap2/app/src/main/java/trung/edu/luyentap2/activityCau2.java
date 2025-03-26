package trung.edu.luyentap2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class activityCau2 extends AppCompatActivity {

    ListView listview;
    ArrayAdapter<String> adapter;
    ArrayList<String> itemlist; // Không khởi tạo ngay tại đây

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2);

        listview = findViewById(R.id.listview);

        // Khởi tạo danh sách trước khi gán vào adapter
        itemlist = new ArrayList<>();
        itemlist.add("Số 1");
        itemlist.add("Số 2");
        itemlist.add("Số 3");
        itemlist.add("Số 4");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemlist);
        listview.setAdapter(adapter);
    }
}
